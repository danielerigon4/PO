package dado;

import java.util.Scanner;

public class DadoTest {
     public static void main(String[] args) {
        Dado dado = new Dado();
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci numero facce");
        int faces=in.nextInt();
        dado.setNumeroFacce(faces);
        System.out.println("Inserisci numero lanci");
        int numbersLanci=in.nextInt();
        dado.setNumeroFacce(numbersLanci);
        dado.getEstrazioni();
     }
}
