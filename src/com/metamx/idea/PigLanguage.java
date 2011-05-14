package com.metamx.idea;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 *
 */
public class PigLanguage extends Language
{
  protected PigLanguage(@NotNull @NonNls String id)
  {
    super(id);
  }

  protected PigLanguage(
      @NotNull @NonNls String ID,
      @NotNull @NonNls String... mimeTypes
  )
  {
    super(ID, mimeTypes);
  }

  protected PigLanguage(
      @Nullable Language baseLanguage,
      @NotNull @NonNls String ID,
      @NotNull @NonNls String... mimeTypes
  )
  {
    super(baseLanguage, ID, mimeTypes);
  }
}
