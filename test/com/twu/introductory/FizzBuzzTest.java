package com.twu.introductory;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jin on 20/07/2018.
 */
public class FizzBuzzTest {
  static FizzBuzz fizzBuzz;

  @BeforeClass
  static public void beforeClass() {
    fizzBuzz = new FizzBuzz();
  }

  @Test
  public void should_output_1_when_the_input_is_1() {
    assertEquals("1", fizzBuzz.fizzBuzz());
  }

}