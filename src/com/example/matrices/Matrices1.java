package com.example.matrices;

import java.util.Scanner;

public class Matrices1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int FILAS = 2, COLUMNAS = 2;

        int [][] matrices = new int[FILAS][COLUMNAS];
        int [][] matrices2 = new int[FILAS][COLUMNAS];


        int [][] matricesResultado = new int[FILAS][COLUMNAS];

        //Se introducen por teclado los valores de la matriz
        System.out.println("Lectura de elementos de la matriz: ");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                String mensaje = String.format("Filas[%d] Columnas[%d]", i,j);
                System.out.println(mensaje);

                matrices[i][j] = sc.nextInt();
                matrices2[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {

                int matriz1 = matrices[i][j];
                int matriz2 = matrices2[i][j];

                int suma = matriz1 + matriz2;

                matricesResultado [i][j] = suma;


                System.out.println("Resultado " + matricesResultado[i][j]);
            }
        }


    }


}
