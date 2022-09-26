package com.example.pilascolas;

import java.util.Scanner;

public class Pila {

    private static PilaArray pila;

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Elegi el tamaño del array");
        int MAX;
        MAX = sc.nextInt();

        pila = new PilaArray(MAX);


        int op;
        do {
            System.out.println("Menu");
            System.out.println("1. Agregar");
            System.out.println("2. Eliminar");
            System.out.println("3. Mostrar");
            System.out.println("4. Llena");
            System.out.println("5. Vacio");
            System.out.println("6. Salir");
            op = sc.nextInt();
            switch (op) {
                case 1 ->  pila.InsertarPila();
                case 2 ->  pila.EliminarPila();
                case 3 ->  pila.MostrarPila();
                case 4 ->  pila.IsPilaLlena();
                case 5 ->  pila.IsPilaVacia();
            }
        }while (!((op) ==  6));
        System.out.println("Adios");

    }


}
