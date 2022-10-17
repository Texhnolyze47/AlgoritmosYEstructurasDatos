package com.example.listas;

import java.util.Scanner;

public class ListaEnlazadas {
    public static void main(String[] args) {
        // Se crea un nodo con el valor de 5
        //Nodo nodo = new Nodo(5);
        // Se crea otro nodo con un valor de 7 y se hace el enlace con el nodo anterior
        //Nodo nodo2 = new Nodo(7, nodo);
        // se hace el mismo proceso
        //Nodo nodo3 = new Nodo(9, nodo2);

        // informacion de los nodos
//        System.out.println("nodo 1 - dato: " + nodo.getDato());
//        System.out.println("nodo 1 - enlace: " + nodo.getEnlace());
//        System.out.println("nodo 1 - puntero: " + nodo);
//        System.out.println("nodo 1 - tamaño: " + nodo.size);
//
//        System.out.println("nodo 2 - dato: " + nodo2.getDato());
//        System.out.println("nodo 2 - enlace: " + nodo2.getEnlace());
//        System.out.println("nodo 2 - puntero: " + nodo2);
//        System.out.println("nodo 2 - tamaño: " + nodo2.size);
//
//
//        System.out.println("nodo 3 - dato: " + nodo3.getDato());
//        System.out.println("nodo 3 - enlace: " + nodo3.getEnlace());
//        System.out.println("nodo 3 - puntero: " + nodo3);
//        System.out.println("nodo 3 - tamaño: " + nodo3.size);

        // se crea una lista enlazada
        // Hace uso, de la clase nodo para hacer la union de los nodos
        Lista lista = new Lista();

        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("Elige la opcion");
            System.out.println("1. Izqueirda");
            System.out.println("2. Derecha");
            System.out.println("3. Visualizar");
            op = sc.nextInt();
            switch (op){
                case 1:
                    System.out.println("Escribe el dato a guardar");
                    int dato = sc.nextInt();
                    lista.insertarCabezaLista(dato);
                    break;
                case 2:
                    System.out.println("Escribe el dato a guardar");
                    dato = sc.nextInt();
                    lista.insertarFinalLista(dato);
                    break;
                case 3:
                    lista.visualizarArriba();
                    lista.visualizarAbajo();
                    break;
            }

        }while (!(op ==  4));


        //lista.visualizar();


    }
}



