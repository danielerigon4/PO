package com.company;
import java.util.Scanner;

public class Arr {
    Scanner in = new Scanner(System.in);
    int [] arrayClasse;
    int dimensione, contatore = 0, indice = 0, valore;
    int[] minmax = new int[2];

    /*costruttore*/
    public void costruttore(){
        System.out.println("Inserisci dimensione");
        dimensione = in.nextInt();  /*dimensione array*/
        arrayClasse = new int[dimensione];
    }

    /*metodi d'accesso*/
    public void MinMax(){
        int max=arrayClasse[0], min=arrayClasse[0];
        for (int i = 0; i < dimensione; i++){
            max = (arrayClasse[i] > max) ? arrayClasse[i] : max;
            min = (arrayClasse[i] < min) ? arrayClasse[i] : min;
        }
        minmax[0]=min;
        minmax[1]=max;
    }

    public int getMin(){
        return minmax[0];
    }

    public int getMax(){
        return minmax[1];
    }

    public void inserisci(){
        while(contatore < dimensione) {
            System.out.println("Inserisci valore da inserire");
            valore = in.nextInt();  /*valore da inserire*/
            arrayClasse[indice] = valore; /*inserisco il valore all'interno dell'array in indice continuo*/
            contatore++;    /*aggiorno contatore e indice, scorrono avanti di uno*/
            indice++;
        }
        if(contatore==dimensione){
            System.out.println("Ok,l'array è pieno");
        }
    }

    public void stampaArray(){
        System.out.print("{");
        for(int j = 0; j < dimensione-1; j++){
            System.out.print(" "+arrayClasse[j]);
            System.out.print(", ");
        }
        System.out.println(arrayClasse[dimensione-1] + " }");
    }
}