package zps.wrapper.factory.pointcut.expression.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PointcutExpressionParser}.
 */
public interface PointcutExpressionListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link PointcutExpressionParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterExpression(PointcutExpressionParser.ExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link PointcutExpressionParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitExpression(PointcutExpressionParser.ExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link PointcutExpressionParser#returnType}.
     *
     * @param ctx the parse tree
     */
    void enterReturnType(PointcutExpressionParser.ReturnTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link PointcutExpressionParser#returnType}.
     *
     * @param ctx the parse tree
     */
    void exitReturnType(PointcutExpressionParser.ReturnTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link PointcutExpressionParser#targetType}.
     *
     * @param ctx the parse tree
     */
    void enterTargetType(PointcutExpressionParser.TargetTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link PointcutExpressionParser#targetType}.
     *
     * @param ctx the parse tree
     */
    void exitTargetType(PointcutExpressionParser.TargetTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link PointcutExpressionParser#methodName}.
     *
     * @param ctx the parse tree
     */
    void enterMethodName(PointcutExpressionParser.MethodNameContext ctx);

    /**
     * Exit a parse tree produced by {@link PointcutExpressionParser#methodName}.
     *
     * @param ctx the parse tree
     */
    void exitMethodName(PointcutExpressionParser.MethodNameContext ctx);

    /**
     * Enter a parse tree produced by {@link PointcutExpressionParser#parameterTypeList}.
     *
     * @param ctx the parse tree
     */
    void enterParameterTypeList(PointcutExpressionParser.ParameterTypeListContext ctx);

    /**
     * Exit a parse tree produced by {@link PointcutExpressionParser#parameterTypeList}.
     *
     * @param ctx the parse tree
     */
    void exitParameterTypeList(PointcutExpressionParser.ParameterTypeListContext ctx);

    /**
     * Enter a parse tree produced by {@link PointcutExpressionParser#parameterType}.
     *
     * @param ctx the parse tree
     */
    void enterParameterType(PointcutExpressionParser.ParameterTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link PointcutExpressionParser#parameterType}.
     *
     * @param ctx the parse tree
     */
    void exitParameterType(PointcutExpressionParser.ParameterTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link PointcutExpressionParser#referenceType}.
     *
     * @param ctx the parse tree
     */
    void enterReferenceType(PointcutExpressionParser.ReferenceTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link PointcutExpressionParser#referenceType}.
     *
     * @param ctx the parse tree
     */
    void exitReferenceType(PointcutExpressionParser.ReferenceTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link PointcutExpressionParser#voidType}.
     *
     * @param ctx the parse tree
     */
    void enterVoidType(PointcutExpressionParser.VoidTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link PointcutExpressionParser#voidType}.
     *
     * @param ctx the parse tree
     */
    void exitVoidType(PointcutExpressionParser.VoidTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link PointcutExpressionParser#primitiveType}.
     *
     * @param ctx the parse tree
     */
    void enterPrimitiveType(PointcutExpressionParser.PrimitiveTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link PointcutExpressionParser#primitiveType}.
     *
     * @param ctx the parse tree
     */
    void exitPrimitiveType(PointcutExpressionParser.PrimitiveTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link PointcutExpressionParser#arraySuffix}.
     *
     * @param ctx the parse tree
     */
    void enterArraySuffix(PointcutExpressionParser.ArraySuffixContext ctx);

    /**
     * Exit a parse tree produced by {@link PointcutExpressionParser#arraySuffix}.
     *
     * @param ctx the parse tree
     */
    void exitArraySuffix(PointcutExpressionParser.ArraySuffixContext ctx);

    /**
     * Enter a parse tree produced by {@link PointcutExpressionParser#arrayType}.
     *
     * @param ctx the parse tree
     */
    void enterArrayType(PointcutExpressionParser.ArrayTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link PointcutExpressionParser#arrayType}.
     *
     * @param ctx the parse tree
     */
    void exitArrayType(PointcutExpressionParser.ArrayTypeContext ctx);
}