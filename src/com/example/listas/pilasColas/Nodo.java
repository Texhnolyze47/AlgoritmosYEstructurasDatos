package com.example.listas.pilasColas;

public class Nodo {
    int value;
    Nodo next;

    public Nodo(int value, Nodo next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
