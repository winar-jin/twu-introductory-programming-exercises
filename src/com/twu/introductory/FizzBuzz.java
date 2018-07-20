package com.twu.introductory;

/**
 * Created by jin on 20/07/2018.
 */
class FizzBuzz {
  String fizzBuzz(int n) {
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
}
