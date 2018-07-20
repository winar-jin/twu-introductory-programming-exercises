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
    assertEquals("1", fizzBuzz.fizzBuzz(1));
  }

  @Test
  public void should_output_Fizz_when_the_input_can_divided_by_3() {
    assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
  }

  @Test
  public void should_output_Buzz_when_the_input_can_divided_by_5() {
    assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
  }

  @Test
  public void should_return_FizzBuzz_when_the_input_can_divided_by_3_and_5() {
    assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
  }
}