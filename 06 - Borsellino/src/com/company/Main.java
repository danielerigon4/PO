package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/*
* Realizzare una classe Purse (“borsellino”), i cui esemplari siano adatti a
contenere uan raccolta di monete. Per semplicità, si memorizzeranno
semplicemente i nomi delle monete in un ArrayList<String>.
Fornine un metodo void addCoin(String coinName) e un metodo toString che
visualizzi le monete presenti nel borsellino, nel formato seguente:
Purse[Quarter, Dime, Nickel, Dime].
Consigli:
Il metodo non presenta particolari difficoltà. Si raccomanda d’importare
solamente la classe ArrayList, altrimenti Java non riesce ad individuare il
comando “add” del metodo void addCoin (String coinName).
* */
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Borsellino borsa = new Borsellino();
        System.out.println("1 - Inserisci moneta, 0 per uscire");
        int scelta = in.nextInt();
        while(scelta == 1){
                 System.out.println("Inserisci moneta");
                 String moneta = scan.nextLine();
                 borsa.addCoin(moneta);
                 System.out.println("1 - Inserisci moneta, 0 per uscire");
                 scelta = in.nextInt();
        }
        borsa.output();
    }
}