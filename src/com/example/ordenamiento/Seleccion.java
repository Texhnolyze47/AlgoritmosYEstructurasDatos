package com.example.ordenamiento;

import java.util.Scanner;

public class Seleccion {

    private static int size;

    private static int[] array = new int[size];

    /**
     * Metodo principal donde se ejecuta el menu
     */
    public static void main(String[] args) {

        int op;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1. Agregar");
            System.out.println("2. Menor a mayor");
            System.out.println("3. Mayor a menor");
            System.out.println("4. imprimir");
            System.out.println("5. Salir");
            op = sc.nextInt();
            switch (op) {
                case 1 ->  agregar();
                case 2 ->  seleccionMenorMayor();
                case 3 ->  seleccionMayorMenor();
                case 4 ->  imprimir();

            }
        }while (!((op) ==  5));
        System.out.println("Adios");

    }

    /**
     * Metodo que se encargase elige el tamaño y agregan los valores
     */
    public static  void agregar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Elegi el tamaño del arreglo");
        size = sc.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Posicion " + (i + 1));
            array[i] = sc.nextInt();
        }
    }

    /**
     * Metodo que usa el algoritmo de seleccion para ordenar de menor a mayor
     */
    public static void seleccionMenorMayor(){
    int i,Menor, k, j;
        for (i = 0; i < array.length - 1 ; i++) {
            Menor = array[i];
                k = i;
                for (j = i+1; j < array.length;j++){
                    if (array[j] < Menor){
                        Menor = array[j];
                        k = j;
                    }
                }
            array[k] = array[i];
            array[i] = Menor;
        }
    }

    /**
     * Metodo que usa el algoritmo de seleccion para ordenar de mayor a menor
     */
    public static void seleccionMayorMenor(){
        int i,Menor, k, j;
        for (i = 0; i < array.length - 1 ; i++) {
            Menor = array[i];
            k = i;
            for (j = i+1; j < array.length;j++){
                if (array[j] > Menor){
                    Menor = array[j];
                    k = j;
                }
            }
            array[k] = array[i];
            array[i] = Menor;
        }
    }

    /**
     * Metodo que se encarga de imprimir el array
     */
    public static void imprimir(){
        System.out.println("Arreglo ordenado");
        for (int i = 0; i < size; i++) {
            System.out.println("Arreglo[i]= " + array[i]);
        }

    }

}
