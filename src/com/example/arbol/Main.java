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

        binaryTree.deleteNode(40);
        System.out.println(binaryTree.preOrderRecursive());
        System.out.println(binaryTree.inOrderIterative());

        binaryTree.deleteNode(20);
        System.out.println(binaryTree.postOrderIterative());
        System.out.println(binaryTree.inOrderIterative());

    }
}
