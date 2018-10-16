package com.umcs;

import java.util.Scanner;

/**
 * 1101
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj X:");
            Integer x = input.nextInt();
            System.out.println("Podaj Y:");
            Integer y = input.nextInt();

            if(oppositeSign(x, y)) {
                System.out.println("Różne znaki!");
            } else {
                System.out.println("Takie same znaki!");
            }
        }
    }

    public static Boolean oppositeSign(Integer x, Integer y) {
        System.out.println("X: " + Integer.toBinaryString(x));
        System.out.println("Y: " + Integer.toBinaryString(y));
        System.out.println("^: " + (x ^ y));
        return (x ^ y) < 0;
    }
}



