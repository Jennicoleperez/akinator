/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author sralvaro
 */

public class ArbolBinario {

    NodoBinario raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public ArbolBinario(NodoBinario raiz) {
        this.raiz = raiz;
    }
    
    public void preorden(){
        preorden(this.raiz);
    }

    public void preorden(NodoBinario nodo) {
        if (nodo != null) {
            System.out.print(nodo.getElemento() + " \n");
            preorden(nodo.getHijoIzq());
            preorden(nodo.getHijoDer());
        }
    }
     public void postorden(){
        postorden(this.raiz);
    }

    public void postorden(NodoBinario nodo) {
        if (nodo != null) {
            postorden(nodo.getHijoIzq());
            postorden(nodo.getHijoDer());
            System.out.print(nodo.getElemento() + " \n");
        }
    }

    public void inorden(NodoBinario nodo) {
        if (nodo != null) {
            inorden(nodo.getHijoIzq());
            System.out.print(nodo.getElemento() + " \n");
            inorden(nodo.getHijoDer());
        }
    }

    public void insertar(NodoBinario nuevo, NodoBinario padre) {
        if (raiz != null) {
            if (padre.getHijoIzq() == null) {
                padre.setHijoIzq(nuevo);
            } else if (padre.getHijoDer() == null) {
                padre.setHijoDer(nuevo);
            }
        }
    }
   

    public NodoBinario buscar(String elemento, NodoBinario nodo) {
        NodoBinario buscado = null;
        if (nodo != null) {
            if (nodo.getElemento().equals(elemento) ) {
                buscado = nodo;
            }
            if (buscado == null) {
                buscado = buscar(elemento, nodo.getHijoIzq());
                if (buscado == null) {
                    buscado = buscar(elemento, nodo.getHijoDer());
                }
            }
        }
        return buscado;

    }
}
