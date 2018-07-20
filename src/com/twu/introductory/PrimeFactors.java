package com.twu.introductory;

import java.util.ArrayList;

/**
 * Created by jin on 20/07/2018.
 */
class PrimeFactors {
  ArrayList<Integer> generate(int n) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    int tracker = n;
    for (int i = 2; i <= tracker; i++) {
      if (tracker % i == 0) {
        result.add(i);
        tracker /= i;
      }
    }
    return result;
  }
}
