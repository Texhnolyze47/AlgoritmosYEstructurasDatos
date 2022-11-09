package com.example.recursividad.ejercicios2;

public class BinarioDecimal {
    public static void main(String[] args) {
        int numeroBinario = 101101;
        System.out.println(binarioEntero(numeroBinario));
    }

    /**
     * Este método convierte un numero binario a decimal
     * @param numeroBinario este numero binario que vamos a convertir
     * @return regresa el número en forma decimal
     */
    public static int binarioEntero(int numeroBinario) {
        // En caso de que el usuario coloque cero se regresa cero para evitar errores
        if(numeroBinario==0){
            return 0;
        }
        else
            // este es el mismo procedimiento que usamos de la conversion de decimal a binario,
            // pero como vamos a convertir esto a decimal debemos hacerlo por una base 10
            return (numeroBinario % 10 + 2* binarioEntero(numeroBinario / 10));
    }
}
