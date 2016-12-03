package test;

import zps.wrapper.factory.Advice;
import zps.wrapper.factory.WrapperFactory;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();

        Advice advice = intercepted -> intercepted.proceed("Fuck!");

        main = WrapperFactory.wrap(main, advice, "void test.Main.intercepted(java.lang.String)");

        main.intercepted("Hello!");
    }

    public void intercepted(String message) {
        System.out.println(message);
    }
}
