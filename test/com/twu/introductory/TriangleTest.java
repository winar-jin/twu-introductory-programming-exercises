package com.twu.introductory;


import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
  static Triangle triangle;

  @BeforeClass
  static public void beforeClass() {
    triangle = new Triangle();
  }

  @Test
  public void should_return_one_triangle_with_easy_method() {
    assertEquals("*", triangle.easy());
  }

}
