package com.umcs;

import java.util.Scanner;

class Input {
  private static Scanner input = new Scanner(System.in);

  static double get(String varName) {
    System.out.print("Podaj " + varName + ": ");
    return input.nextDouble();
  }

  static Integer getOperation(){
    System.out.print("Podaj nr operacji: ");
    return input.nextInt();
  }
}
