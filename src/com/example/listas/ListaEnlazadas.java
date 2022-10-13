package com.example.listas;

public class ListaEnlazadas {
    public static void main(String[] args) {
        Nodo nodo = new Nodo(5);

        Nodo nodoConexion = new Nodo(7, nodo);

        System.out.println("nodo 1 - dato: " + nodo.getDato());
        System.out.println("nodo 1 - enlace: " +nodo.getEnlace());
        System.out.println("nodo 1 - puntero: " +nodo);

        System.out.println("nodo 2 - dato: " + nodoConexion.getDato());
        System.out.println("nodo 2 - enlace: " +nodoConexion.getEnlace());

        Lista lista = new Lista();

        lista.insertarCabezaLista(10);
        lista.insertarCabezaLista(20);
        lista.insertarCabezaLista(1);

        lista.visualizar();





    }
}



