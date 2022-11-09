package com.example.recursividad.ejercicios2;

public class SumaRecursiva {
    public static void main(String[] args) {

        System.out.println(sumaRecursiva(5));
    }

    /**
     * Este método hace una sumatoria de forma recursiva
     * @param limite un numero tipo int que marca hasta que numero se sumara
     * @return regresa la suma de los numerous haste el límite que se indique
     */
    public static int sumaRecursiva(int limite){
        // En caso de que el usuario coloque cero se regresa cero para evitar errores
        if (limite == 0){
            return 0;
        } else {
            return limite + sumaRecursiva(limite - 1);
        }
    }
}
