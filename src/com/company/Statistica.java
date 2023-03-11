package com.company;

public class Statistica {

    private Dato[] arr = new Dato[10];
    private int count;

    Statistica(Dato[] arr, int count){
        this.arr = arr;
        this.count = count;
    }
    public Dato[] getArr(Dato[] Arr){
        return arr;
    }
    public int getCount(int count){
        return count;
    }
}
