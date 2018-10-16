package com.umcs;

import java.util.Scanner;

/**
 * 1101
 */
public class Main {
    public static void main(String[] args) {
        listOptions();
        int choice = 1;
        while (choice != 0) {
            choice = Input.getOperation();
            System.out.print("Wynik: " + calculate(choice));
            System.out.println();
        }
    }

    private static void listOptions(){
        System.out.println("1) Dodawanie - (x, y) => x + y");
        System.out.println("2) Odejmowanie - (x, y) => x - y");
        System.out.println("3) Mnożenie - (x, y) => x * y");
        System.out.println("4) Dzielenie - (x, y) => x / y");
        System.out.println("5) Pierwiastek kwadratowy - (x) => sqrt(x)");
        System.out.println("6) Podłoga - (x) => floor(x)");
        System.out.println("7) Sufit - (x) => ceil(x)");
    }

    private static double calculate(Integer choice) {
        switch (choice) {
            case 1:
                System.out.println("--- 1 - DODAWANIE ---");
                return Matematyka.add(Input.get("X"), Input.get("Y"));
            case 2:
                System.out.println("--- 2 - ODEJMOWANIE ---");
                return Matematyka.subtract(Input.get("X"), Input.get("Y"));
            case 3:
                System.out.println("--- 3 - MNOZENIE ---");
                return Matematyka.multiply(Input.get("X"), Input.get("Y"));
            case 4:
                System.out.println("--- 4 - DZIELENIE ---");
                return Matematyka.divide(Input.get("X"), Input.get("Y"));
            case 5:
                System.out.println("--- 5 - PIERWIASTEK KWADRATOWY ---");
                return Matematyka.root(Input.get("X"));
            case 6:
                System.out.println("--- 6 - PODŁOGA ---");
                return Matematyka.floor(Input.get("X"));
            case 7:
                System.out.println("--- 7 - SUFIT ---");
                return Matematyka.ceiling(Input.get("X"));
            default:
                System.out.println("Nieprawidłowy numer operacji :(");
                return 0;
        }
    }
}



