package com.umcs;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i=0; i < 30; i ++) {
            System.out.println("FOR " + i);
        }
        int i = 0;
        while (i < 30) {
            System.out.println("WHILE " + i);
            i++;
        }
        int j = 0;
        do {
            System.out.println("DO WHILE " + j);
            j++;
        } while (j < 30);


        Scanner input = new Scanner(System.in);

        String[] arr = {"Java", "C++", "C#", "Haskell", "GO", "JavaScript"};
        for (String rzecz :
                arr) {
            System.out.println("Teraz mysle o: " + rzecz);
        }
        List<Czlowiek> ppl = new ArrayList<Czlowiek>() {{
            add(new Czlowiek("michal","Michal" , "Zmudziak"));
            add(new Czlowiek("arek", "Arek", "Kowalski"));
            add(new Czlowiek("lolek", "Remigiusz", "Zych"));
        }};
        String login, password;
        System.out.println("Zaloguj się:");
        System.out.println("Login: ");
        login = input.nextLine();

        Czlowiek on = ppl.stream().filter(p -> p.getLogin().equals(login)).findFirst().orElse(null);
        if (on != null) {
            System.out.println("Witaj " + on.getName() + " " + on.getSurname());

        } else {
            System.out.println("Nie znam cie: " +login);
        }
    }
}



