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
    assertEquals("1", fizzBuzz.getFizzBuzzValue(1));
  }

  @Test
  public void should_output_Fizz_when_the_input_can_divided_by_3() {
    assertEquals("Fizz", fizzBuzz.getFizzBuzzValue(3));
  }

  @Test
  public void should_output_Buzz_when_the_input_can_divided_by_5() {
    assertEquals("Buzz", fizzBuzz.getFizzBuzzValue(5));
  }

  @Test
  public void should_return_FizzBuzz_when_the_input_can_divided_by_3_and_5() {
    assertEquals("FizzBuzz", fizzBuzz.getFizzBuzzValue(15));
  }

  @Test
  public void should_return_right_FuzzBuzz_number_from_1_15() {
    assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n", fizzBuzz.fizzBuzz(15));
  }
}