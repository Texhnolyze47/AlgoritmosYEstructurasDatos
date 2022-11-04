package com.example.listas.exercises.supermercado;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ListaProducto listaProducto = new ListaProducto();

        for (int i = 0; i < 8; i++) {
            listaProducto.insertarCabezaLista(nombresAleatorios(i+1),cantidad(),precios());
        }

        listaProducto.visualizar();
    }

    public static String nombresAleatorios(int iterador){

        return "Productos" + iterador;
    }

    public static double precios(){
        Random rand = new Random();

        int minRange = 1;
        int maxRange = 50;
        double precio;

        precio = rand.nextDouble(maxRange - minRange) + minRange;
        return precio;
    }
    public static int cantidad(){
        Random rand = new Random();

        int minRange = 1;
        int maxRange = 8;
        int cantidad = 0;
        cantidad = rand.nextInt(maxRange - minRange) + minRange;

        return cantidad;
    }

}
