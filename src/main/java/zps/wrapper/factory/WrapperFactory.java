package zps.wrapper.factory;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;
import zps.wrapper.factory.pointcut.Pointcut;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public final class WrapperFactory {

    private final Advice advice;
    private final Pointcut pointcut;

    public WrapperFactory(Advice advice, Pointcut pointcut) {
        this.advice = advice;
        this.pointcut = pointcut;
    }

    @SuppressWarnings("unchecked")
    public <T> T wrap(T target) {
        return ((T) Enhancer.create(target.getClass(), target.getClass().getInterfaces(), prepareHandler(target, advice, pointcut)));
    }

    private static InvocationHandler prepareHandler(Object target, Advice advice, Pointcut pointcut) {

        Map<Method, MethodHandle> methodHandles = collectHandles(target);

        return (wrapper, method, originArgs) -> {
            if (pointcut.check(method)) {

                // before

                Object result = advice.advise(implement(method, methodHandles.get(method), originArgs)); // around

                // after

                return result;

            } else {
                return methodHandles
                        .get(method)
                        .invokeWithArguments(originArgs);
            }
        };
    }

    private static Map<Method, MethodHandle> collectHandles(Object target) {

        MethodHandles.Lookup publicLookup = MethodHandles.publicLookup();

        return Arrays.stream(target.getClass().getMethods()) // stream of public API
                .filter(method -> !Modifier.isStatic(method.getModifiers())) // filter all statics
                .map(method -> {
                    try {
                        return new AbstractMap.SimpleEntry<>(method, publicLookup.unreflect(method).bindTo(target));
                    } catch (IllegalAccessException ignored) {
                        throw new RuntimeException("Cannot find with unreflect: " + method);
                    }
                }).collect(Collectors.toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue));
    }

    private static Intercepted implement(Method reflection, MethodHandle targetHandle, Object[] originArgs) {
        return new Intercepted() {
            @Override
            public Object[] getArgs() {
                return originArgs;
            }

            @Override
            public Method getMethod() {
                return reflection;
            }

            @Override
            public Object proceed(Object... aroundArgs) throws Throwable {
                if (aroundArgs.length != 0) {
                    return targetHandle.invokeWithArguments(aroundArgs);
                } else
                    return targetHandle.invokeWithArguments(originArgs);
            }
        };
    }


}
