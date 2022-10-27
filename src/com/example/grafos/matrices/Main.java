package com.example.grafos.matrices;

public class Main {

    public static void main(String[] args) {
        GrafoMatrizAdyacente matriz = new GrafoMatrizAdyacente(5);

        matriz.agregar(0,1, 7);
        matriz.agregar(0,2,2);
        matriz.agregar(1,2,-1);
        matriz.agregar(1,4,3);
        matriz.agregar(2,0,0);
        matriz.agregar(2,3,3);
        matriz.agregar(4,3,4);

        matriz.remover(0,1);

        matriz.imprimir();
    }
}
