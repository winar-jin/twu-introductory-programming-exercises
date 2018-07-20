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

  @Test
  public void should_return_n_asterisks_with_horizontal_method() {
    assertEquals("********", triangle.horizontal(8));
  }

  @Test
  public void should_return_n_line_asterisks_with_vertical_method() {
    assertEquals("*\n*\n*", triangle.vertical(3));
  }

  @Test
  public void should_return_n_line_right_triangle_with_right_method() {
    assertEquals("*\n**\n***", triangle.right(3));
  }
}
