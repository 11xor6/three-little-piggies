package com.metamx.idea;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

import java.lang.annotation.Annotation;

/**
 *
 */
public class PigFileTypeFactory extends FileTypeFactory
{
  @Override
  public void createFileTypes(@NotNull FileTypeConsumer consumer)
  {

//    consumer.consume(); TODO: Must be filled with Pig language.
  }
}
