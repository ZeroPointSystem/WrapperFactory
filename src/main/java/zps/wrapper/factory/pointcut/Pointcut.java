package zps.wrapper.factory.pointcut;

import java.lang.reflect.Method;
import java.util.Arrays;

public final class Pointcut {

    private final String returnTypeName;
    private final String targetTypeName;
    private final String methodName;
    private final String[] parameterTypeNames;

    private final boolean isRequireReturnTypeCheck;
    private final boolean isRequireTargetTypeCheck;
    private final boolean isRequireMethodNameCheck;
    private final boolean isRequireParameterTypeNamesCheck;

    public Pointcut(String returnTypeName, String targetTypeName, String methodName, String[] parameterTypeNames) {

        this.returnTypeName = returnTypeName;

        isRequireReturnTypeCheck = !returnTypeName.equals("*");

        this.targetTypeName = targetTypeName;

        isRequireTargetTypeCheck = !targetTypeName.equals("*");

        this.methodName = methodName;

        isRequireMethodNameCheck = !methodName.equals("*");

        this.parameterTypeNames = parameterTypeNames;

        int parameterTypeNamesLength = parameterTypeNames.length;

        if (parameterTypeNamesLength == 1) {
            isRequireParameterTypeNamesCheck = !parameterTypeNames[0].equals("..");
        } else {
            isRequireParameterTypeNamesCheck = true;
        }
    }

    public boolean check(Method method) {

        boolean success = true;

        if (isRequireReturnTypeCheck) {
            success = method
                    .getReturnType()
                    .getTypeName()
                    .equals(returnTypeName);
        }

        if (success && isRequireTargetTypeCheck) {
            success = method
                    .getDeclaringClass()
                    .getTypeName()
                    .equals(targetTypeName);
        }

        if (success && isRequireMethodNameCheck) {
            success = method
                    .getName()
                    .equals(methodName);
        }

        if (success && isRequireParameterTypeNamesCheck) {

            int parameterTypeNameLength = parameterTypeNames.length;

            if (parameterTypeNameLength == method.getParameterCount()) {

                String[] methodParameterTypeNames = Arrays.stream(method.getParameterTypes()).map(Class::getTypeName).toArray(String[]::new);

                for (int i = 0; i < parameterTypeNameLength; i++) {
                    if (success) {
                        String parameterTypeName = parameterTypeNames[i];
                        success = parameterTypeName.equals("*") || parameterTypeName.equals(methodParameterTypeNames[i]);
                    } else
                        break;
                }
            } else
                success = false;
        }

        return success;
    }

    @Override
    public String toString() {
        return returnTypeName + " " + targetTypeName + "." + methodName + Arrays.toString(parameterTypeNames);
    }
}
