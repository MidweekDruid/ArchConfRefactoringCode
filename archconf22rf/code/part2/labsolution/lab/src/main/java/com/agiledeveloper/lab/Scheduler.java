package com.agiledeveloper.lab;

import java.io.IOException;
import java.time.DayOfWeek;

public class Scheduler {
  private Writer writer;

  private Scheduler(Writer writer) {
    this.writer = writer;
  }

  public static Scheduler create() throws IOException {
    return create(new StringWriter());
  }

  public static Scheduler create(Writer writer) throws IOException {
    Scheduler scheduler = new Scheduler(writer);
    writer.write("Schedule created:");
    return scheduler;
  }

  public Writer getWriter() {
    return writer;
  }

  public void writeFor(DayOfWeek dayOfWeek) throws IOException {
    //There are three ways we can improve this code.
    //1. Use a Map
    //2. Use Map.of to create the instance
    //3. switch expression

    writer.write(switch(dayOfWeek) {
      case SUNDAY -> "~Sunday - Homework";
      case MONDAY -> "~Monday - Swimming";
      case TUESDAY -> "~Tuesday - Music";
      case WEDNESDAY -> "~Wednesday - Tennis";
      case THURSDAY -> "~Thursday - Music";
      case FRIDAY -> "~Friday - Relax";
      case SATURDAY -> "~Saturday - Community";
    });
  }
}
