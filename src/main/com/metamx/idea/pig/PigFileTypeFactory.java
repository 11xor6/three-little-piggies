package com.metamx.idea.pig;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 *
 */
public class PigFileTypeFactory extends FileTypeFactory
{
  @Override
  public void createFileTypes(@NotNull FileTypeConsumer consumer)
  {
    consumer.consume(
        new LanguageFileType(new PigLanguage("PigLanguage"))
        {
          private final ImageIcon ICON = new ImageIcon("src/main/resources/pig-on-elephant.png");

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
            return ICON;
          }
        }, "pig"
    );

  }

}
