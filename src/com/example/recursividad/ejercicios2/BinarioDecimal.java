package com.example.recursividad.ejercicios2;

public class BinarioDecimal {
    public static void main(String[] args) {
        String numeroBinario = "101101";
        System.out.println(recursive(numeroBinario));
    }

    public static int recursive(String binaryNumber) {
        int decimal = 0;
        int length = binaryNumber.length();
        if (length > 0) {
            String substring = binaryNumber.substring(1);
            int digit = Character.getNumericValue(binaryNumber.charAt(0));
            decimal = digit * (int) Math.pow(2, length - 1) + recursive(substring);
        }
        return decimal;
    }//output: decimal = 10
}
