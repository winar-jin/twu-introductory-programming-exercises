package com.twu.introductory;

import java.util.Arrays;

/**
 * Created by jin on 20/07/2018.
 */
class Diamond {

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

  String centered(int n) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < 2 * n - 1; i++) {
      for (int j = 0; j < Math.abs(n - i - 1); j++) {
        result.append(" ");
      }
      result.append(horizontal(n - 1 - Math.abs(n - i - 1)));
      if (i + 1 != 2 * n - 1) result.append("\n");
    }
    return result.toString();
  }

  String nameDiamond(int n, String name) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < 2 * n - 1; i++) {
      for (int j = 0; j < Math.abs(n - i - 1); j++) {
        result.append(" ");
      }
      if (i + 1 != n) {
        result.append(horizontal(n - 1 - Math.abs(n - i - 1)));
      } else {
        result.append(name);
      }
      if (i + 1 != 2 * n - 1) result.append("\n");
    }
    return result.toString();
  }
}
