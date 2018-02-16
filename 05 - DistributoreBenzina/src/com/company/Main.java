package com.company;
/*
* Progettare una classe di nome DistributoreBenzina, per rappresentare un
distributore di carburante per automobili. Tale classe prevede due variabili
d'istanza. La prima variabile d'istanza e' chiamata deposito, e' di tipo double,
e contiene il quantitativo di benzina disponibile al distributore. La seconda
variabile d'istanza e' chiamata euroPerLitro, e' di tipo double, e rappresenta
il prezzo della benzina, espresso in euro per litro.
La classe deve implementare un costruttore public DistributoreBenzina(double
unPrezzoPerLitro), che prende come parametro esplicito il prezzo in euro per un
litro di benzina. La quantita' iniziale di benzina disponibile e' zero. La
classe deve inoltre implementare i seguenti metodi. Un metodo definito come
public void rifornisci(double unaQuantita), che rifornisce il distributore di
benzina. Un metodo definito come public void vendi(double euro), che vende una
quantita' di benzina corrispondente all'ammontare di euro pagato, specificato
dal parametro esplicito del metodo. Infine, un metodo definito come public void
aggiorna(double unPrezzoPerLitro), che aggiorna il prezzo della benzina.

------------------------------------------------------------------------------

Modificare la classe DistributoreBenzina, assegnata nell’esercizio precedente,
in modo che il distributore abbia due pompe, una di benzina verde ed una di
gasolio. Ciascun tipo di carburante ha il suo costo per litro. Conseguentemente,
dovrete raddoppiare il metodo rifornisci: dovrete avere un metodo per rifornire
la benzina verde ed un metodo per rifornire il gasolio. Il metodo vendi deve
essere modificato nel seguente modo: public void vendi(double euro, Car
unaAutomobile). Tale metodo rifornisce l'automobile specificata come parametro
esplicito nel modo appropriato (verde oppure gasolio).
* */
public class Main {

    public static void main(String[] args) {
        double euroLitro = 1.5;
        double quantita = 500;
        double euro = 20;
        Distributore dis = new Distributore(euroLitro);
        dis.Rifornisci(quantita);     /*rifornisco distributore*/
        dis.vendi(euro);              /*faccio benzina con tot euro*/
        dis.aggiorna(euroLitro+1);
        dis.vendi(euro);
        System.out.println("Sono rimasti: " + dis.saldo() + " litri");
    }
}
