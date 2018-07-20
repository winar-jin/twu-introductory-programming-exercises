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

  String right(int n) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < n; i++) {
      result.append(horizontal(i + 1));
      if ((i + 1) != n) result.append("\n");
    }
    return result.toString();
  }
}
