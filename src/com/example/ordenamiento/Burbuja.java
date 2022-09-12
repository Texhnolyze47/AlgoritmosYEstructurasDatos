package com.example.ordenamiento;

import java.util.Scanner;

public class Burbuja {
    private static int size;
    private static int [] array = new int[size];

    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1. Agregar");
            System.out.println("2. Menor a mayor");
            System.out.println("3. Mayor a menor");
            System.out.println("4. Salir");
            op = sc.nextInt();
            switch (op) {
                case 1 ->  agregar();
                case 2 ->  BurbujaMenor(array, array.length);
                case 3 ->  BurbujaMayor(array, array.length);
            }
        }while (!((op) == 4));
        System.out.println("Adios");

    }

    /**
     * Método para agregar los datos
     * al array
     */
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

    /**
     * Este método para realizar el ordenamiento
     * mediante el metodo burbuja de mayor a menor
     *
     */

    public static void BurbujaMayor(int [] array, int size){
        int aux;
        int i;
        int j;
        for(i = 0; i < array.length - 1; i++){
            for (j = i; j < array.length; j++){

                if (array[i] < array[j]){
                    System.out.println("El array[i]= " + array[i] + " es menor a el array[j]=" + array[j]);
                    aux = array[i];
                    System.out.println("El valor array[i]= " + array[i] + " se mueve a la variable aux " + aux);
                    array[i] = array[j];
                    System.out.println("El valor array[i]= " + array[i] + " toma el valor[j]= " + array[j] );
                    array[j] = aux;
                    System.out.println("El valor array[j]= " + array[j] + " toma el valor aux= " + aux + "\n");

                }
            }
        }

        for (i = 0; i < size; i++) {
            System.out.println(array[i]);
        }

    }

    /**
     * Este metodo para realizar el ordenamiento
     * mediante el metodo burbuja de menor a mayor
     *
     */
    public static void BurbujaMenor(int [] array, int size){
    int aux;
    int i;
    int j;
        for(i = 0; i < array.length - 1; i++){
            for (j = i; j < array.length; j++){
                if (array[i] > array[j]){
                    System.out.println("El array[i]= " + array[i] + " es mayor a el array[j]=" + array[j]);
                    aux = array[i];
                    System.out.println("El valor array[i]= " + array[i] + " se mueve a la variable aux " + aux);
                    array[i] = array[j];
                    System.out.println("El valor array[i]= " + array[i] + " toma el valor[j]= " + array[j] );
                    array[j] = aux;
                    System.out.println("El valor array[j]= " + array[j] + " toma el valor aux= " + aux + "\n");
                }
            }
        }

        for (i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}
