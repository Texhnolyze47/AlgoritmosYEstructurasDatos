package com.example.recursividad;

public class MainSumaPares {

    private static int suma = 0;

    public static int sumaPares(int numero){

        if (numero > 1) {
            if ((numero % 2) == 0 ){
                suma = suma + numero;
            }
            sumaPares(numero - 1);
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println(sumaPares(8));
    }

}
