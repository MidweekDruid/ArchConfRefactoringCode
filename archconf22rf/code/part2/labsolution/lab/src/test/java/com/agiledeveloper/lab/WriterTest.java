package com.agiledeveloper.lab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class WriterTest {
  protected abstract Writer create() throws IOException;
  private Writer writer;

  protected abstract String getContents() throws IOException;

  @BeforeEach
  void init() throws IOException {
    writer = create();
  }

  @Test
  void checkContents() throws IOException {
    assertEquals("", getContents());
  }

  @Test
  void writeContents() throws IOException {
    writer.write("hello");

    assertEquals("hello", getContents());
  }

  @Test
  void writeContentsTwice() throws IOException {
    writer.write("hello");
    writer.write("world");

    assertEquals("helloworld", getContents());
  }

  @Test
  void writeAfterClose() throws IOException {
    writer.write("hello");
    writer.close();
    writer.write("world");

    assertEquals("hello", getContents());
  }

  @Test
  void closeBeforeWrite() throws IOException {
    writer.close();
    writer.write("nope");

    assertEquals("", getContents());
  }
}
