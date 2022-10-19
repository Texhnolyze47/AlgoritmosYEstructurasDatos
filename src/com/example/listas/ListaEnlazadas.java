package com.example.listas;

import java.util.Scanner;
public class ListaEnlazadas {
    public static void main(String[] args) {
        Lista lista = new Lista();

        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("Elige la opcion");
            System.out.println("1. Izqueirda");
            System.out.println("2. Derecha");
            System.out.println("3. Visualizar");
            System.out.println("4. ¿Esta vaciá?");
            System.out.println("5.  BorrarInicio");

            op = sc.nextInt();
            switch (op){
                case 1:
                    System.out.println("Escribe el dato a guardar");
                   int dato = sc.nextInt();
                    lista.insertarCabezaLista(dato);
                    break;
                case 2:
                    System.out.println("Escribe el dato a guardar");
                    //dato = sc.nextInt();
                    lista.insertarFinalLista(3);
                    break;
                case 3:
                    lista.visualizarArriba();
                    //lista.visualizarAbajo();
                    break;
                case 4:
                    System.out.println("La lista esta vacia " + lista.isEmpty());
                    break;
                case 5:
                    lista.borrarPrimero();
                    break;
                case 6:
                    lista.borrarUltimo();

                case  7:
                    System.out.println("Adios");
                    break;
            }

        }while (!(op ==  7));
    }
}



