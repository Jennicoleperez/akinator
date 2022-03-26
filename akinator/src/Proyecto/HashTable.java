/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author Jennifer Pérez
 */
public class HashTable {
    //Campos de la clase
    NodoHashTable[] tabla;
    int tamano;

    /**
     *
     * Constructor del HashTable
     *
     * @param tamano será un numero primo 10111
     *
     */
    public HashTable(int tamano) {
        this.tamano = tamano;
        this.tabla = new NodoHashTable[tamano];
        for (int i = 0; i < tamano; i++) {
            this.tabla[i] = null;
        }
    }

    /**
     *
     * Función hash
     *
     * @param llave en este caso, será la palabra
     * @return entero correspondiente al valor hash
     */
    public int hashing(String llave) {
        int valor = 0;
        int posicion = 1;
        for (int i = 0; i < llave.length(); i++) {
            if (llave.codePointAt(i) == 32) {
                valor += 0;
            } else if (llave.codePointAt(i) >= 49 && llave.codePointAt(i) <= 57) {
                valor += (llave.codePointAt(i) - 47) * posicion;
            } else if (llave.codePointAt(i) >= 65 && llave.codePointAt(i) <= 90) {
                valor += (llave.codePointAt(i) - 54) * posicion;
            } else if (llave.codePointAt(i) >= 97 && llave.codePointAt(i) <= 122) {
                valor += (llave.codePointAt(i) - 60) * posicion;
            }
            posicion++;
        }
        return (valor % tamano);
    }
    
    /**
     *
     * Funcion que devuelve un nodo correspondiente a la palabra que se pasa por
     * parámetro, sacando el valor Hash se encuentra el nodo que se requiere y
     * en caso de haber colisiones se recorre esa lista
     *
     * @param palabra palabra a buscar
     * @return NodoHash correspondiente a la palabra ingresada
     */
    public NodoHashTable buscar(String palabra) {
        int posicion = hashing(palabra);
        NodoHashTable temp = this.tabla[posicion];
        boolean existe = false;

        if (temp != null) {
            if (temp.getSiguiente() == null) {
                if (temp.getPalabra().equals(palabra)) {
                    existe = true;
                }
            } else {
                while (temp != null && !existe) {
                    if (temp.getPalabra().equals(palabra)) {
                        existe = true;
                    } else {
                        temp = temp.getSiguiente();
                    }
                }
            }
        }
        if (existe) {
            return temp;
        } else {
            return null;
        }
    }
}
