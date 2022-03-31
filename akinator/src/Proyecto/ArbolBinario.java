/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author sralvaro
 */

public class ArbolBinario {
    ListaEnlazada lista = new ListaEnlazada();
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
<<<<<<< HEAD
    public String esHoja(NodoBinario n){
        String hojita = "";
        if(n.getHijoIzq() == null && n.getHijoDer() == null){
           hojita += n.getElemento() + " \n";
        }
//        lista.agregarFinal(new NodoHashTable(hojita));
        
        System.out.println(hojita);
        return hojita;
       
    
    }  
   
    
    
=======
    
    public void recorrido() {
        recorrido(this.raiz);
    }
    
    public void recorrido(NodoBinario puntero) {
        if (puntero.eshoja(puntero) == false) {
//            JOptionPane.showMessageDialog(null, puntero.getElemento() + "?" + "\n" + "1-No, 2-Si");
//            JOptionPane.showMessageDialog(null, "1-No,2-Si");
            String respuesta;
            respuesta = JOptionPane.showInputDialog(puntero.getElemento() + "?" + "\n" + "1-No, 2-Si");
            if (!respuesta.equals("1") && !respuesta.equals("2")) {
                JOptionPane.showMessageDialog(null, "Introduzca el numero 1 o el 2");
                recorrido(puntero);
            }
            if (respuesta.equals("1")) {
                puntero = puntero.getHijoIzq();
            }
            if (respuesta.equals("2")) {
                puntero = puntero.getHijoDer();
            }
            recorrido(puntero);
        } else {
            RespuestaFinal(puntero);
        }
    }
    
    public void RespuestaFinal(NodoBinario puntero){
            JOptionPane.showMessageDialog(null, puntero.getElemento());
            String respuesta2;
            respuesta2 = JOptionPane.showInputDialog("Esa era la respuesta? 1-No, 2-Si");
            if(!respuesta2.equals("1") && !respuesta2.equals("2")){
                JOptionPane.showMessageDialog(null, "Introduzca el numero 1 o el 2");
                RespuestaFinal(puntero);
        }
            if (respuesta2.equals("1")){
               InsertarNuevo(puntero); 
            }
            else if(respuesta2.equals("2")){
                JOptionPane.showMessageDialog(null, "Ponmela mas dificil para la proxima!");
            }
        }
    
    public void InsertarNuevo(NodoBinario puntero){
            String correcto;
            correcto = JOptionPane.showInputDialog("Cual era tu animal?");
            String difer;
            difer = JOptionPane.showInputDialog("En que se diferencia a lo que adivine?");
            NodoBinario puntero2 = new NodoBinario(difer);
            NodoBinario puntero3 = new NodoBinario(correcto);
            puntero2.setHijoIzq(puntero);
            puntero2.setHijoDer(puntero3);
            JOptionPane.showMessageDialog(null, "Gracias ahora soy mas inteligente!");
    }
>>>>>>> develop
}
