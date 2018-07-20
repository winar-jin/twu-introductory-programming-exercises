package com.twu.introductory;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jin on 20/07/2018.
 */
public class DiamondTest {
  static Diamond diamond;

  @BeforeClass
  public static void beforeClass() {
    diamond = new Diamond();
  }

  @Test
  public void should_return_a_isosceles_triangle_with_isosceles_method() {
    assertEquals("  *\n ***\n*****", diamond.isosceles(3));
  }
}