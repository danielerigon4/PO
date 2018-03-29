package com.company;

public class Document {
    private String mystring;        /*crea un oggetto della classe Document*/
    public Document(String aMystring) {
        mystring = aMystring;
    }

    public int space_count(){  /*conta gli spazi bianchi presenti in una stringa*/
        int cont = 0;
        if (mystring.length() == 0)
            return cont;
        if (mystring.substring(0,1).equals(" "))
            cont ++;
        Document mystringshorter = new Document(mystring.substring(1));
        return cont + mystringshorter.space_count();
    }
}