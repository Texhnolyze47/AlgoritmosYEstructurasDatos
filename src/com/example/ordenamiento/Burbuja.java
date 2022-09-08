package com.example.ordenamiento;

import java.util.Scanner;

public class Burbuja {
    private static int size;
    private static int [] array = new int[size];



    public static void main(String[] args) {
        int op = 0;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Menu");
            System.out.println("1. Agregar");
            System.out.println("2. Menor a mayor");
            System.out.println("3. Mayor a menor");
            System.out.println("4. Salir");
            op = sc.nextInt();
            switch (op){
                case 1:
                    agregar();
                    break;
                case 2:
                    Burbuja(array, array.length);

                    break;
                case 3:
                    BurbujaMayor(array, array.length);
                    break;

            }
        }while (!((op) == 4));
        System.out.println("Adios");

    }

    public static void agregar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el tamaño del arreglo");
        size = sc.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Array " + i);
            array[i] = sc.nextInt();
        }


    }
    public static void BurbujaMayor(int [] array, int size){
        int aux = 0;
        int i = 2;
        int j;
        for(i = 0; i < array.length - 1; i++){
            for (j = i; j < array.length; j++){
                if (array[i] < array[j]){
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }

        for (i = 0; i < size; i++) {
            System.out.println(array[i]);
        }

    }
    public static void Burbuja (int [] array, int size){
    int aux = 0;
    int i = 2;
    int j;
        for(i = 0; i < array.length - 1; i++){
            for (j = i; j < array.length; j++){
                if (array[i] > array[j]){
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }

        for (i = 0; i < size; i++) {
            System.out.println(array[i]);
        }


    }
}
