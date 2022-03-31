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
import java.util.Scanner;

public class ArbolBinario {
    Scanner sc = new Scanner(System.in);
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
    public void recorrido(NodoBinario puntero){
            if(puntero.eshoja(puntero) == false){
                System.out.println(puntero.get_info());
                System.out.println("1-No,2-Si");
                int respuesta;
                respuesta = sc.nextInt();
                if(respuesta != 1 && respuesta != 2){
                    System.out.println("Introduzca el numero 1 o el 2");
                    recorrido(puntero);
                }
                if(respuesta == 1){
                    puntero = puntero.getHijoIzq();
                    }
                if(respuesta == 2){
                    puntero = puntero.getHijoDer();
                    }
                recorrido(puntero);
            }
            else{
            RespuestaFinal(puntero);
            }
        }
        
        //Despues de adivinar pregunta si era correcto o no.
        public void RespuestaFinal(NodoBinario puntero){
            System.out.println(puntero.get_info());
            System.out.println("Esa era la respuesta? 1-No, 2-Si");
            int respuesta2;
            respuesta2 = sc.nextInt();
            if(respuesta2 != 1 && respuesta2 != 2){
            System.out.println("Introduzca el numero 1 o el 2");
            RespuestaFinal(puntero);
        }
            if (respuesta2 == 1){
               InsertarNuevo(puntero); 
            }
            else if(respuesta2 == 2){
                System.out.println("Ponmela mas dificil para la proxima!");
            }
        }
        public void InsertarNuevo(NodoBinario puntero){
            System.out.println("Cual era tu animal?");
            String correcto; 
            correcto = sc.next();
            System.out.println("En que se diferencia a lo que adivine?");
            String difer;
            difer = sc.next();
            NodoBinario puntero2 = new NodoBinario(difer);
            NodoBinario puntero3 = new NodoBinario(correcto);
            puntero2.setHijoIzq(puntero);
            puntero2.setHijoDer(puntero3);
        }
}
