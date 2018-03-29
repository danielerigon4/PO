package com.company;
/*classe Automobile avente come variabili d’istanza il numero di targa della vettura
(intero) e un riferimento al proprietario della classe Cliente.*/
public class Automobile {
    private int targa;
    private Cliente properietario;

    public Automobile(int t, Cliente p){
        this.targa=t;
        this.properietario=p;
    }

    public int getTarga() {
        return targa;
    }

    public Cliente getProprietario(){
        return properietario;
    }
}
