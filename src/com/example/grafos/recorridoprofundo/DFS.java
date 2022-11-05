package com.example.grafos.recorridoprofundo;

import java.util.*;

import static java.util.Objects.isNull;

/**
 * Esta clase se encarga de implementar el algoritmo de DFS
 */
public class DFS {
    // Usamos stack para tener los metodos basicos de una pila
    private final Stack <NodoDFS> nodoDFS = new Stack<>();
    // Usamos listas ligadas para conseguir el conjunto de aristas ya
    // este algoritmo usa listas adyacentes para conocer los vecinos de nuestro nodo
    private final List <NodoDFS>  visto = new LinkedList<>();

    /**
     * Este modo se encarga de crear los nodos
     * @param estado donde se guardan los valores del array
     * @param nodo este objeto se encarga de conectar los nodos con sus padres
     */
    public void addNodo(int[ ] estado, NodoDFS nodo){
        // Agrega los datos del nodo
        NodoDFS nodoHijo =  NodoDFS.add(estado);
        // hace la conexion con un nodo padre
        nodoHijo.setPadre(nodo);
        // comprueba sí el nodo ya ha sido visido con las listas ligadas
        if (!nodoDFS.contains(nodoHijo) && !visto.contains(nodoHijo)){
            nodoDFS.add(nodoHijo);
        }
    }

    /**
     * Este metodo se encarga de buscar dentro de nuestro arbol usando el Algoritmo DFS
     * @param estadoInicial array de enteros del estado original
     * @param estadoFinal array de entros del estado que buscamos
     * @return regresa los resultados de la busqueda
     */
    public Optional <NodoDFS> search (int[] estadoInicial, int[] estadoFinal){
        // Se hace verificaciones para evitar que el estado inicial o final este vacio
        if (isNull(estadoInicial)){
            throw new NullPointerException("El estado incial no debe estar nulo");
        } else if (isNull(estadoFinal)) {
            throw  new NullPointerException("El estado final no debe estar nulo");
        }
        // esta variable es para marca cuando se ha terminado de visitar todos los nodos
        boolean bEstadoFinal = false;
        // Creamos un Optional vacio, ya que más adelante guardaremos los valores
        Optional <NodoDFS> nodoEncontrado = Optional.empty();
        // Metemos los valores inciales en un nodo
        NodoDFS raiz = NodoDFS.add(estadoInicial);
        // Luego metemos este nodo a nuestra pila
        nodoDFS.add(raiz);
        // Aqui se comprueba sí el algoritmo ya visitado todos los nodos
        while (!bEstadoFinal && nodoDFS.size() != 0){
            NodoDFS nodeDFS = nodoDFS.pop();
            visto.add(nodeDFS);
            // Esta condicion se encarga de verificar sí el estado inicial es igual al estado final
            // cuando cumpla esta condicion la condicion while terminara
            if (Arrays.equals(nodeDFS.getEstado(), estadoFinal)){
                bEstadoFinal = true;
                nodoEncontrado = Optional.of(nodeDFS);
            }else {
                int[] nodoEstado = nodeDFS.getEstado();
                this.addNodo(new int[]{nodoEstado[1],nodoEstado[0],nodoEstado[2], nodoEstado[3]}, nodeDFS);
                this.addNodo(new int[]{nodoEstado[0],nodoEstado[2],nodoEstado[1], nodoEstado[3]}, nodeDFS);
                this.addNodo(new int[]{nodoEstado[0],nodoEstado[1],nodoEstado[3], nodoEstado[2]}, nodeDFS);
            }
        }
        return nodoEncontrado;
    }

    /**
     * Este metodo se encarga de imprimir el paso a paso como el algoritmo iba recorriendo para llegar al estado final
     * @param solucion el objeto de con los datos como se recorrieron los datos
     */
    public void printPasoAPaso (NodoDFS solucion){
        boolean padreNull = false;
        NodoDFS nodoActual = solucion;
        List <String> estados = new LinkedList<>();
        while (!padreNull){
            estados.add(nodoActual.toString());
            if (isNull(nodoActual.getPadre())){
                padreNull = true;
            }
            nodoActual = nodoActual.getPadre();
        }
        Collections.reverse(estados);
        System.out.println("La solucion  se conseiguio en: " + estados.size() + " niveles [" + String.join(",", estados));

    }

}
