package com.example.recursividad.ejercicios2;

public class binarioRecursividad {
    public static void main(String[] args) {
        numeroBinario(45);
        System.out.println();

    }


    public static void numeroBinario(int n){
    if ( n < 2){
        System.out.print(n);
    }
    else {
        numeroBinario(n / 2);
        System.out.print( n % 2);
        }
    }
}
