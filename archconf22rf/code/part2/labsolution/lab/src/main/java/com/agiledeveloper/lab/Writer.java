package com.agiledeveloper.lab;

import java.io.IOException;

public abstract class Writer {
  private boolean open = true;

  public final void write(String text) throws IOException {
    if(open) {
      writeContents(text);
    }
  }

  protected abstract void writeContents(String text) throws IOException;

  public final void close() {
    open = false;
  }
}
