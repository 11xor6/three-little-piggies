package com.metamx.idea.pig;


import com.intellij.lang.Language;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;

/**
 *
 */
public interface PigTokenType extends TokenType
{
  IElementType SPLIT_KEYWORD = new IElementType("SPLIT_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType FULL_KEYWORD = new IElementType("FULL_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType STREAM_KEYWORD = new IElementType("STREAM_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType STORE_KEYWORD = new IElementType("STORE_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType ORDER_KEYWORD = new IElementType("ORDER_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType IF_KEYWORD = new IElementType("IF_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType INT_KEYWORD = new IElementType("INT_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType OUTER_KEYWORD = new IElementType("OUTER_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType IMPORT_KEYWORD = new IElementType("IMPORT_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType STDOUT_KEYWORD = new IElementType("STDOUT_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType TUPLE_KEYWORD = new IElementType("TUPLE_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType ASC_KEYWORD = new IElementType("ASC_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType FOREACH_KEYWORD = new IElementType("FOREACH_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType MAPREDUCE_KEYWORD = new IElementType("MAPREDUCE_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType CACHE_KEYWORD = new IElementType("CACHE_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType NULL_KEYWORD = new IElementType("NULL_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType FALSE_KEYWORD = new IElementType("FALSE_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType FLOAT_KEYWORD = new IElementType("FLOAT_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType USING_KEYWORD = new IElementType("USING_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType LONG_KEYWORD = new IElementType("LONG_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType SHIP_KEYWORD = new IElementType("SHIP_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType GROUP_KEYWORD = new IElementType("GROUP_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType PARALLEL_KEYWORD = new IElementType("PARALLEL_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType UNION_KEYWORD = new IElementType("UNION_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType INTO_KEYWORD = new IElementType("INTO_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType FLATTEN_KEYWORD = new IElementType("FLATTEN_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType DOUBLE_PERIOD = new IElementType("DOUBLE_PERIOD", Language.findLanguageByID("PigLanguage"));
  IElementType DESC_KEYWORD = new IElementType("DESC_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType GENERATE_KEYWORD = new IElementType("GENERATE_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType LOAD_KEYWORD = new IElementType("LOAD_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType ONSCHEMA_KEYWORD = new IElementType("ONSCHEMA_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType BAG_KEYWORD = new IElementType("BAG_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType RETURNS_KEYWORD = new IElementType("RETURNS_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType LEFT_KEYWORD = new IElementType("LEFT_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType FILTER_KEYWORD = new IElementType("FILTER_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType STDIN_KEYWORD = new IElementType("STDIN_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType LIMIT_KEYWORD = new IElementType("LIMIT_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType COGROUP_KEYWORD = new IElementType("COGROUP_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType CHARARRAY_KEYWORD = new IElementType("CHARARRAY_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType DISTINCT_KEYWORD = new IElementType("DISTINCT_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType THROUGH_KEYWORD = new IElementType("THROUGH_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType INPUT_KEYWORD = new IElementType("INPUT_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType RIGHT_KEYWORD = new IElementType("RIGHT_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType TRUE_KEYWORD = new IElementType("TRUE_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType INNER_KEYWORD = new IElementType("INNER_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType DOUBLE_KEYWORD = new IElementType("DOUBLE_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType MAP_KEYWORD = new IElementType("MAP_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType CROSS_KEYWORD = new IElementType("CROSS_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType AS_KEYWORD = new IElementType("AS_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType VOID_KEYWORD = new IElementType("VOID_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType OUTPUT_KEYWORD = new IElementType("OUTPUT_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType DEFINE_KEYWORD = new IElementType("DEFINE_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType PARTITION_KEYWORD = new IElementType("PARTITION_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType STDERROR_KEYWORD = new IElementType("STDERROR_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType IS_KEYWORD = new IElementType("IS_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType SAMPLE_KEYWORD = new IElementType("SAMPLE_KEYWORD", Language.findLanguageByID("PigLanguage"));
  IElementType JOIN_KEYWORD = new IElementType("JOIN_KEYWORD", Language.findLanguageByID("PigLanguage"));

  IElementType IDENTIFIER = new IElementType("IDENTIFIER", Language.findLanguageByID("PigLanguage"));

  IElementType RBRACE = new IElementType("RBRACE", Language.findLanguageByID("PigLanguage"));
  IElementType LBRACE = new IElementType("LBRACE", Language.findLanguageByID("PigLanguage"));
  IElementType RBRACK = new IElementType("RBRACK", Language.findLanguageByID("PigLanguage"));
  IElementType LBRACK = new IElementType("LBRACK", Language.findLanguageByID("PigLanguage"));
  IElementType RPARENTH = new IElementType("RPARENTH", Language.findLanguageByID("PigLanguage"));
  IElementType LPARENTH = new IElementType("LPARENTH", Language.findLanguageByID("PigLanguage"));

  IElementType NOT = new IElementType("NOT", Language.findLanguageByID("PigLanguage"));
  IElementType AND = new IElementType("AND", Language.findLanguageByID("PigLanguage"));
  IElementType OR = new IElementType("OR", Language.findLanguageByID("PigLanguage"));

  IElementType EQEQ = new IElementType("EQEQ", Language.findLanguageByID("PigLanguage"));
  IElementType NOTEQ = new IElementType("NOTEQ", Language.findLanguageByID("PigLanguage"));
  IElementType LTEQ = new IElementType("LTEQ", Language.findLanguageByID("PigLanguage"));
  IElementType LT = new IElementType("LT", Language.findLanguageByID("PigLanguage"));
  IElementType GTEQ = new IElementType("GTEQ", Language.findLanguageByID("PigLanguage"));
  IElementType GT = new IElementType("GT", Language.findLanguageByID("PigLanguage"));

  IElementType STR_OP_EQ = new IElementType("STR_OP_EQ", Language.findLanguageByID("PigLanguage"));
  IElementType STR_OP_NE = new IElementType("STR_OP_NE", Language.findLanguageByID("PigLanguage"));
  IElementType STR_OP_LTE = new IElementType("STR_OP_LTE", Language.findLanguageByID("PigLanguage"));
  IElementType STR_OP_LT = new IElementType("STR_OP_LT", Language.findLanguageByID("PigLanguage"));
  IElementType STR_OP_GTE = new IElementType("STR_OP_GTE", Language.findLanguageByID("PigLanguage"));
  IElementType STR_OP_GT = new IElementType("STR_OP_GT", Language.findLanguageByID("PigLanguage"));
  IElementType STR_OP_MATCHES = new IElementType("STR_OP_MATCHES", Language.findLanguageByID("PigLanguage"));

  IElementType PLUS = new IElementType("PLUS", Language.findLanguageByID("PigLanguage"));
  IElementType DIV = new IElementType("DIV", Language.findLanguageByID("PigLanguage"));
  IElementType MINUS = new IElementType("MINUS", Language.findLanguageByID("PigLanguage"));
  IElementType EQUAL = new IElementType("EQUAL", Language.findLanguageByID("PigLanguage"));
  IElementType STAR = new IElementType("STAR", Language.findLanguageByID("PigLanguage"));
  IElementType PERCENT = new IElementType("PERCENT", Language.findLanguageByID("PigLanguage"));
  IElementType QMARK = new IElementType("QMARK", Language.findLanguageByID("PigLanguage"));
  IElementType DOT = new IElementType("DOT", Language.findLanguageByID("PigLanguage"));
  IElementType POUND = new IElementType("POUND", Language.findLanguageByID("PigLanguage"));
  IElementType SEMICOLON = new IElementType("SEMICOLON", Language.findLanguageByID("PigLanguage"));
  IElementType COLON = new IElementType("COLON", Language.findLanguageByID("PigLanguage"));
  IElementType DCOLON = new IElementType("DCOLON", Language.findLanguageByID("PigLanguage"));
  IElementType DOLLAR = new IElementType("DOLLAR", Language.findLanguageByID("PigLanguage"));
  IElementType COMMA = new IElementType("COMMA", Language.findLanguageByID("PigLanguage"));

  IElementType EXEC_LITERAL = new IElementType("EXEC_LITERAL", Language.findLanguageByID("PigLanguage"));
  IElementType STRING_LITERAL = new IElementType("STRING_LITERAL", Language.findLanguageByID("PigLanguage"));

  IElementType DOUBLE_LITERAL = new IElementType("DOUBLE_LITERAL", Language.findLanguageByID("PigLanguage"));
  IElementType INTEGER_LITERAL = new IElementType("INTEGER_LITERAL", Language.findLanguageByID("PigLanguage"));
  IElementType LONG_LITERAL = new IElementType("LONG_LITERAL", Language.findLanguageByID("PigLanguage"));
  IElementType FLOAT_LITERAL = new IElementType("FLOAT_LITERAL", Language.findLanguageByID("PigLanguage"));

  IElementType END_OF_LINE_COMMENT = new IElementType("END_OF_LINE_COMMENT", Language.findLanguageByID("PigLanguage"));
  IElementType C_STYLE_COMMENT = new IElementType("C_STYLE_COMMENT", Language.findLanguageByID("PigLanguage"));
  IElementType DOC_COMMENT = new IElementType("DOC_COMMENT", Language.findLanguageByID("PigLanguage"));;

  TokenSet COMMENT_SET = TokenSet.create(END_OF_LINE_COMMENT, C_STYLE_COMMENT);
  TokenSet STRING_SET = TokenSet.create(EXEC_LITERAL, STRING_LITERAL);
  TokenSet NUMBER_SET = TokenSet.create(DOUBLE_LITERAL, INTEGER_LITERAL, LONG_LITERAL, FLOAT_LITERAL);
  TokenSet SYMBOL_SET = TokenSet.create(
      PLUS,
      DIV,
      MINUS,
      EQUAL,
      STAR,
      PERCENT,
      QMARK,
      DOT,
      POUND,
      SEMICOLON,
      COLON,
      DCOLON,
      DOLLAR,
      COMMA
  );
  TokenSet STRING_OP_SET = TokenSet.create(
      STR_OP_EQ,
      STR_OP_GT,
      STR_OP_GTE,
      STR_OP_LT,
      STR_OP_LTE,
      STR_OP_MATCHES,
      STR_OP_NE,
      STR_OP_NE
  );
  TokenSet COMPARISION_OP_SET = TokenSet.create(EQEQ, NOTEQ, LT, GT, GTEQ, LTEQ);
  TokenSet BOOLEAN_OP_SET = TokenSet.create(AND, OR, NOT);
  TokenSet KEYWORD_SET = TokenSet.create(
      SPLIT_KEYWORD, FULL_KEYWORD, STREAM_KEYWORD, STORE_KEYWORD, ORDER_KEYWORD, IF_KEYWORD
      , INT_KEYWORD, OUTER_KEYWORD, IMPORT_KEYWORD, STDOUT_KEYWORD, TUPLE_KEYWORD, ASC_KEYWORD
      , FOREACH_KEYWORD, MAPREDUCE_KEYWORD, CACHE_KEYWORD, NULL_KEYWORD, FALSE_KEYWORD, FLOAT_KEYWORD
      , USING_KEYWORD, LONG_KEYWORD, SHIP_KEYWORD, GROUP_KEYWORD, PARALLEL_KEYWORD
      , UNION_KEYWORD, INTO_KEYWORD, FLATTEN_KEYWORD, DOUBLE_PERIOD, DESC_KEYWORD, GENERATE_KEYWORD
      , LOAD_KEYWORD, ONSCHEMA_KEYWORD, BAG_KEYWORD, RETURNS_KEYWORD, LEFT_KEYWORD, FILTER_KEYWORD
      , STDIN_KEYWORD, LIMIT_KEYWORD, COGROUP_KEYWORD, CHARARRAY_KEYWORD, DISTINCT_KEYWORD, THROUGH_KEYWORD
      , INPUT_KEYWORD, RIGHT_KEYWORD, TRUE_KEYWORD, INNER_KEYWORD, DOUBLE_KEYWORD, MAP_KEYWORD
      , CROSS_KEYWORD, AS_KEYWORD, VOID_KEYWORD, OUTPUT_KEYWORD, DEFINE_KEYWORD, PARTITION_KEYWORD
      , STDERROR_KEYWORD, IS_KEYWORD, SAMPLE_KEYWORD, JOIN_KEYWORD
  );
  TokenSet BRACES_SET = TokenSet.create(LBRACE, RBRACE);
  TokenSet BRACKET_SET = TokenSet.create(LBRACK, RBRACK);
  TokenSet PARENTH_SET = TokenSet.create(LPARENTH, RPARENTH);
}
