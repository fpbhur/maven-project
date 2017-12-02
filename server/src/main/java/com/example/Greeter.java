package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

   /**
   * This is is a class reurn with hello
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
