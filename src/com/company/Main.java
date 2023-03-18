package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Statistica stat = new Statistica();


        System.out.println("MENU");
        System.out.println("1" + " aggiungi dato");
        System.out.println("2" + " visualizza dato");
        System.out.println("3" + " esci");

        int i = input.nextInt();
        while(i!=3) {
            switch (i) {
                case 1:
                    System.out.println("Cognome, nome, altezza");
                    String cognome = input.nextLine();
                    String nome = input.nextLine();
                    float altezza = input.nextFloat();
                    i = input.nextInt();
                    //stat.addDato("Rossi", "Marco", 192);
                    break;

                case 2:
                    System.out.println("Inserire numero da 1 a 3");
                    int k = input.nextInt();
                    System.out.println(stat.getDato(k).getNome());
                    System.out.println(stat.getDato(k).getCognome());
                    System.out.println(stat.getDato(k).getAltezza());
                    i = input.nextInt();
                    break;

                default:
                    break;
            }
        }



    }
}
