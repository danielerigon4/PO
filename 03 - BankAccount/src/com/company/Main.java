package com.company;
import java.util.Scanner;
/*
* Es. 3.1: scrivere un programma che costruisca un conto bancario chiamato
harrysChecking, versi in esso $1000, prelevi da esso $500, prelevi altri $400 e
infine visualizzi il saldo rimanente.
Il programma deve poi creare un altro conto bancario chiamato momsSaving,
utilizzando il costruttore che inizializza la variabile balance.
Su quest’ultimo conto deve essere poi applicato un interesse del 10%, a seguito
del quale viene stampato il saldo.

--> fare anche una versione che prende dati in input
* */
public class Main {

    public static void main(String[] args) {
        System.out.println("VERSIONE NON INTERATTIVA");
        BankAccount harrysChecking = new BankAccount();
        int tassoInteresse;
        harrysChecking.versa(1000);
        harrysChecking.preleva(500);
        harrysChecking.preleva(400);
        System.out.println("Saldo: "+harrysChecking.saldo());

        BankAccount momSaving=new BankAccount();
        momSaving.inizializza();
        momSaving.versa(2000);
        momSaving.preleva(200);
        momSaving.interessi(10);
        System.out.println("Saldo con interessi: "+momSaving.saldo());

        System.out.println("VERSIONE INTERATTIVA");
        Scanner in = new Scanner(System.in);
        harrysChecking.inizializza();
        momSaving.inizializza();
        System.out.println("Inserisci quanto vuoi versare");
        int versamento=in.nextInt();
        harrysChecking.versa(versamento);
        System.out.println("Inserisci quanto prelevare");
        int prelievo=in.nextInt();
        harrysChecking.preleva(prelievo);
        System.out.println("1 - Saldo senza interessi, 2 - Saldo con interessi");
        int scelta = in.nextInt();
        switch(scelta){
            case 1:
                System.out.println("Saldo: "+harrysChecking.saldo());
                break;
            case 2:
                momSaving.balance=harrysChecking.balance;
                System.out.println("Inserisci il tasso di interesse");
                tassoInteresse=in.nextInt();
                momSaving.interessi(tassoInteresse);
                System.out.println("Con interessi: "+momSaving.saldo());
                break;
            default:
                break;
        }
    }
}
