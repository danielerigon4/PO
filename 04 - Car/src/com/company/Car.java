package com.company;

public class Car {
    double resa=0, carburante=0;
    String carb;

    public void drive(int km, int resa){
        this.carburante = this.carburante - (km/resa);
    }
    public double getGas(){
        return this.carburante;
    }
    public void addGas(int quantità){
        this.carburante = this.carburante + quantità;
    }

    /*metodi aggiuntivi classe*/
    public boolean isDiesel(){
        if (carb == "gasolio")
            return true;
        return false;
    }
}
