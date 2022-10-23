package com.example.listas.exercises.supermercado;

public class ListaProducto {
    private NodoProducto cabeza;
    private NodoProducto cola;
    private int size;

    public ListaProducto(){
        cabeza = null;
        cola = null;
        size = 0;

    }

    public boolean isEmpty() {
        return cabeza == null;
    }

    public void insertarCabezaLista(String nombre, int cantidad, double precio) {
        NodoProducto nuevoNodo = new NodoProducto();
        nuevoNodo.setNombre(nombre);
        nuevoNodo.setCantidad(cantidad);
        nuevoNodo.setPrecio(precio);
        if (isEmpty()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            cola.setNext(cabeza);
        } else {
            cola.setNext(nuevoNodo);
            nuevoNodo.setNext(cabeza);
            cola = nuevoNodo;
        }
        size++;
    }

    public void visualizar(){
        if (!isEmpty()){
            NodoProducto aux = cabeza;
            int i = 0;
            double total = 0;
            double precioFinal = 0;
            System.out.println("**************Cantidad*****Precio*****Total");
            do {
                total = aux.getCantidad() * aux.getPrecio();
                precioFinal += total;
                System.out.printf("%10s %10d %10.2f %10.2f \n", aux.getNombre(), aux.getCantidad(), aux.getPrecio(), total);
                aux = aux.getNext();

                i++;
        }while (aux != cabeza);
            System.out.printf("El precio final es: %.2f", precioFinal);
        }
    }
}


