/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * Lista enlazada para almacenar las palabras independientemente del hash que
 * contengan, es usada para que sea más eficiente a la hora de recorrer todas
 * las palabras, ya que recorrerarlas en la HashTable sería
 * computacionalmente costoso
 *
 */
public class ListaEnlazada {

    //Campos de la clase
    NodoHashTable primero;
    NodoHashTable ultimo;
    int tamano;

    /**
     *
     * Constructor de ListaAnimales
     *
     */
    public ListaEnlazada() {
        this.primero = null;
        this.ultimo = null;
        this.tamano = 0;
    }

    /**
     *
     * Método que devuelve si la lista es vacia o no
     *
     * @return true si está vacía, si no false
     *
     */
    public boolean esVacio() {
        return primero == null;
    }

    /**
     *
     * Procedimiento para agregar elementos al final de la lista
     *
     * @param nuevo nuevo nodo a agregar, este nodo contendrá la palabra y las
     * veces que se repite
     *
     */
    public void agregarFinal(NodoHashTable nuevo) {

        if (esVacio()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguienteLista(nuevo);
            ultimo = nuevo;
        }
        tamano++;
    }

    

    /**
     *
     * Procedimiento que devuelve la información de la lista 
     *
     * @return información de la lista 
     */
    public String imprimirLista() {
        String texto = "";
        if (esVacio()) {

        } else {
            NodoHashTable aux = primero;
            for (int i = 0; aux.getSiguienteLista() != null; i++) {
                texto += aux.getAnimal() + "\n";

                aux = aux.getSiguienteLista();

            }
        }
        return texto;
    }
}
