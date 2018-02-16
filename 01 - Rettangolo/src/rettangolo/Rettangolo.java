/*
Si costruisce un rettangolo partendo da una base, un’altezza e dalle coordinate
del piano. 
 */
package rettangolo;

import java.util.*;

public class Rettangolo {
    public static void main(String[] args) {
        Rect r = new Rect();
        Scanner in=new Scanner(System.in);
        System.out.println("Base: ");
        int base=in.nextInt();
        r.setBase(base);
        System.out.println("Altezza");
        int altezza=in.nextInt();
        r.setAltezza(altezza);
        System.out.println("Area: "+r.getArea());
        System.out.println("Perimetro: "+r.getPerimetro());
        System.out.println("Cambia base, inserisci valore");
        base=in.nextInt();
        r.setBase(base);
        System.out.println("Cambia altezza, inserisci valore");
        altezza=in.nextInt();
        r.setAltezza(altezza);
        System.out.println("Nuova area: "+r.getArea());
        System.out.println("Nuovo perimetro: "+r.getPerimetro());
    }
    
}
