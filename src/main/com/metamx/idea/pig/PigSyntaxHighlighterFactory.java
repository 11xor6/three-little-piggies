package com.metamx.idea.pig;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.SyntaxHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/**
 *
 */
public class PigSyntaxHighlighterFactory extends SyntaxHighlighterFactory
{
  @NotNull
  @Override
  public SyntaxHighlighter getSyntaxHighlighter(Project project, final VirtualFile virtualFile)
  {
    return new SyntaxHighlighterBase()
    {
      @NotNull
      @Override
      public Lexer getHighlightingLexer()
      {
        try {
          return new FlexAdapter(new PigLexer(virtualFile.getInputStream()));
        }
        catch (IOException e) {
          throw new RuntimeException(e);
        }
      }

      @NotNull
      @Override
      public TextAttributesKey[] getTokenHighlights(IElementType tokenType)
      {
        int i = 0;
        TextAttributesKey[] tak = new TextAttributesKey[5];
        if (PigTokenType.KEYWORD_SET.contains(tokenType)) {
          tak[i++] = SyntaxHighlighterColors.KEYWORD;
        }

        if (PigTokenType.C_STYLE_COMMENT.equals(tokenType)) {
          tak[i++] = SyntaxHighlighterColors.JAVA_BLOCK_COMMENT;
        }

        if (PigTokenType.END_OF_LINE_COMMENT.equals(tokenType)) {
          tak[i++] = SyntaxHighlighterColors.LINE_COMMENT;
        }

        if (PigTokenType.DOC_COMMENT.equals(tokenType)) {
          tak[i++] = SyntaxHighlighterColors.DOC_COMMENT;
        }

        if (PigTokenType.STRING_SET.contains(tokenType)) {
          tak[i++] = SyntaxHighlighterColors.STRING;
        }

        if (PigTokenType.NUMBER_SET.contains(tokenType)) {
          tak[i++] = SyntaxHighlighterColors.NUMBER;
        }

        if (PigTokenType.SYMBOL_SET.contains(tokenType)) {
          tak[i++] = SyntaxHighlighterColors.OPERATION_SIGN;
        }

        if (PigTokenType.STRING_OP_SET.contains(tokenType)) {
          tak[i++] = SyntaxHighlighterColors.OPERATION_SIGN;
        }

        if (PigTokenType.COMPARISION_OP_SET.contains(tokenType)) {
          tak[i++] = SyntaxHighlighterColors.OPERATION_SIGN;
        }

        if (PigTokenType.BOOLEAN_OP_SET.contains(tokenType)) {
          tak[i++] = SyntaxHighlighterColors.OPERATION_SIGN;
        }

        if (PigTokenType.BRACES_SET.contains(tokenType)) {
          tak[i++] = SyntaxHighlighterColors.BRACES;
        }

        if (PigTokenType.BRACKET_SET.contains(tokenType)) {
          tak[i++] = SyntaxHighlighterColors.BRACKETS;
        }

        if (PigTokenType.PARENTH_SET.contains(tokenType)) {
          tak[i++] = SyntaxHighlighterColors.PARENTHS;
        }

        return tak;
      }
    };
  }
}
