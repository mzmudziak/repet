package com.umcs;

class Matematyka {
  static double add(double x, double y) {
    return x + y;
  }

  static double subtract(double x, double y) {
    return x - y;
  }

  static double multiply(double x, double y) {
    return x * y;
  }

  static double divide(double x, double y) {
    if(y == 0) {
      System.out.println("Nie dziel przez ZERO!!");
      return 0;
    }
    return x / y;
  }

  static double root(double x) {
    return Math.sqrt(x);
  }

  static double floor(double x) {
    return Math.floor(x);
  }

  static double ceiling(double x) {
    return Math.ceil(x);
  }
}
