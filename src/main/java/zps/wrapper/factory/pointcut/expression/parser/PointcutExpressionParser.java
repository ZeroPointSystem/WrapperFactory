package zps.wrapper.factory.pointcut.expression.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import zps.wrapper.factory.pointcut.Pointcut;
import zps.wrapper.factory.pointcut.expression.PointcutExpressionSyntaxException;
import zps.wrapper.factory.pointcut.expression.lexer.PointcutExpressionLexer;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public final class PointcutExpressionParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            Identifier = 10, LBRACK = 11, RBRACK = 12, LPAREN = 13, RPAREN = 14, ASTERISK = 15,
            DOT = 16, COMMA = 17, WS = 18;
    public static final int
            RULE_expression = 0, RULE_returnType = 1, RULE_targetType = 2, RULE_methodName = 3,
            RULE_parameterTypeList = 4, RULE_parameterType = 5, RULE_referenceType = 6,
            RULE_voidType = 7, RULE_primitiveType = 8, RULE_arraySuffix = 9, RULE_arrayType = 10;
    public static final String[] ruleNames = {
            "expression", "returnType", "targetType", "methodName", "parameterTypeList",
            "parameterType", "referenceType", "voidType", "primitiveType", "arraySuffix",
            "arrayType"
    };

    private static final String[] _LITERAL_NAMES = {
            null, "'void'", "'byte'", "'short'", "'char'", "'int'", "'long'", "'double'",
            "'float'", "'boolean'", null, "'['", "']'", "'('", "')'", "'*'", "'.'",
            "','"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, null, null, "Identifier",
            "LBRACK", "RBRACK", "LPAREN", "RPAREN", "ASTERISK", "DOT", "COMMA", "WS"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "PointcutExpression.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    private PointcutExpressionParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class ExpressionContext extends ParserRuleContext {
        public ReturnTypeContext returnType() {
            return getRuleContext(ReturnTypeContext.class, 0);
        }

        public TargetTypeContext targetType() {
            return getRuleContext(TargetTypeContext.class, 0);
        }

        public TerminalNode DOT() {
            return getToken(PointcutExpressionParser.DOT, 0);
        }

        public MethodNameContext methodName() {
            return getRuleContext(MethodNameContext.class, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(PointcutExpressionParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(PointcutExpressionParser.RPAREN, 0);
        }

        public ParameterTypeListContext parameterTypeList() {
            return getRuleContext(ParameterTypeListContext.class, 0);
        }

        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PointcutExpressionListener)
                ((PointcutExpressionListener) listener).enterExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PointcutExpressionListener)
                ((PointcutExpressionListener) listener).exitExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PointcutExpressionVisitor)
                return ((PointcutExpressionVisitor<? extends T>) visitor).visitExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExpressionContext expression() throws RecognitionException {
        ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_expression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(22);
                returnType();
                setState(23);
                targetType();
                setState(24);
                match(DOT);
                setState(25);
                methodName();
                setState(26);
                match(LPAREN);
                setState(28);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << Identifier) | (1L << ASTERISK) | (1L << DOT))) != 0)) {
                    {
                        setState(27);
                        parameterTypeList();
                    }
                }

                setState(30);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ReturnTypeContext extends ParserRuleContext {
        public VoidTypeContext voidType() {
            return getRuleContext(VoidTypeContext.class, 0);
        }

        public ReferenceTypeContext referenceType() {
            return getRuleContext(ReferenceTypeContext.class, 0);
        }

        public PrimitiveTypeContext primitiveType() {
            return getRuleContext(PrimitiveTypeContext.class, 0);
        }

        public ArrayTypeContext arrayType() {
            return getRuleContext(ArrayTypeContext.class, 0);
        }

        public TerminalNode ASTERISK() {
            return getToken(PointcutExpressionParser.ASTERISK, 0);
        }

        public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_returnType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PointcutExpressionListener)
                ((PointcutExpressionListener) listener).enterReturnType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PointcutExpressionListener)
                ((PointcutExpressionListener) listener).exitReturnType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PointcutExpressionVisitor)
                return ((PointcutExpressionVisitor<? extends T>) visitor).visitReturnType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ReturnTypeContext returnType() throws RecognitionException {
        ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_returnType);
        try {
            setState(37);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(32);
                    voidType();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(33);
                    referenceType();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(34);
                    primitiveType();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(35);
                    arrayType();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(36);
                    match(ASTERISK);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TargetTypeContext extends ParserRuleContext {
        public ReferenceTypeContext referenceType() {
            return getRuleContext(ReferenceTypeContext.class, 0);
        }

        public TerminalNode ASTERISK() {
            return getToken(PointcutExpressionParser.ASTERISK, 0);
        }

        public TargetTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_targetType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PointcutExpressionListener)
                ((PointcutExpressionListener) listener).enterTargetType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PointcutExpressionListener)
                ((PointcutExpressionListener) listener).exitTargetType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PointcutExpressionVisitor)
                return ((PointcutExpressionVisitor<? extends T>) visitor).visitTargetType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TargetTypeContext targetType() throws RecognitionException {
        TargetTypeContext _localctx = new TargetTypeContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_targetType);
        try {
            setState(41);
            switch (_input.LA(1)) {
                case Identifier:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(39);
                    referenceType();
                }
                break;
                case ASTERISK:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(40);
                    match(ASTERISK);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MethodNameContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(PointcutExpressionParser.Identifier, 0);
        }

        public TerminalNode ASTERISK() {
            return getToken(PointcutExpressionParser.ASTERISK, 0);
        }

        public MethodNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PointcutExpressionListener)
                ((PointcutExpressionListener) listener).enterMethodName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PointcutExpressionListener)
                ((PointcutExpressionListener) listener).exitMethodName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PointcutExpressionVisitor)
                return ((PointcutExpressionVisitor<? extends T>) visitor).visitMethodName(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MethodNameContext methodName() throws RecognitionException {
        MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_methodName);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(43);
                _la = _input.LA(1);
                if (!(_la == Identifier || _la == ASTERISK)) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ParameterTypeListContext extends ParserRuleContext {
        public List<ParameterTypeContext> parameterType() {
            return getRuleContexts(ParameterTypeContext.class);
        }

        public ParameterTypeContext parameterType(int i) {
            return getRuleContext(ParameterTypeContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(PointcutExpressionParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(PointcutExpressionParser.COMMA, i);
        }

        public List<TerminalNode> DOT() {
            return getTokens(PointcutExpressionParser.DOT);
        }

        public TerminalNode DOT(int i) {
            return getToken(PointcutExpressionParser.DOT, i);
        }

        public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parameterTypeList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PointcutExpressionListener)
                ((PointcutExpressionListener) listener).enterParameterTypeList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PointcutExpressionListener)
                ((PointcutExpressionListener) listener).exitParameterTypeList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PointcutExpressionVisitor)
                return ((PointcutExpressionVisitor<? extends T>) visitor).visitParameterTypeList(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
        ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_parameterTypeList);
        try {
            int _alt;
            setState(56);
            switch (_input.LA(1)) {
                case T__1:
                case T__2:
                case T__3:
                case T__4:
                case T__5:
                case T__6:
                case T__7:
                case T__8:
                case Identifier:
                case ASTERISK:
                    enterOuterAlt(_localctx, 1);
                {
                    {
                        setState(50);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(45);
                                        parameterType();
                                        setState(46);
                                        match(COMMA);
                                    }
                                }
                            }
                            setState(52);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                        }
                        setState(53);
                        parameterType();
                    }
                }
                break;
                case DOT:
                    enterOuterAlt(_localctx, 2);
                {
                    {
                        setState(54);
                        match(DOT);
                        setState(55);
                        match(DOT);
                    }
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ParameterTypeContext extends ParserRuleContext {
        public ReferenceTypeContext referenceType() {
            return getRuleContext(ReferenceTypeContext.class, 0);
        }

        public PrimitiveTypeContext primitiveType() {
            return getRuleContext(PrimitiveTypeContext.class, 0);
        }

        public ArrayTypeContext arrayType() {
            return getRuleContext(ArrayTypeContext.class, 0);
        }

        public TerminalNode ASTERISK() {
            return getToken(PointcutExpressionParser.ASTERISK, 0);
        }

        public ParameterTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parameterType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PointcutExpressionListener)
                ((PointcutExpressionListener) listener).enterParameterType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PointcutExpressionListener)
                ((PointcutExpressionListener) listener).exitParameterType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PointcutExpressionVisitor)
                return ((PointcutExpressionVisitor<? extends T>) visitor).visitParameterType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ParameterTypeContext parameterType() throws RecognitionException {
        ParameterTypeContext _localctx = new ParameterTypeContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_parameterType);
        try {
            setState(62);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(58);
                    referenceType();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(59);
                    primitiveType();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(60);
                    arrayType();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(61);
                    match(ASTERISK);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ReferenceTypeContext extends ParserRuleContext {
        public List<TerminalNode> Identifier() {
            return getTokens(PointcutExpressionParser.Identifier);
        }

        public TerminalNode Identifier(int i) {
            return getToken(PointcutExpressionParser.Identifier, i);
        }

        public List<TerminalNode> DOT() {
            return getTokens(PointcutExpressionParser.DOT);
        }

        public TerminalNode DOT(int i) {
            return getToken(PointcutExpressionParser.DOT, i);
        }

        public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_referenceType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PointcutExpressionListener)
                ((PointcutExpressionListener) listener).enterReferenceType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PointcutExpressionListener)
                ((PointcutExpressionListener) listener).exitReferenceType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PointcutExpressionVisitor)
                return ((PointcutExpressionVisitor<? extends T>) visitor).visitReferenceType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ReferenceTypeContext referenceType() throws RecognitionException {
        ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_referenceType);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(68);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(64);
                                match(Identifier);
                                setState(65);
                                match(DOT);
                            }
                        }
                    }
                    setState(70);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                }
                setState(71);
                match(Identifier);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VoidTypeContext extends ParserRuleContext {
        public VoidTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_voidType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PointcutExpressionListener)
                ((PointcutExpressionListener) listener).enterVoidType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PointcutExpressionListener)
                ((PointcutExpressionListener) listener).exitVoidType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PointcutExpressionVisitor)
                return ((PointcutExpressionVisitor<? extends T>) visitor).visitVoidType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final VoidTypeContext voidType() throws RecognitionException {
        VoidTypeContext _localctx = new VoidTypeContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_voidType);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(73);
                match(T__0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PrimitiveTypeContext extends ParserRuleContext {
        public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_primitiveType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PointcutExpressionListener)
                ((PointcutExpressionListener) listener).enterPrimitiveType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PointcutExpressionListener)
                ((PointcutExpressionListener) listener).exitPrimitiveType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PointcutExpressionVisitor)
                return ((PointcutExpressionVisitor<? extends T>) visitor).visitPrimitiveType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PrimitiveTypeContext primitiveType() throws RecognitionException {
        PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_primitiveType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(75);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ArraySuffixContext extends ParserRuleContext {
        public TerminalNode LBRACK() {
            return getToken(PointcutExpressionParser.LBRACK, 0);
        }

        public TerminalNode RBRACK() {
            return getToken(PointcutExpressionParser.RBRACK, 0);
        }

        public ArraySuffixContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arraySuffix;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PointcutExpressionListener)
                ((PointcutExpressionListener) listener).enterArraySuffix(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PointcutExpressionListener)
                ((PointcutExpressionListener) listener).exitArraySuffix(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PointcutExpressionVisitor)
                return ((PointcutExpressionVisitor<? extends T>) visitor).visitArraySuffix(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ArraySuffixContext arraySuffix() throws RecognitionException {
        ArraySuffixContext _localctx = new ArraySuffixContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_arraySuffix);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(77);
                match(LBRACK);
                setState(78);
                match(RBRACK);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ArrayTypeContext extends ParserRuleContext {
        public PrimitiveTypeContext primitiveType() {
            return getRuleContext(PrimitiveTypeContext.class, 0);
        }

        public ReferenceTypeContext referenceType() {
            return getRuleContext(ReferenceTypeContext.class, 0);
        }

        public List<ArraySuffixContext> arraySuffix() {
            return getRuleContexts(ArraySuffixContext.class);
        }

        public ArraySuffixContext arraySuffix(int i) {
            return getRuleContext(ArraySuffixContext.class, i);
        }

        public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arrayType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PointcutExpressionListener)
                ((PointcutExpressionListener) listener).enterArrayType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PointcutExpressionListener)
                ((PointcutExpressionListener) listener).exitArrayType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof PointcutExpressionVisitor)
                return ((PointcutExpressionVisitor<? extends T>) visitor).visitArrayType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ArrayTypeContext arrayType() throws RecognitionException {
        ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_arrayType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(82);
                switch (_input.LA(1)) {
                    case T__1:
                    case T__2:
                    case T__3:
                    case T__4:
                    case T__5:
                    case T__6:
                    case T__7:
                    case T__8: {
                        setState(80);
                        primitiveType();
                    }
                    break;
                    case Identifier: {
                        setState(81);
                        referenceType();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(85);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(84);
                            arraySuffix();
                        }
                    }
                    setState(87);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == LBRACK);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24\\\4\2\t\2\4\3" +
                    "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13" +
                    "\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\5\2\37\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3" +
                    "\3\5\3(\n\3\3\4\3\4\5\4,\n\4\3\5\3\5\3\6\3\6\3\6\7\6\63\n\6\f\6\16\6\66" +
                    "\13\6\3\6\3\6\3\6\5\6;\n\6\3\7\3\7\3\7\3\7\5\7A\n\7\3\b\3\b\7\bE\n\b\f" +
                    "\b\16\bH\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\5\fU\n\f" +
                    "\3\f\6\fX\n\f\r\f\16\fY\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\4\4\2\f" +
                    "\f\21\21\3\2\4\13^\2\30\3\2\2\2\4\'\3\2\2\2\6+\3\2\2\2\b-\3\2\2\2\n:\3" +
                    "\2\2\2\f@\3\2\2\2\16F\3\2\2\2\20K\3\2\2\2\22M\3\2\2\2\24O\3\2\2\2\26T" +
                    "\3\2\2\2\30\31\5\4\3\2\31\32\5\6\4\2\32\33\7\22\2\2\33\34\5\b\5\2\34\36" +
                    "\7\17\2\2\35\37\5\n\6\2\36\35\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 !\7\20" +
                    "\2\2!\3\3\2\2\2\"(\5\20\t\2#(\5\16\b\2$(\5\22\n\2%(\5\26\f\2&(\7\21\2" +
                    "\2\'\"\3\2\2\2\'#\3\2\2\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(\5\3\2\2\2" +
                    "),\5\16\b\2*,\7\21\2\2+)\3\2\2\2+*\3\2\2\2,\7\3\2\2\2-.\t\2\2\2.\t\3\2" +
                    "\2\2/\60\5\f\7\2\60\61\7\23\2\2\61\63\3\2\2\2\62/\3\2\2\2\63\66\3\2\2" +
                    "\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\67;\5\f\7\2" +
                    "89\7\22\2\29;\7\22\2\2:\64\3\2\2\2:8\3\2\2\2;\13\3\2\2\2<A\5\16\b\2=A" +
                    "\5\22\n\2>A\5\26\f\2?A\7\21\2\2@<\3\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2" +
                    "\2A\r\3\2\2\2BC\7\f\2\2CE\7\22\2\2DB\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2" +
                    "\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\f\2\2J\17\3\2\2\2KL\7\3\2\2L\21\3\2\2\2M" +
                    "N\t\3\2\2N\23\3\2\2\2OP\7\r\2\2PQ\7\16\2\2Q\25\3\2\2\2RU\5\22\n\2SU\5" +
                    "\16\b\2TR\3\2\2\2TS\3\2\2\2UW\3\2\2\2VX\5\24\13\2WV\3\2\2\2XY\3\2\2\2" +
                    "YW\3\2\2\2YZ\3\2\2\2Z\27\3\2\2\2\13\36\'+\64:@FTY";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    private static BaseErrorListener parserErrorListener(String expression) {
        return new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new PointcutExpressionSyntaxException("(" + expression + ") " + msg + " at position " + charPositionInLine);
            }
        };
    }

    public static Pointcut parse(String expression) {

        CharStream expressionInputStream = new ANTLRInputStream(expression);

        BaseErrorListener errorListener = parserErrorListener(expression);

        PointcutExpressionLexer expressionLexer = new PointcutExpressionLexer(expressionInputStream);

        expressionLexer
                .getErrorListeners()
                .clear();

        expressionLexer
                .addErrorListener(errorListener);

        CommonTokenStream tokenStream = new CommonTokenStream(expressionLexer);

        PointcutExpressionParser expressionParser = new PointcutExpressionParser(tokenStream);

        expressionParser
                .getErrorListeners()
                .clear();

        expressionParser
                .addErrorListener(errorListener);

        expressionParser
                .getErrorListeners()
                .clear();

        expressionParser
                .addErrorListener(errorListener);

        return expressionParser
                .expression()
                .accept(pointcutExpressionVisitor());
    }

    private static PointcutExpressionBaseVisitor<String> returnTypeVisitor = returnTypeVisitor();
    private static PointcutExpressionBaseVisitor<String> targetTypeVisitor = targetTypeVisitor();
    private static PointcutExpressionBaseVisitor<String> methodNameVisitor = methodNameVisitor();

    private static PointcutExpressionBaseVisitor<String[]> parameterTypeListVisitor = parameterTypeListVisitor();

    private static PointcutExpressionBaseVisitor<Pointcut> pointcutExpressionVisitor() {
        return new PointcutExpressionBaseVisitor<Pointcut>() {
            @Override
            public Pointcut visitExpression(ExpressionContext ctx) {

                String returnTypeName = ctx.returnType().accept(returnTypeVisitor);

                String targetTypeName = ctx.targetType().accept(targetTypeVisitor);

                String methodName = ctx.methodName().accept(methodNameVisitor);

                String[] parameterTypeNames = {};

                if (ctx.parameterTypeList() != null) {
                    parameterTypeNames = ctx.parameterTypeList().accept(parameterTypeListVisitor);
                }

                return new Pointcut(returnTypeName, targetTypeName, methodName, parameterTypeNames);
            }
        };
    }

    private static PointcutExpressionBaseVisitor<String> returnTypeVisitor() {
        return new PointcutExpressionBaseVisitor<String>() {
            @Override
            public String visitReturnType(ReturnTypeContext ctx) {

                if (ctx.voidType() != null) {
                    return ctx.voidType().getText();
                }

                if (ctx.referenceType() != null) {
                    return ctx.referenceType().getText();
                }

                if (ctx.primitiveType() != null) {
                    return ctx.primitiveType().getText();
                }

                if (ctx.arrayType() != null) {
                    return ctx.arrayType().getText();
                }

                if (ctx.ASTERISK() != null) {
                    return ctx.ASTERISK().getText();
                } else
                    throw new IllegalArgumentException(ctx.getText());
            }
        };
    }

    private static PointcutExpressionBaseVisitor<String> targetTypeVisitor() {
        return new PointcutExpressionBaseVisitor<String>() {
            @Override
            public String visitTargetType(TargetTypeContext ctx) {

                if (ctx.referenceType() != null) {
                    return ctx.referenceType().getText();
                }

                if (ctx.ASTERISK() != null) {
                    return ctx.ASTERISK().getText();
                } else
                    throw new IllegalArgumentException(ctx.getText());
            }
        };
    }

    private static PointcutExpressionBaseVisitor<String> methodNameVisitor() {
        return new PointcutExpressionBaseVisitor<String>() {
            @Override
            public String visitMethodName(MethodNameContext ctx) {

                if (ctx.Identifier() != null) {
                    return ctx.Identifier().getText();
                }

                if (ctx.ASTERISK() != null) {
                    return ctx.ASTERISK().getText();
                } else
                    throw new IllegalArgumentException(ctx.getText());
            }
        };
    }

    private static PointcutExpressionBaseVisitor<String[]> parameterTypeListVisitor() {
        return new PointcutExpressionBaseVisitor<String[]>() {
            @Override
            public String[] visitParameterTypeList(ParameterTypeListContext ctx) {
                if (ctx.DOT().isEmpty()) {
                    return ctx
                            .parameterType()
                            .stream()
                            .map(parameterTypeContext -> {

                                if (parameterTypeContext.referenceType() != null) {
                                    return parameterTypeContext
                                            .referenceType()
                                            .getText();
                                }

                                if (parameterTypeContext.primitiveType() != null) {
                                    return parameterTypeContext
                                            .primitiveType()
                                            .getText();
                                }

                                if (parameterTypeContext.arrayType() != null) {
                                    return parameterTypeContext
                                            .arrayType()
                                            .getText();
                                }

                                if (parameterTypeContext.ASTERISK() != null) {
                                    return parameterTypeContext
                                            .ASTERISK()
                                            .getText();
                                } else
                                    throw new IllegalArgumentException(parameterTypeContext.getText());

                            }).toArray(String[]::new);

                } else {
                    return new String[]{".."};
                }
            }
        };
    }
}