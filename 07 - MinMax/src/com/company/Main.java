package com.company;

import java.util.Scanner;

/*Scrivere un programma che individui il valore massimo e minimo all’interno di
un’ array.
------
Provare a implementarlo anche con le liste
*/
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1 - Array, 2 Liste");
        int scelta = in.nextInt();    /*sceglie se implementare con array o liste*/
        if (scelta == 1){   /*array*/
            System.out.println("VERSIONE ARRAY");
            Arr a = new Arr();
            a.costruttore();
            a.inserisci();
            a.stampaArray();
            a.MinMax();
            System.out.println("Max: "+a.getMax());
            System.out.println("Min: "+a.getMin());
        }   /*fine implementazione array*/

        else{   /*liste*/

        }
    }
}
