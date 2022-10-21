package com.example.listas.exercises.cine;

public class NodoCine {
    // dato del numero a ingresar al nodo
    private int edad;
    private double precio;
    // Objeto para posicionar el nodo a la izquierda
    private NodoCine next;
    // Objeto para posicinar el nodo a la derecha
    private NodoCine previous;
    //construtor para colocar el dato dentro de nuestro nodo
    public NodoCine(int x){
        edad = x;
    }

    public NodoCine(int x, NodoCine n){
        edad = x;
        next = n;
    }

    public NodoCine(int dato, NodoCine next, NodoCine previous) {
        this.edad = dato;
        this.next = next;
        this.previous = previous;
    }

    public NodoCine() {
    }
    // getters y setters

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 5 && edad <= 10){
            precio = 1;
        } else if (edad >= 11 && edad <= 17 ) {
            precio = 2.5;
        } else if (edad >= 18) {
            precio = 3.5;
        }
        this.edad = edad;
    }

    public NodoCine getNext() {
        return next;
    }

    public void setNext(NodoCine next) {
        this.next = next;
    }

    public NodoCine getPrevious() {
        return previous;
    }

    public void setPrevious(NodoCine previous) {
        this.previous = previous;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}


