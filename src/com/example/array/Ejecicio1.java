package com.example.array;

import java.util.Scanner;

public class Ejecicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays donde se guarda
        int[] toneladasMes = new int[12];
        // donde se guarda la suma de todos los meses
        int suma = 0;
        // Array donde seta los nombre de los mesos
        String[] meses =  new String[]{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        int mayorPromedio = 0;
        int menorPromedio = 0;
        float promedioProduccion = 0;


        // Pregunta las toneladas produccidas por mes
        for (int i = 0; i < toneladasMes.length ; i++) {
            System.out.println("El mes de " + meses[i]);
            toneladasMes[i] = sc.nextInt();
            // guarda el total en variable
            suma += toneladasMes[i];
            // se saca el promedio
            promedioProduccion = (float) suma / toneladasMes.length;

            // comprueba sí fue mayor al promedio
            // o menor al promedio
            if (toneladasMes[i] >= promedioProduccion){
                mayorPromedio++;
            }

            if (toneladasMes[i] <= promedioProduccion){
                menorPromedio++;
            }

        }

        // Impresión de la info
        System.out.println("El promedio es: " + promedioProduccion);
        System.out.println("El mayor al promedio es: " + mayorPromedio);
        System.out.println("El menor al promedio es: " + menorPromedio);

    }
}
