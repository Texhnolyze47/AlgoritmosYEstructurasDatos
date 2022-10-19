package com.example.listas;

public class Nodo {
    // dato del numero a ingresar al nodo
    private int dato;
    // Objeto para posicionar el nodo a la izquierda
    private Nodo next;
    // Objeto para posicinar el nodo a la derecha
    private Nodo previous;
    //construtor para colocar el dato dentro de nuestro nodo
    public Nodo (int x){
        dato = x;
    }

    public Nodo (int x,Nodo n){
        dato = x;
        next = n;
    }

    public Nodo(int dato, Nodo next, Nodo previous) {
        this.dato = dato;
        this.next = next;
        this.previous = previous;
    }

    public Nodo() {
    }
    // getters y setters

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getPrevious() {
        return previous;
    }

    public void setPrevious(Nodo previous) {
        this.previous = previous;
    }
}


