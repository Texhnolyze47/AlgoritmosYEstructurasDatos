package com.example.ordenamiento;

import java.util.Scanner;

public class Shell{

    private static int size;

    private static int[] array = new int[size];

    /**
     * Metodo principal donde se ejecuta el menu
     */
    public static void main(String[] args) {

        int op;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n -------------- Menu -------------");
            System.out.println("1. Asignar tamaño del arreglo");
            System.out.println("2. ordenar de menor a mayor");
            System.out.println("3. Ordenar de mayor a menor");
            System.out.println("4. Salir");
            op = sc.nextInt();
            switch (op) {
                case 1 ->  agregar();
                case 2 ->  {
                    seleccionMenorMayor();
                    imprimir();
                }
                case 3 ->  {
                    seleccionMayorMenor();
                    imprimir();
                }

            }
        }while (!((op) ==  4));
        System.out.println("----------- Saliendo -------------");

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
        int salto, aux, i;
        boolean cambios;

        for (salto = array.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento
                cambios = false;
                for (i = salto; i < array.length; i++)   // se da una pasada
                {
                    if (array[i - salto] > array[i]) {       // y si están desordenados
                        aux = array[i];                  // se reordenan
                        array[i] = array[i - salto];
                        array[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.
                    }
                }
            }
        }
    }

    /**
     * Metodo que usa el algoritmo de seleccion para ordenar de mayor a menor
     */
    public static void seleccionMayorMenor(){
        int salto, aux, i;
        boolean cambios;

        for (salto = array.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento
                cambios = false;
                for (i = salto; i < array.length; i++)   // se da una pasada
                {
                    if (array[i - salto] < array[i]) {       // y si están desordenados
                        aux = array[i];                  // se reordenan
                        array[i] = array[i - salto];
                        array[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.
                    }
                }
            }
        }
    }

    /**
     * Metodo que se encarga de imprimir el array
     */
    public static void imprimir(){
        System.out.println("Arreglo ordenado");
        for (int i = 0; i < size; i++) {
            System.out.println("Dato "+ i +" : " + array[i]);
        }

    }

}
