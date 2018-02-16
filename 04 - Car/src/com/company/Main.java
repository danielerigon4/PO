package com.company;
/*
* Progettare e realizzare una classe Car(automobile) con le proprietà seguenti.
Un’automobile ha una determinata resa del carburante (misurata in miglia/galloni
o in litri/chilometri: scegliete il sistema che preferite) e una certa quantità
di carburante nel serbatoio. La resa è specificata dal costruttore e il livello
iniziale del carburante è a zero. Fornire questi metodi: un metodo drive per
simulare il percorso di un’automobile per una certa distanza, riducendo il
livello di carburante nel serbatoio; un metodo getGas, per ispezionare il
livello corrente del carburante; un metodo addGas per far rifornimento.


Modificate la classe Car dell'esercizio precedente aggiungendo una nuova
variabile d'istanza String carburante. Se tale variabile vale "verde", allora
l'automobile consuma benzina verde, se tale variabile vale "gasolio", allora
l'automobile consuma gasolio. Scrivere inoltre un nuovo metodo predicato boolean
isDiesel, che restituisce true nel caso l'automobile consumi gasolio e false
altrimenti.
* */
public class Main {

    public static void main(String[] args) {
        Car macchina = new Car();
        int carburante = 50, km = 20, resa = 10;
        String tipocarburante = "verde";
        macchina.addGas(carburante);
        macchina.drive(km,resa);
        System.out.println("Dopo " + km + " km sono rimasti " + macchina.getGas() + " litri di carburante");
        System.out.println("E' diesel: " + macchina.isDiesel());
    }
}
