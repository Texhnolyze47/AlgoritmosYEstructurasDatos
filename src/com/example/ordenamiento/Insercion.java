package com.example.ordenamiento;

import java.util.Scanner;

public class Insercion {

    private static int size;

    private static int[] array = new int[size];

    public static void main(String[] args) {
        agregar();
        insercion();
        imprimir();

    }

    /**
     * Metodo que encarga de preguntar y llenar
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

    public static void insercion(){
        int aux;
        int k;

        for (int i = 1; i < size; i++ ){
            aux = array[i];
            System.out.println("Aux: " + aux);
            k = i - 1;
            System.out.println("K: " + k);
            while ( k >=  0 && aux <= array[k]){
                array[k+1] = array[k];
                System.out.println("array[k+1]: " + array[k+1]);
                k = k - 1;
            }
            array[k+1] = aux;
            System.out.println("array[k+1]: " + array[k+1]);
        }
    }

    public static void imprimir(){
        System.out.println("Arreglo ordenado");
        for (int i = 0; i < size; i++) {
            System.out.println("Arreglo[i]= " + array[i]);
        }

    }


}
