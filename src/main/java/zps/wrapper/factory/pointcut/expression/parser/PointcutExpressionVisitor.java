package zps.wrapper.factory.pointcut.expression.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PointcutExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface PointcutExpressionVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link PointcutExpressionParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpression(PointcutExpressionParser.ExpressionContext ctx);

    /**
     * Visit a parse tree produced by {@link PointcutExpressionParser#returnType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReturnType(PointcutExpressionParser.ReturnTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link PointcutExpressionParser#targetType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTargetType(PointcutExpressionParser.TargetTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link PointcutExpressionParser#methodName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMethodName(PointcutExpressionParser.MethodNameContext ctx);

    /**
     * Visit a parse tree produced by {@link PointcutExpressionParser#parameterTypeList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParameterTypeList(PointcutExpressionParser.ParameterTypeListContext ctx);

    /**
     * Visit a parse tree produced by {@link PointcutExpressionParser#parameterType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParameterType(PointcutExpressionParser.ParameterTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link PointcutExpressionParser#referenceType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReferenceType(PointcutExpressionParser.ReferenceTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link PointcutExpressionParser#voidType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVoidType(PointcutExpressionParser.VoidTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link PointcutExpressionParser#primitiveType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrimitiveType(PointcutExpressionParser.PrimitiveTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link PointcutExpressionParser#arraySuffix}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArraySuffix(PointcutExpressionParser.ArraySuffixContext ctx);

    /**
     * Visit a parse tree produced by {@link PointcutExpressionParser#arrayType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArrayType(PointcutExpressionParser.ArrayTypeContext ctx);
}