package test;

import zps.wrapper.factory.Advice;
import zps.wrapper.factory.WrapperFactory;
import zps.wrapper.factory.pointcut.expression.parser.PointcutExpressionParser;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        String expression = "void test.Main.Target_1.run()";

        Advice advice = intercepted -> {

            System.out.println("Around " + intercepted.getMethod());

            return null;
        };

        WrapperFactory wrapperFactory = new WrapperFactory(advice, PointcutExpressionParser.parse(expression));

        Target_1 target_1 = new Target_1();

        Target_2 target_2 = new Target_2();

        wrapperFactory.wrap(target_1).run();

        wrapperFactory.wrap(target_2).run();

    }

    public static class Target_1 implements Runnable {

        @Override
        public void run() {
            System.out.println("Target_1.run");
        }
    }

    public static class Target_2  implements Runnable {

        @Override
        public void run() {
            System.out.println("Target_2.run");
        }
    }
}