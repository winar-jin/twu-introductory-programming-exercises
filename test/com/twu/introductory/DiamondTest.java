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

  @Test
  public void should_return_a_centered_diamond_with_centered_method() {
    assertEquals("  *\n ***\n*****\n ***\n  *", diamond.centered(3));
  }

  @Test
  public void should_return_diamond_with_name_with_nameDiamond_method() {
    assertEquals("  *\n ***\nBill\n ***\n  *", diamond.nameDiamond(3, "Bill"));
  }
}