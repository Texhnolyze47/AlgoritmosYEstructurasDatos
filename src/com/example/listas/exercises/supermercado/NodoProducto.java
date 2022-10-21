package com.example.listas.exercises.supermercado;

public class NodoProducto {

    private int cantidad;
    private double precio;
    private String nombre;
    private NodoProducto next;

    public NodoProducto() {
    }

    public NodoProducto(int cantidad, double precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public NodoProducto(int cantidad, double precio, String nombre) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoProducto getNext() {
        return next;
    }

    public void setNext(NodoProducto next) {
        this.next = next;
    }
}

