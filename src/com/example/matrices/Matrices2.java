package com.example.matrices;

import java.util.Scanner;

public class Matrices2 {

    public static void main(String[] args) {

        Scanner sc =  new Scanner (System.in);

        // final int FILAS = 4, COLUMNAS = 4;

        System.out.println("Escribe el tamaño del arreglo");
        int size = sc.nextInt();

        int [][] matricesZeros = new int[size][size];


        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size ; j++) {
                matricesZeros[i][j] = 0;
                if (i == j && size >= 4)
                {
                    matricesZeros[i][j] = 1;
                }

            }
        }

        for (int i = 0; i < size ; i++) {
            System.out.print("|");
            for (int j = 0; j < size ; j++) {
                System.out.print(matricesZeros[i][j]);
                System.out.print("|");
            }
            System.out.print("\n");
        }



    }
}
