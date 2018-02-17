package com.company;

import java.util.ArrayList;

public class Borsellino {
    ArrayList<String> coins = new ArrayList<String>();

    public void addCoin(String coinName){
        coins.add(coinName);
    }
    /*visualizza le monete presenti nel borsellino, nel formato: Purse[Quarter, Dime, Nickel, Dime] */
    public void output(){
        System.out.print(" [ ");
        for (int i=0; i< coins.size();i++){
            System.out.print(" "+coins.get(i)+" ");
        }
        System.out.println(" ] ");
    }
}
