package com.example.array;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

    //Sí se quiere aumentar la cantidad de proveedores solo modificar
    // el numero de abajo
    private static final String[] proveedor = new String[2];
    private static final String[] ciudad = new String[proveedor.length];
    private static final String[] numeroArticulo = new String[proveedor.length];

    public static void main(String[] args) {
        int op;

        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Menu");
            System.out.println("1. Agregar usuarios");
            System.out.println("2. Buscar Usuario");
            System.out.println("3. Cambiar ubicación del proveedor");
            System.out.println("4. Aumentar o disminuir del proveedor");
            System.out.println("5. Mostrar info de proveedores");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Agregar usuarios");
                    agregarProveedores();

                    break;

                case 2:
                    System.out.println("Buscar usuarios");
                    buscarProveedor();
                    break;

                case 3:
                    cambiarUbicacion();
                    break;

                case 4:
                    aumentarDisminuirArticulos();
                    break;

                case 5:
                    info();
                    break;


            }

        } while (!(op == 6));

        System.out.println("Adios");

    }


    public static void buscarProveedor() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque el nombre a buscar");
        String nombreProveedor = sc.nextLine();

        if (Arrays.asList(proveedor).contains(nombreProveedor)) {
            System.out.println(nombreProveedor);

            int index = Arrays.asList(proveedor).indexOf(nombreProveedor);
            System.out.println("Esta en la posicion " + index);

            System.out.println("Informacion del proveedor ");
            System.out.println("Nombre " + proveedor[index]);
            System.out.println("Numero de productos " + numeroArticulo[index]);
        } else
            System.out.println("No se encontro");


    }

    public static void cambiarUbicacion() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque el nombre a buscar");
        String nombreProveedor = sc.nextLine();

        if (Arrays.asList(proveedor).contains(nombreProveedor)) {

            int index = Arrays.asList(proveedor).indexOf(nombreProveedor);

            System.out.println(ciudad[index]);

            System.out.println("Nueva ciudad");
            String nombreNuevaCiudad = sc.nextLine();

            ciudad[index] = ciudad[index].replace(ciudad[index], nombreNuevaCiudad);

            System.out.println("Nombre " + proveedor[index]);
            System.out.println("Ciudad " + ciudad[index]);
            System.out.println("Articulos " + numeroArticulo[index]);


        } else
            System.out.println("No se encontro el proveedor");
    }

    public static void aumentarDisminuirArticulos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que aumentar o disminuir numero de productos?");

        System.out.println("Escribe el nombre del proveedor");
        String nombre = sc.nextLine();

        int index = Arrays.asList(proveedor).indexOf(nombre);

        System.out.println("1. Aumentar");
        System.out.println("2 .Disminuir");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                int numeroProductos = Integer.parseInt(numeroArticulo[index]);
                numeroProductos++;
                System.out.println("Informacion del proveedor ");
                System.out.println("Nombre " + proveedor[index]);
                System.out.println("Numero de productos " + numeroProductos);
                break;
            case 2:
                int numeroProductosD = Integer.parseInt(numeroArticulo[index]);
                numeroProductosD--;
                System.out.println("Informacion del proveedor ");
                System.out.println("Nombre " + proveedor[index]);
                System.out.println("Numero de productos " + numeroProductosD);
                break;

        }
    }

    public static void info() {
        System.out.println("INFO");
        for (int i = 0; i < proveedor.length; i++) {
            System.out.println(proveedor[i]);
            System.out.println(ciudad[i]);
            System.out.println(numeroArticulo[i]);
        }
    }


    public static void agregarProveedores() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Coloca el nombre, ciudad y numero de articulos");

        for (int i = 0; i < proveedor.length; i++) {
            System.out.println("Nombre del Proveedor " + (i+1));
            proveedor[i] = sc.nextLine();
            System.out.println("Ciudad del Proveedor " + (i+1));
            ciudad[i] = sc.nextLine();
            System.out.println("Articulos del Proveedor " + (i+1));
            numeroArticulo[i] = sc.nextLine();
        }


    }

}
