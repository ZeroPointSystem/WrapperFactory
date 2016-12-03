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

        boolean isSuccess = true;

        if (isRequireMethodNameCheck) {
            isSuccess = method
                    .getName()
                    .equals(methodName);
        }

        if (isSuccess && isRequireReturnTypeCheck) {
            isSuccess = method
                    .getReturnType()
                    .getCanonicalName()
                    .equals(returnTypeName);
        }

        if (isSuccess && isRequireTargetTypeCheck) {
            isSuccess = method
                    .getDeclaringClass()
                    .getCanonicalName()
                    .equals(targetTypeName);
        }

        if (isSuccess && isRequireParameterTypeNamesCheck) {

            int parameterTypeNameLength = parameterTypeNames.length;

            if (parameterTypeNameLength == method.getParameterCount()) {

                Class<?>[] methodParameterTypes = method.getParameterTypes();

                for (int i = 0; i < parameterTypeNameLength; i++) {
                    if (isSuccess) {
                        String parameterTypeName = parameterTypeNames[i];
                        isSuccess = parameterTypeName.equals("*") || parameterTypeName.equals(methodParameterTypes[i].getCanonicalName());
                    } else
                        break;
                }
            } else
                isSuccess = false;
        }

        return isSuccess;
    }

    @Override
    public String toString() {
        return returnTypeName + " " + targetTypeName + "." + methodName + Arrays.toString(parameterTypeNames);
    }
}
