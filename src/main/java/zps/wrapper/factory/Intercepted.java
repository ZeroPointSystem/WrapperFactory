package zps.wrapper.factory;

import java.lang.reflect.Method;

public interface Intercepted {
    Object[] getArgs();
    Method interceptedMethod();
    Object proceed(Object...args) throws Throwable;
}
