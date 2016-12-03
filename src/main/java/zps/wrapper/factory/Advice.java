package zps.wrapper.factory;

public interface Advice {
    Object advise(Intercepted intercepted) throws Throwable;
}
