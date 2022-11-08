package com.example.recursividad.ejercicios2;

public class SumaRecursiva {
    public static void main(String[] args) {
        System.out.println(sumaRecurciva(5));
    }

    /**
     * Este método hace una sumatoria de forma recursiva
     *
     * @param limite un numero tipo int que marca hasta que numero se sumara
     * @return regresa la suma de los numeros haste el limite que se indique
     */
    public static int sumaRecurciva(int limite){
        if (limite == 0){
            return 0;
        } else {
            return limite + sumaRecurciva(limite - 1);
        }
    }
}
