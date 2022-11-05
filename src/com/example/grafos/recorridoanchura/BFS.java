package com.example.grafos.recorridoanchura;

import java.util.*;

import static java.util.Objects.isNull;

/**
 * Esta clase usa para implementar el algoritmo BFS`
 */

public class BFS {
    // Usamos Queue para tener los metodos basicos de una cola
    private final Queue<NodoBFS> nodoBFS = new LinkedList<>();
    // Usamos listas ligadas para conseguir el conjunto de aristas
    private final List<NodoBFS> nodoVisitado = new LinkedList<>();
    /**
     * Este metodo se encarga de buscar dentro de nuestro arbol usando el Algoritmo BFS
     * @param estadoInicial array de enteros del estado original
     * @param estadoFinal array de entros del estado que buscamos
     */
    public Optional<NodoBFS> search(int[] estadoInicial, int[] estadoFinal) {
        // comprueba que tanto el estado incial o final no este final
        if(isNull(estadoInicial)) {
            throw new NullPointerException("initialState shouldn't be null");
        }
        if(isNull(estadoFinal)) {
            throw new NullPointerException("finalState shouldn't be null");
        }
        // esta variable es para marca cuando se ha terminado de visitar todos los nodos
        boolean seEncontroEstadoFinal = false;
        // Creamos un Optional vacio, ya que más adelante guardaremos los valores
        Optional<NodoBFS> nodoEncontrado = Optional.empty();
        // Metemos los valores inciales en un nodo
        NodoBFS raiz = NodoBFS.of(estadoInicial);
        // Luego metemos este nodo a nuestra cola
        nodoBFS.add(raiz);
        // Aqui se comprueba sí el algoritmo ya visitado todos los nodos

        while(!seEncontroEstadoFinal && nodoBFS.size() != 0) {
            NodoBFS nodeDFS = nodoBFS.poll();
            nodoVisitado.add(nodeDFS);
            // Esta condicion se encarga de verificar sí el estado inicial es igual al estado final
            // cuando cumpla esta condicion la condicion while terminara
            if(Arrays.equals(nodeDFS.getDato(), estadoFinal)) {
                seEncontroEstadoFinal = true;
                nodoEncontrado = Optional.of(nodeDFS);
            } else {
                int[] nodeState = nodeDFS.getDato();
                this.addNodo(new int[]{nodeState[1],nodeState[0],nodeState[2],nodeState[3]}, nodeDFS);
                this.addNodo(new int[]{nodeState[0],nodeState[2],nodeState[1],nodeState[3]}, nodeDFS);
                this.addNodo(new int[]{nodeState[0],nodeState[1],nodeState[3],nodeState[2]}, nodeDFS);
            }
        }
        return nodoEncontrado;
    }

    /**
     * Este modo se encarga de crear los nodos
     * @param estado donde se guardan los valores del array
     * @param nodo este objeto se encarga de conectar los nodos con sus padres
     */
    private void addNodo(int[] estado,  NodoBFS nodo) {
        // Agrega los datos del nodo
        NodoBFS nodoHijo = NodoBFS.of(estado);
        // hace la conexion con un nodo padre
        nodoHijo.setPadre(nodo);
        // comprueba sí el nodo ya ha sido visido con las listas ligadas
        if(!this.nodoBFS.contains(nodoHijo) && !nodoVisitado.contains(nodoHijo)) {
            this.nodoBFS.add(nodoHijo);
        }
    }
    /**
     * Este metodo se encarga de imprimir el paso a paso como el algoritmo iba recorriendo para llegar al estado final
     * @param solucion el objeto de con los datos como se recorrieron los datos
     */

    public void printPasoAPaso(NodoBFS solucion) {
        boolean padreNulo = false;
        NodoBFS nodoActual = solucion;
        final List<String> estados = new LinkedList<>();
        while(!padreNulo) {
            estados.add(nodoActual.toString());
            if(isNull(nodoActual.getPadre())) {
                padreNulo = true;
            }
            nodoActual = nodoActual.getPadre();
        }
        Collections.reverse(estados);
        System.out.println("La solucion se conseiguio en: " + estados.size() + " niveles [" + String.join(",", estados));
    }
}
