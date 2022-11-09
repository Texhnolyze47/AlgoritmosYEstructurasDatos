package com.example.recursividad.ejercicios2;

public class binarioRecursividad {
    public static void main(String[] args) {
        numeroBinario(22);
        System.out.println();

    }

    /**
     * Este método convierte un número decimal a binario
     * @param n es el número que vamos a convertir de decimal a binario
     */

    public static void numeroBinario(int n){
        // en caso de que sea dos imprimirá solamente el número 1
    if ( n < 2){
        System.out.print(n);
    }
    // en caso contrario se convertirá este numero a binario de forma recursiva
    else {
        numeroBinario(n / 2);
        System.out.print( n % 2);
        }
    }
}
