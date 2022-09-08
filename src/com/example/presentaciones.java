package com.example;

public class presentaciones {
    public static void main(String[] args) {
        String nombres [] = {"Ivan","Josa", "Erick", "Luis" };

        double numero = (int) (Math.random() * (4 - 1 + 1)) + 1;
        double numero2 = (int) (Math.random() * (4 - 1 + 1)) + 1;
        double numero3 = (int) (Math.random() * (4 - 1 + 1)) + 1;
        double numero4 = (int) (Math.random() * (4 - 1 + 1)) + 1;

        System.out.println(nombres[0] + "" + numero);
        System.out.println(nombres[1]+ "" + numero2);
        System.out.println(nombres[2]+ "" + numero3);
        System.out.println(nombres[3]+ "" + numero4);





    }
}
