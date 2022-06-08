package com.agiledeveloper.lab;

public class StringWriter extends Writer {
  private StringBuilder contents = new StringBuilder();

  @Override
  protected void writeContents(String text) {
    contents.append(text);
  }

  public String getContents() {
    return contents.toString();
  }
}
