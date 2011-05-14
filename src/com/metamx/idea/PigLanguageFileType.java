package com.metamx.idea;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 *
 */
public class PigLanguageFileType extends LanguageFileType
{
  /**
   * Creates a language file type for the specified language.
   *
   * @param language The language used in the files of the type.
   */
  protected PigLanguageFileType(@NotNull Language language)
  {
    super(language);

  }


  @NotNull
  public String getName()
  {
    return "Pig";
  }

  @NotNull
  public String getDescription()
  {
    return "The Pig language for HADOOP";
  }


  @NotNull
  public String getDefaultExtension()
  {
    return "pig";
  }

  public Icon getIcon()
  {
    return null;
  }
}
