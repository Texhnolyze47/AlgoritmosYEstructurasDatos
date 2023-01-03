package com.example.recursividad.ejercicios2;

public class SumaVectorRecursiva {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        System.out.println(sumaVector(arr,n-1));

    }

    /**
     * Este método recorre un vector sumando todos los valores del dentro del array
     * @param vec este un vector del cual vamos a sumar todos los valores
     * @param n esta es una variable para limitar el tamaño
     * @return regresa la suma total
     */
    public static int sumaVector(int[] vec, int n){
        if ( n == 0){
            return vec[n];
        }else {
            return vec[n] + sumaVector(vec, n - 1);
        }
    }
}
