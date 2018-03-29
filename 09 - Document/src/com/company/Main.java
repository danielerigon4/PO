package com.company;
import javax.swing.*;
/*La classe JOptionPane si può utilizzare in sostituzione di System.out.print() o
println(). Tale classe va sempre importata all'inizio del documento con un
import javax.swing.JOptionPane.
I due principali metodi della classe JOptionPane sono showMessageDialog() e
showInputDialog():
- showMessageDialog() si usa quando si deve far comparire un messaggio non
interattivo (che non richiede dati in ingresso); la forma da utilizzare
all’interno delle parentesi è la seguente: showMessageDialog(null, "ciò che si
vuole scrivere tra virgolette o un metodo che non sia void").
- showInputDialog() si usa con i messaggi interattivi (che richiedono
inserimenti di dati); si fornisce come parametro la stringa che chiede
all’utente il dato in ingresso. Il metodo restituisce un oggetto di tipo String
(ecco perchè se si vogliono numeri o altri tipi è sempre necessario convertire
il tipo String in quello desiderato).
Testo:
Scrivere un programma che calcoli il numero di spazi bianchi presenti
all’interno di un testo.
Consigli:
Il metodo ricorsivo qui proposto risulta di facile comprensione: si crea una
sottostringa di lunghezza 1; se essa equivale ad uno spazio bianco, viene
incrementato il contatore di spazi vuoti.*/
public class Main {

    public static void main(String[] args) {
        /*showInputDialog() si usa con i messaggi interattivi (che richiedono
        inserimenti di dati); si fornisce come parametro la stringa che chiede
        all’utente il dato in ingresso. Il metodo restituisce un oggetto di tipo String
        (ecco perchè se si vogliono numeri o altri tipi è sempre necessario convertire
        il tipo String in quello desiderato).*/
        String a = JOptionPane.showInputDialog("Inserisci una stringa");

        Document stringa = new Document(a);

        /*showMessageDialog() si usa quando si deve far comparire un messaggio non
        interattivo (che non richiede dati in ingresso); la forma da utilizzare
        all’interno delle parentesi è la seguente: showMessageDialog(null, "ciò che si
        vuole scrivere tra virgolette o un metodo che non sia void").*/
        JOptionPane.showMessageDialog(null, stringa.space_count());
    }
}
