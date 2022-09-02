package com.example.array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] intArray = new int[7];
        Scanner sc = new Scanner(System.in);



        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Ponga un los numeros");
            intArray[i] = sc.nextInt();
        }

        for (int i = 0; i < intArray.length; i++){
            System.out.println("Los numeros son");
            System.out.println(intArray[i]);
        }

    }
}
