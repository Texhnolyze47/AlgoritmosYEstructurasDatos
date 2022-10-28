package com.example.recursividad;

public class MainRecursiva {

    public static void main(String[] args) {
        MainRecursiva re = new MainRecursiva();
        re.imprimir(5);
    }

    public void imprimir(int x) {
        if (x > 0) {
            //Caso base
            imprimir(x - 1); //Llamada recursiva acercándose al caso base
            System.out.println(x); //Imprime los valores
        }
    }


}