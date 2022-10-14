package com.example.listas;

public class Nodo {
    int dato;
    Nodo enlace;


    public Nodo (int x){
        dato = x;
        enlace = null;
    }
    public Nodo (int x,Nodo n){
        dato = x;
        enlace = n;

    }
    public int getDato(){ return dato; }

    public Nodo getEnlace(){ return enlace; }
    public void setEnlace(Nodo next){ this.enlace = next; }
    public String toString() {
        StringBuilder buffer = new StringBuilder(50);
        System.out.print(buffer);
        return buffer.toString();
    }
}


