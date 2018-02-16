package com.company;

public class Distributore {
    double deposito = 0; /*contiene il quantitativo di benzina disponibile al distributore*/
    double euroPerLitro; /*rappresenta il prezzo della benzina, espresso in euro per litro.*/

    /*costruttore*/
    public Distributore (double euroPerLitro){
        this.euroPerLitro=euroPerLitro;
    }

    /*rifornisce il distributore di benzina*/
    public void Rifornisci(double quantita){
        deposito = deposito + quantita;
    }

    /*vende una quantita' di benzina corrispondente all'ammontare di euro pagato, specificato dal parametro esplicito del metodo.*/
    public void vendi(double euro){
        deposito = deposito - (euro/euroPerLitro);
    }

    /*aggiorna il prezzo della benzina.*/
    public void aggiorna(double euroPerLitro){
        this.euroPerLitro = euroPerLitro;
    }

    public double saldo(){
        return this.deposito;
    }
}