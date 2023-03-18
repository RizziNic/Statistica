package com.company;

public class Dato {
    private String cognome;
    private String nome;
    private float altezza;

    Dato(String cognome,String nome,float altezza) {
        this.cognome = cognome;
        this.nome = nome;
        this.altezza = altezza;
    }

    public String getCognome(){
        return this.cognome = cognome;
    }

    public String getNome(){
        return this.nome = nome;
    }
    public float getAltezza(){
        return this.altezza = altezza;
    }
}
