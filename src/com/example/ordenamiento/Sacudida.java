package com.example.ordenamiento;


import java.util.Scanner;

public class Sacudida {

    private static int size;

    private static int[] array = new int[size];

    public static void main(String[] args) {
        sacudida();
    }

    public static void sacudida() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elegi el tamaño del arreglo");
        size = sc.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Posicion " + (i + 1));
            array[i] = sc.nextInt();
        }

        int izq = 2;
        int der = size;
        int aux;
        int k = size;

        while (izq >= der) {
            for (int i = der; i >= izq; i--) {
                if (array[i - 1] > array[i]) {
                    aux = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = aux;
                    k = i;
                    System.out.println("Array[i]= der a izq" + array[i]);
                }

            }
            izq = k + 1;

            for (int i = izq; i < der; i++) {
                if (array[i - 1] > array[i]) {
                    aux = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = aux;
                    System.out.println("Array[i]= izq a derecha" + array[i]);
                    k = i;
                }
            }
            der = k - 1;

        }

        System.out.println("Arreglo ordenado");
        for (int i = 1; i < size; i++) {
            System.out.println("Arreglo[i]= " + array[i]);
        }


    }

}
