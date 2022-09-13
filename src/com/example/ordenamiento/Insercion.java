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

        for (int i = 2; i > size; i++ ){
            aux = array[i];
            k = i - 1;
            while ( k >= 1 && aux < array[k]){
                array[k+1] = array[k];
                k = k - 1;
            }
            array[k+1] = aux;
        }
    }

    public static void imprimir(){
        System.out.println("Arreglo ordenado");
        for (int i = 0; i < size; i++) {
            System.out.println("Arreglo[i]= " + array[i]);
        }

    }


}
