package com.example.listas.pilasColas;

import com.example.listas.Lista;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op;
        do {
            System.out.println("Menu");
            System.out.println("1.colas");
            System.out.println("2.pilas");
            op = sc.nextInt();
            switch (op){
                case 1:
                    colas();
                    break;
                case 2:
                    pilas();
                    break;
                case 3:
                    System.out.println("Adios");
            }
        }while (!(op ==  3));

    }

    public static void colas(){
        Scanner sc = new Scanner(System.in);
        Cola cola = new Cola();
        int op;
        do {
            System.out.println("Menu");
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.mostrar");
            System.out.println("4.Salir");
            op = sc.nextInt();

            switch (op){
                case 1:
                    System.out.println("Ingresa un dato");
                    int dato = sc.nextInt();
                    cola.insertar(dato);
                    break;
                case 2:
                    cola.extraer();
                case 3:
                    cola.visualizar();

            }
        }while (!(op ==  4));

    }

    public static void pilas(){
        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();
        int op;
        do {
            System.out.println("Menu");
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.mostrar");
            System.out.println("4.Salir");
            op = sc.nextInt();

            switch (op){
                case 1:
                    System.out.println("Ingresa un dato");
                    int dato = sc.nextInt();
                    pila.insertar(dato);
                    break;
                case 2:
                    pila.extraer();
                case 3:
                    pila.visualizar();

            }
        }while (!(op ==  4));

    }
}
