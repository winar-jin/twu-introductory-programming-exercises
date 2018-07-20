package com.twu.introductory;

class Triangle {


  String easy() {
    return "*";
  }

  String horizontal(int n) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < n; i++) {
      result.append("*");
    }
    return result.toString();
  }
}
