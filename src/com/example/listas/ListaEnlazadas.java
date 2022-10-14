package com.example.listas;

public class ListaEnlazadas {
    public static void main(String[] args) {
        Nodo nodo = new Nodo(5);

        Nodo nodo2 = new Nodo(7, nodo);

        Nodo nodo3 = new Nodo(9, nodo2);


        System.out.println("nodo 1 - dato: " + nodo.getDato());
        System.out.println("nodo 1 - enlace: " + nodo.getEnlace());
        System.out.println("nodo 1 - puntero: " + nodo);

        System.out.println("nodo 2 - dato: " + nodo2.getDato());
        System.out.println("nodo 2 - enlace: " + nodo2.getEnlace());
        System.out.println("nodo 2 - puntero: " + nodo2);

        System.out.println("nodo 3 - dato: " + nodo3.getDato());
        System.out.println("nodo 3 - enlace: " + nodo3.getEnlace());
        System.out.println("nodo 3 - puntero: " + nodo3);

        Lista lista = new Lista();

        lista.insertarCabezaLista(10);
        lista.insertarCabezaLista(20);
        lista.insertarCabezaLista(1);

        lista.visualizar();


    }
}



