package com.example.matrices;

import java.util.Scanner;

public class Matrices1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int FILAS = 2, COLUMNAS = 2;
        // matriz 1 para la suma
        int [][] matrices = new int[FILAS][COLUMNAS];

        // matriz 2 para la suma
        int [][] matrices2 = new int[FILAS][COLUMNAS];

        //Matriz donde guarda la suma de las dos primeras matrices
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

        // se suma y muestra el resultado en otra matriz
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                // se guarda un valor de las matrices en otra variable temporal
                int matriz1 = matrices[i][j];
                int matriz2 = matrices2[i][j];

                // se hace la suma y se guarda el valor
                int suma = matriz1 + matriz2;

                // el valor guarda en la posición que le corresponde
                matricesResultado [i][j] = suma;

                // se imprime la matriz resultado
                System.out.println("Resultado " + matricesResultado[i][j]);
            }
        }


    }


}
