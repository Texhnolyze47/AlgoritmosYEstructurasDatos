package com.example.array;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {


    private static int size;
    //Sí se quiere aumentar la cantidad de proveedores solo modificar
    // el número de abajo
    private static final String[] proveedor = new String[size];
    private static final String[] ciudad = new String[proveedor.length];
    private static final String[] numeroArticulo = new String[proveedor.length];

    private static int numeroArticuloInt;



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Coloca el numero de proveedores");
        size = sc.nextInt();

        int op;

        do {

            System.out.println("Menu");
            System.out.println("1. Agregar usuarios");
            System.out.println("2. Buscar Usuario");
            System.out.println("3. Cambiar ubicación del proveedor");
            System.out.println("4. Aumentar o disminuir del proveedor");
            System.out.println("5. Mostrar info de proveedores");
            System.out.println("6. Salir");

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
        // comprueba dentro del array, este el nombre del proveedor
        // lo convertimos en una lista para poder utilizar el metodo contains
        // y encontrar el nombre que colocamos en la variables
        if (Arrays.asList(proveedor).contains(nombreProveedor)) {

            System.out.println(nombreProveedor);
            // aunque la informacion este dentro de diferentes arrays, la informacion
            // comparte la misma posicion por eso solo es necesario conocer la posicion
            // del nombre pora poder sacar la demás informacion
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
        // de la misma forma vamos a usar el nombre para comprabar que existe el proveedor
        if (Arrays.asList(proveedor).contains(nombreProveedor)) {
            // conseguimo el index
            int index = Arrays.asList(proveedor).indexOf(nombreProveedor);

            System.out.println(ciudad[index]);

            // preguntamos por la nueva ciudad
            System.out.println("Nueva ciudad");
            String nombreNuevaCiudad = sc.nextLine();

            // sobre escribimos la informacion con el metodo replace
            ciudad[index] = ciudad[index].replace(ciudad[index], nombreNuevaCiudad);

            //imprimos la info con los cambios hechos
            System.out.println("Nombre " + proveedor[index]);
            System.out.println("Ciudad " + ciudad[index]);
            System.out.println("Articulos " + numeroArticulo[index]);


        } else
            System.out.println("No se encontro el proveedor");
    }

    public static void aumentarDisminuirArticulos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que aumentar o disminuir numero de productos?");
        // forma similar a la utlizar en otros metodos sacamos la posicion de la info
        // del proveedor atraves del nombre del proveedor
        System.out.println("Escribe el nombre del proveedor");
        String nombre = sc.nextLine();

        int index = Arrays.asList(proveedor).indexOf(nombre);

        System.out.println("1. Aumentar");
        System.out.println("2 .Disminuir");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                // convertimos el numero de articulos de string a int
                // int numeroProductos = Integer.parseInt(numeroArticulo[index]);
                numeroArticuloInt = Integer.parseInt(numeroArticulo[index]);
                //aumentamos su valor por uno
                numeroArticuloInt++;
                //imprimos info
                System.out.println("Informacion del proveedor ");
                System.out.println("Nombre " + proveedor[index]);
                System.out.println("Numero de productos " + numeroArticuloInt);
                break;
            case 2:
                // convertimos el numero de articulos de string a int
                numeroArticuloInt = Integer.parseInt(numeroArticulo[index]);
                // restamos su valor por uno
                numeroArticuloInt--;
                //imprimos info
                System.out.println("Informacion del proveedor ");
                System.out.println("Nombre " + proveedor[index]);
                System.out.println("Numero de productos " + numeroArticuloInt);
                break;

        }
    }

    /**
     * Metodo para imprimir la info de todos los proveedores
     */
    public static void info() {
        System.out.println("INFO");
        for (int i = 0; i < proveedor.length; i++) {
            System.out.println(proveedor[i]);
            System.out.println(ciudad[i]);
            System.out.println(numeroArticulo[i]);
        }
    }
    /**
     * Metodo para agregar dos proveedores
     */

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
