package com.example.listas;

public class Nodo {
    private int dato;
    private Nodo next;
    private Nodo previous;

    public Nodo (int x){
        dato = x;
        next = null;
        previous = null;
    }
    public Nodo (int x,Nodo n){
        dato = x;
        next = n;
    }

    public Nodo getPrevious() {
        return previous;
    }

    public void setPrevious(Nodo previous) {
        this.previous = previous;
    }


    public int getDato(){ return dato; }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getNext(){ return next; }
    public void setNext(Nodo next){ this.next = next; }

}


