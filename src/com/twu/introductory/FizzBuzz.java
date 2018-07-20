package com.twu.introductory;

/**
 * Created by jin on 20/07/2018.
 */
class FizzBuzz {
  String getFizzBuzzValue(int n) {
    if (n % 15 == 0) {
      return "FizzBuzz";
    }
    if (n % 3 == 0) {
      return "Fizz";
    }
    if (n % 5 == 0) {
      return "Buzz";
    }
    return String.valueOf(n);
  }

  String fizzBuzz(int num) {
    StringBuilder result = new StringBuilder();
    for (int i = 1; i <= num; i++) {
      result.append(getFizzBuzzValue(i)).append("\n");
    }
    return result.toString();
  }
}
