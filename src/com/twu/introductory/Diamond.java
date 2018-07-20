package com.twu.introductory;

/**
 * Created by jin on 20/07/2018.
 */
public class Diamond {

  String horizontal(int n) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < 2 * n + 1; i++) {
      result.append("*");
    }
    return result.toString();
  }

  String isosceles(int n) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        result.append(" ");
      }
      result.append(horizontal(i));
      if (i + 1 != n) result.append("\n");
    }
    return result.toString();
  }
}
