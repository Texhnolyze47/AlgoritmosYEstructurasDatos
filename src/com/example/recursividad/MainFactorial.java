package com.example.recursividad;

public class MainFactorial {

    public static int factorial(int fact){
        if (fact > 0){
            return fact * factorial(fact-1);
        } else
            return 1;
    }

    public static void main(String[] args) {
        System.out.println("El factorial de 4 es: " +factorial(4) );
    }

}
