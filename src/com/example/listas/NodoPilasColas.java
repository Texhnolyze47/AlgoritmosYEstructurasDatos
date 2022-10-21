package com.example.listas;

public class NodoPilasColas {
    // dato del numero a ingresar al nodo
    private int dato;
    // Objeto para posicionar el nodo a la izquierda
    private NodoPilasColas next;
    // Objeto para posicinar el nodo a la derecha
    private NodoPilasColas previous;
    //construtor para colocar el dato dentro de nuestro nodo
    public NodoPilasColas(int x){
        dato = x;
    }

    public NodoPilasColas(int x, NodoPilasColas n){
        dato = x;
        next = n;
    }

    public NodoPilasColas(int dato, NodoPilasColas next, NodoPilasColas previous) {
        this.dato = dato;
        this.next = next;
        this.previous = previous;
    }

    public NodoPilasColas() {
    }
    // getters y setters

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoPilasColas getNext() {
        return next;
    }

    public void setNext(NodoPilasColas next) {
        this.next = next;
    }

    public NodoPilasColas getPrevious() {
        return previous;
    }

    public void setPrevious(NodoPilasColas previous) {
        this.previous = previous;
    }
}


