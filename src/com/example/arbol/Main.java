package com.example.arbol;

public class Main {
    public static void main(String[] args) {
        //Crea un arbol binario
    ArbolLinkedList binaryTree = new ArbolLinkedList();
    // se le agregan los valores
    binaryTree.insertar(10);
    binaryTree.insertar(20);
    binaryTree.insertar(30);
    binaryTree.insertar(40);
    binaryTree.insertar(50);
    binaryTree.insertar(60);
    binaryTree.insertar(70);
    binaryTree.insertar(80);
    binaryTree.insertar(90);
    // se imprime en pre orden
    System.out.println(binaryTree.preOrderRecursive());
        // se imprime en orden
    System.out.println(binaryTree.inOrderIterative());
// se imporime en post orden
    System.out.println(binaryTree.postOrderIterative());

    }
}
