package com.example.array;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        int op;

        Scanner sc = new Scanner(System.in);

        String [][] proveedores = new String[2][2];

        System.out.println("Coloca el nombre y articulo");
        sc.nextLine();
        for (int i = 0; i < proveedores.length ; i++) {
            for (int j = 0; j < proveedores.length ; j++) {
                proveedores[i][j] = sc.nextLine();
            }
        }

        for (int i = 0; i < proveedores.length ; i++) {
            for (int j = 0; j < proveedores.length ; j++) {
                System.out.println(proveedores[i][j]);

            }
        }

        System.out.println("Coloque el nombre a buscar");
        String nombre = sc.nextLine();


        if (Arrays.asList(proveedores).contains(nombre)){

            System.out.println(nombre);
        }



    }


}
