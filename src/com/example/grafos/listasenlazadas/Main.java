package com.example.grafos.listasenlazadas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaGrafo grafo = new ListaGrafo();

        grafo.addNodo(new NodoGrafo(1));
        grafo.addNodo(new NodoGrafo(2));
        grafo.addNodo(new NodoGrafo(3));
        grafo.addNodo(new NodoGrafo(4));
        grafo.addNodo(new NodoGrafo(5));

        grafo.addVertice(0,1);
        grafo.addVertice(0,2);
        grafo.addVertice(1,2);
        grafo.addVertice(1,4);
        grafo.addVertice(2,0);
        grafo.addVertice(2,3);
        grafo.addVertice(2,4);
        grafo.addVertice(4,3);

        grafo.print();
    }
}