package com.metamx.idea.pig;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public class PigParserDefinition implements ParserDefinition
{
  @NotNull
  public Lexer createLexer(Project project)
  {
    return null;
  }

  public PsiParser createParser(Project project)
  {
    return null;
  }

  public IFileElementType getFileNodeType()
  {
    return null;
  }

  @NotNull
  public TokenSet getWhitespaceTokens()
  {
    return null;
  }

  @NotNull
  public TokenSet getCommentTokens()
  {
    return null;
  }

  @NotNull
  public TokenSet getStringLiteralElements()
  {
    return null;
  }

  @NotNull
  public PsiElement createElement(ASTNode node)
  {
    return null;
  }

  public PsiFile createFile(FileViewProvider viewProvider)
  {
    return null;
  }

  public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right)
  {
    return null;
  }
}
