package com.example.array;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //capacidad del array
        System.out.println("Coloca el numero de alumnos");
        int numeroAlumnos = sc.nextInt();


        int[] alumnos = new int[numeroAlumnos];
        int reprobados = 0;
        int aprobados = 0;
        int alumnosPromedio = 0;
        double porcentajeReprobados;
        double porcentajeAprobados;

        //contador
        int j = 1;
        for (int i = 0; i < alumnos.length ; i++) {
            System.out.println("Calficificaion no. " + j);
            j++;
            //guadar la calificacion final del alumno
            alumnos[i] = sc.nextInt();

            //comprueba si  esta
            //reprobado
            //aprobado
            // o su promedio esta arriba del 8

            if (alumnos[i] < 5){
                reprobados++;
            }

            if (alumnos[i] >= 5){
                aprobados++;
            }

            if (alumnos[i] <= 8){
                alumnosPromedio++;
            }

        }

        porcentajeReprobados = (float) (reprobados*100)/numeroAlumnos;
        porcentajeAprobados = (float) (aprobados*100)/numeroAlumnos;

        System.out.println("Porcentaje de aprobados "+ porcentajeAprobados + "%");
        System.out.println("Porcentaje de reprobados "+ porcentajeReprobados + "%");

        System.out.println("Numero de reprobados " + reprobados);
        System.out.println("Numero de aprobados "+ aprobados);

        System.out.println("Numero de alumnos con un promedio menor o igual a 8 es " + alumnosPromedio);

    }
}
