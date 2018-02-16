package com.company;

public class BankAccount {
    double balance=0;

    public void versa(int versamento){
        this.balance=this.balance+versamento;
    }
    public void preleva(int prelievo){
        this.balance=this.balance-prelievo;
    }
    public double saldo(){
        return this.balance;
    }
    public void interessi(int tasso){
        this.balance=this.balance+(tasso*this.balance /100);
    }
    public void inizializza(){
        this.balance=0;
    }

}