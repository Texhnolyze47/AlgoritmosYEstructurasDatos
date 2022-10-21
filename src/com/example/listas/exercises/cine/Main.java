package com.example.listas.exercises.cine;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ListaCine lista = new ListaCine();

        for (int i = 0; i < 50; i++) {
            lista.insertarCabezaLista(crearPersonas());
        }
        lista.visualizarArriba();
    }

    public static int crearPersonas(){
        Random rand = new Random();
        int minRange = 5;
        int maxRange = 60;
        int valor = 0;

        valor = rand.nextInt(maxRange - minRange) + minRange;
        
        return valor;
    }
}
