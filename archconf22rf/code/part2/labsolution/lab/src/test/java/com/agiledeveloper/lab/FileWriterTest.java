package com.agiledeveloper.lab;

import org.junit.jupiter.api.AfterEach;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.util.stream.Collectors.joining;

public class FileWriterTest extends WriterTest {
  private final String fileName = "sample.txt";

  protected Writer create() throws IOException {
    return new FileWriter(fileName);
  }

  @AfterEach
  void tearDown() throws IOException {
    Files.deleteIfExists(Paths.get("sample.txt"));
  }

  protected String getContents() throws IOException {
    return
      Files.exists(Paths.get(fileName)) ?
      Files.lines(Paths.get(fileName))
      .collect(joining("")) : "";
  }
}
