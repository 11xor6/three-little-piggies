package com.metamx.idea.pig;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

%%

%unicode
%class PigLexer
%implements FlexLexer
%function advance
%type IElementType
%eof{  return;
%eof}


%{
  public void goTo(int offset) {
    zzCurrentPos = zzMarkedPos = zzStartRead = offset;
    zzPushbackPos = 0;
    zzAtEOF = offset < zzEndRead;
  }
%}

/* main character classes */
DIGIT=[0-9]
OCTAL_DIGIT=[0-7]
HEX_DIGIT=[0-9A-Fa-f]
WHITE_SPACE_CHAR=[\ \n\r\t\f]

/* identifiers */
IDENTIFIER = [:jletter:][:jletterdigit:]*

/* comments */
C_STYLE_COMMENT=("/*"[^"*"]{COMMENT_TAIL})|"/*"
DOC_COMMENT="/*""*"+("/"|([^"/""*"]{COMMENT_TAIL}))?
COMMENT_TAIL=([^"*"]*("*"+[^"*""/"])?)*("*"+"/")?
END_OF_LINE_COMMENT="-""-"[^\r\n]*

/* literals */
INTEGER_LITERAL={DECIMAL_INTEGER_LITERAL}|{HEX_INTEGER_LITERAL}|{OCTAL_INTEGER_LITERAL}
DECIMAL_INTEGER_LITERAL=(0|([1-9]({DIGIT})*))
HEX_INTEGER_LITERAL=0[Xx]({HEX_DIGIT})*
OCTAL_INTEGER_LITERAL=0({OCTAL_DIGIT})+
LONG_LITERAL=({INTEGER_LITERAL})[Ll]

FLOAT_LITERAL=(({FLOATING_POINT_LITERAL1})[Ff])|(({FLOATING_POINT_LITERAL2})[Ff])|(({FLOATING_POINT_LITERAL3})[Ff])|(({FLOATING_POINT_LITERAL4})[Ff])
DOUBLE_LITERAL=(({FLOATING_POINT_LITERAL1})[Dd]?)|(({FLOATING_POINT_LITERAL2})[Dd]?)|(({FLOATING_POINT_LITERAL3})[Dd]?)|(({FLOATING_POINT_LITERAL4})[Dd])
FLOATING_POINT_LITERAL1=({DIGIT})+"."({DIGIT})*({EXPONENT_PART})?
FLOATING_POINT_LITERAL2="."({DIGIT})+({EXPONENT_PART})?
FLOATING_POINT_LITERAL3=({DIGIT})+({EXPONENT_PART})
FLOATING_POINT_LITERAL4=({DIGIT})+
EXPONENT_PART=[Ee]["+""-"]?({DIGIT})*

EXEC_LITERAL="`"([^\\`\r\n]|{ESCAPE_SEQUENCE})*("`"|\\)?
STRING_LITERAL=\'([^\\\'\r\n]|{ESCAPE_SEQUENCE})*(\'|\\)?
ESCAPE_SEQUENCE=\\[^\r\n]

%%

<YYINITIAL> {WHITE_SPACE_CHAR}+ { return PigTokenType.WHITE_SPACE; }

<YYINITIAL> {C_STYLE_COMMENT} { return PigTokenType.C_STYLE_COMMENT; }
<YYINITIAL> {END_OF_LINE_COMMENT} { return PigTokenType.END_OF_LINE_COMMENT; }
<YYINITIAL> {DOC_COMMENT} { return PigTokenType.DOC_COMMENT; }

<YYINITIAL> {LONG_LITERAL} { return PigTokenType.LONG_LITERAL; }
<YYINITIAL> {INTEGER_LITERAL} { return PigTokenType.INTEGER_LITERAL; }
<YYINITIAL> {FLOAT_LITERAL} { return PigTokenType.FLOAT_LITERAL; }
<YYINITIAL> {DOUBLE_LITERAL} { return PigTokenType.DOUBLE_LITERAL; }

<YYINITIAL> {EXEC_LITERAL} { return PigTokenType.EXEC_LITERAL; }
<YYINITIAL> {STRING_LITERAL} { return PigTokenType.STRING_LITERAL; }

<YYINITIAL> "TRUE" { return PigTokenType.TRUE_KEYWORD; }
<YYINITIAL> "FALSE" { return PigTokenType.FALSE_KEYWORD; }
<YYINITIAL> "NULL" { return PigTokenType.NULL_KEYWORD; }

 /* keywords */
<YYINITIAL> "AS" { return PigTokenType.AS_KEYWORD; }
<YYINITIAL> "ASC" { return PigTokenType.ASC_KEYWORD; }
<YYINITIAL> "BAG" { return PigTokenType.BAG_KEYWORD; }
<YYINITIAL> "CACHE" { return PigTokenType.CACHE_KEYWORD; }
<YYINITIAL> "CHARARRAY" { return PigTokenType.CHARARRAY_KEYWORD; }
<YYINITIAL> "COGROUP" { return PigTokenType.COGROUP_KEYWORD; }
<YYINITIAL> "CROSS" { return PigTokenType.CROSS_KEYWORD; }
<YYINITIAL> "DEFINE" { return PigTokenType.DEFINE_KEYWORD; }
<YYINITIAL> "DESC" { return PigTokenType.DESC_KEYWORD; }
<YYINITIAL> "DISTINCT" { return PigTokenType.DISTINCT_KEYWORD; }
<YYINITIAL> "DOUBLE" { return PigTokenType.DOUBLE_KEYWORD; }
<YYINITIAL> "FILTER" { return PigTokenType.FILTER_KEYWORD; }
<YYINITIAL> "FLATTEN" { return PigTokenType.FLATTEN_KEYWORD; }
<YYINITIAL> "FLOAT" { return PigTokenType.FLOAT_KEYWORD; }
<YYINITIAL> "FOREACH" { return PigTokenType.FOREACH_KEYWORD; }
<YYINITIAL> "FULL" { return PigTokenType.FULL_KEYWORD; }
<YYINITIAL> "GENERATE" { return PigTokenType.GENERATE_KEYWORD; }
<YYINITIAL> "GROUP" { return PigTokenType.GROUP_KEYWORD; }
<YYINITIAL> "IF" { return PigTokenType.IF_KEYWORD; }
<YYINITIAL> "IMPORT" { return PigTokenType.IMPORT_KEYWORD; }
<YYINITIAL> "INNER" { return PigTokenType.INNER_KEYWORD; }
<YYINITIAL> "INPUT" { return PigTokenType.INPUT_KEYWORD; }
<YYINITIAL> "INT" { return PigTokenType.INT_KEYWORD; }
<YYINITIAL> "INTO" { return PigTokenType.INTO_KEYWORD; }
<YYINITIAL> "IS" { return PigTokenType.IS_KEYWORD; }
<YYINITIAL> "JOIN" { return PigTokenType.JOIN_KEYWORD; }
<YYINITIAL> "LEFT" { return PigTokenType.LEFT_KEYWORD; }
<YYINITIAL> "LIMIT" { return PigTokenType.LIMIT_KEYWORD; }
<YYINITIAL> "LOAD" { return PigTokenType.LOAD_KEYWORD; }
<YYINITIAL> "LONG" { return PigTokenType.LONG_KEYWORD; }
<YYINITIAL> "MAP" { return PigTokenType.MAP_KEYWORD; }
<YYINITIAL> "MAPREDUCE" { return PigTokenType.MAPREDUCE_KEYWORD; }
<YYINITIAL> "ONSCHEMA" { return PigTokenType.ONSCHEMA_KEYWORD; }
<YYINITIAL> "ORDER" { return PigTokenType.ORDER_KEYWORD; }
<YYINITIAL> "OUTER" { return PigTokenType.OUTER_KEYWORD; }
<YYINITIAL> "OUTPUT" { return PigTokenType.OUTPUT_KEYWORD; }
<YYINITIAL> "PARALLEL" { return PigTokenType.PARALLEL_KEYWORD; }
<YYINITIAL> "PARTITION" { return PigTokenType.PARTITION_KEYWORD; }
<YYINITIAL> "RETURNS" { return PigTokenType.RETURNS_KEYWORD; }
<YYINITIAL> "RIGHT" { return PigTokenType.RIGHT_KEYWORD; }
<YYINITIAL> "SAMPLE" { return PigTokenType.SAMPLE_KEYWORD; }
<YYINITIAL> "SHIP" { return PigTokenType.SHIP_KEYWORD; }
<YYINITIAL> "SPLIT" { return PigTokenType.SPLIT_KEYWORD; }
<YYINITIAL> "STDERR" { return PigTokenType.STDERROR_KEYWORD; }
<YYINITIAL> "STDIN" { return PigTokenType.STDIN_KEYWORD; }
<YYINITIAL> "STDOUT" { return PigTokenType.STDOUT_KEYWORD; }
<YYINITIAL> "STORE" { return PigTokenType.STORE_KEYWORD; }
<YYINITIAL> "STREAM" { return PigTokenType.STREAM_KEYWORD; }
<YYINITIAL> "THROUGH" { return PigTokenType.THROUGH_KEYWORD; }
<YYINITIAL> "TUPLE" { return PigTokenType.TUPLE_KEYWORD; }
<YYINITIAL> "UNION" { return PigTokenType.UNION_KEYWORD; }
<YYINITIAL> "USING" { return PigTokenType.USING_KEYWORD; }
<YYINITIAL> "VOID" { return PigTokenType.VOID_KEYWORD; }
<YYINITIAL> "AND" { return PigTokenType.AND; }
<YYINITIAL> "NOT" { return PigTokenType.NOT; }
<YYINITIAL> "OR" { return PigTokenType.OR; }
<YYINITIAL> "EQ" { return PigTokenType.STR_OP_EQ; }
<YYINITIAL> "GT" { return PigTokenType.STR_OP_GT; }
<YYINITIAL> "LT" { return PigTokenType.STR_OP_LT; }
<YYINITIAL> "GTE" { return PigTokenType.STR_OP_GTE; }
<YYINITIAL> "LTE" { return PigTokenType.STR_OP_LTE; }
<YYINITIAL> "NEQ" { return PigTokenType.STR_OP_NE; }
<YYINITIAL> "MATCHES" { return PigTokenType.STR_OP_MATCHES; }

<YYINITIAL> {IDENTIFIER} { return PigTokenType.IDENTIFIER; }

  /* separators */
<YYINITIAL> "(" { return PigTokenType.LPARENTH; }
<YYINITIAL> ")" { return PigTokenType.RPARENTH; }
<YYINITIAL> "{" { return PigTokenType.LBRACE; }
<YYINITIAL> "}" { return PigTokenType.RBRACE; }
<YYINITIAL> "[" { return PigTokenType.LBRACK; }
<YYINITIAL> "]" { return PigTokenType.RBRACK; }
<YYINITIAL> ";" { return PigTokenType.SEMICOLON; }
<YYINITIAL> "," { return PigTokenType.COMMA; }
<YYINITIAL> "." { return PigTokenType.DOT; }

  /* operators */
<YYINITIAL> "=" { return PigTokenType.EQUAL; }
<YYINITIAL> ">" { return PigTokenType.GT; }
<YYINITIAL> "<" { return PigTokenType.LT; }
<YYINITIAL> "?" { return PigTokenType.QMARK; }
<YYINITIAL> ":" { return PigTokenType.COLON; }
<YYINITIAL> "==" { return PigTokenType.EQEQ; }
<YYINITIAL> "<=" { return PigTokenType.LTEQ; }
<YYINITIAL> ">=" { return PigTokenType.GTEQ; }
<YYINITIAL> "!=" { return PigTokenType.NOTEQ; }
<YYINITIAL> "+" { return PigTokenType.PLUS; }
<YYINITIAL> "-" { return PigTokenType.MINUS; }
<YYINITIAL> "*" { return PigTokenType.STAR; }
<YYINITIAL> "/" { return PigTokenType.DIV; }
<YYINITIAL> "#" { return PigTokenType.POUND; }
<YYINITIAL> "%" { return PigTokenType.PERCENT; }
<YYINITIAL> ".." { return PigTokenType.DOUBLE_PERIOD; }
<YYINITIAL> "\\$" { return PigTokenType.DOLLAR; }
<YYINITIAL> "::" { return PigTokenType.DCOLON; }

<YYINITIAL> . { return PigTokenType.BAD_CHARACTER; }
