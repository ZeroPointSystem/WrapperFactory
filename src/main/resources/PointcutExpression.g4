grammar PointcutExpression;

@lexer::header{ package zps.dynamic.aop.pointcut.expression.lexer; }
@parser::header{ package zps.dynamic.aop.pointcut.expression.parser;  }

expression: returnType targetType DOT methodName LPAREN parameterTypeList? RPAREN;

returnType: voidType | referenceType | primitiveType | arrayType | ASTERISK;

targetType: referenceType | ASTERISK;

methodName: Identifier | ASTERISK;

parameterTypeList: ((parameterType COMMA)* parameterType) | (DOT DOT);

parameterType: referenceType | primitiveType | arrayType | ASTERISK;

referenceType: (Identifier DOT)* Identifier;

voidType: 'void';

primitiveType: 'byte' | 'short' | 'char' | 'int' | 'long' | 'double' | 'float' | 'boolean';

arraySuffix: LBRACK RBRACK;

arrayType: (primitiveType | referenceType) arraySuffix+;

Identifier: JavaLetter JavaLetterOrDigit*;

fragment JavaLetter
	: [a-zA-Z$_]
	| ~[\u0000-\u007F\uD800-\uDBFF]	{Character.isJavaIdentifierStart(_input.LA(-1))}?
	| [\uD800-\uDBFF] [\uDC00-\uDFFF] {Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?;

fragment JavaLetterOrDigit
	: [a-zA-Z0-9$_]
	| ~[\u0000-\u007F\uD800-\uDBFF] {Character.isJavaIdentifierPart(_input.LA(-1))}?
	| [\uD800-\uDBFF] [\uDC00-\uDFFF] {Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?;

LBRACK: '[';
RBRACK: ']';
LPAREN: '(';
RPAREN: ')';

ASTERISK: '*';
DOT: '.';
COMMA: ',';

WS  :  [ \t\r\n\u000C]+ -> skip;