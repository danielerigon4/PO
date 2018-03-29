package com.company;
/*classe Cliente, avente il nominativo (stringa) come variabile d’istanza;*/
public class Cliente {
    private String cliente;

    public Cliente(String client){
        this.cliente=client;
    }

    public String getNome() {
        return cliente;
    }
}
