package com.twu.introductory;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by jin on 20/07/2018.
 */
public class PrimeFactorsTest {
  static PrimeFactors primeFactors;

  @BeforeClass
  static public void beforeClass() {
    primeFactors = new PrimeFactors();
  }

  @Test
  public void should_return_empty_list_when_generate_1() {
    ArrayList<Integer> expect = new ArrayList<Integer>();
    assertEquals(expect, primeFactors.generate(1));
  }

  @Test
  public void should_return_prime_factors_array_with_increasing_numerical_order() {
    ArrayList<Integer> expect = new ArrayList<Integer>();
    expect.add(2);
    expect.add(3);
    expect.add(5);
    assertEquals(expect, primeFactors.generate(30));
  }
}