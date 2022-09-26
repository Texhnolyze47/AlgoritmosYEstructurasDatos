package com.example.pilascolas;

import java.util.Scanner;

public class Colas {


    public static ColaArray Cola;

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Elegi el tamaño del array");
        int MAX;
        MAX = sc.nextInt();

        Cola = new ColaArray(MAX);


        int op;
        do {
            System.out.println("Menu");
            System.out.println("1. Agregar");
            System.out.println("2. Eliminar");
            System.out.println("3. Mostrar");
            System.out.println("4. Salir");
            op = sc.nextInt();
            switch (op) {
                case 1 ->  Cola.InsertarCola();
                case 2 ->  Cola.EliminarCola();
                case 3 ->  Cola.MostrarCola();
            }
        }while (!((op) ==  4));
        System.out.println("Adios");

    }

    }



