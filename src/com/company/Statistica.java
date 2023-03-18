package com.company;




public class Statistica {

    private Dato[] dati;
    private int count;

    public Statistica() {
        Dato[]  dati = new Dato[3];
        count = 0;
    }

    public Dato getDato(int k){
        return dati[k];
    }

    public void addDato(String cognome, String nome, float Altezza){
        Dato dati2 = new Dato(nome, cognome, Altezza);
        dati[count] = dati2;
        count++;
    }

    public int getCount(int count){
        return count;
    }
}
