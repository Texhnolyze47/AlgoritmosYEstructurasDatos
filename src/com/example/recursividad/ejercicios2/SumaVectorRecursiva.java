package com.example.recursividad.ejercicios2;

public class SumaVectorRecursiva {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        System.out.println(sumaVector(arr,n-1));

    }

    public static int sumaVector(int[] vec, int n){
        if ( n == 0){
            return vec[n];
        }else {
            return vec[n] + sumaVector(vec, n - 1);
        }
    }
}
