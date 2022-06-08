package com.agiledeveloper.lab;

public class StringWriterTest extends WriterTest {
  private StringWriter writer;

  protected Writer create() {
    writer = new StringWriter();
    return writer;
  }

  protected String getContents() {
    return writer.getContents();
  }
}
