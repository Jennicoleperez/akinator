/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcel
 */
public class Lista {
    
    private NodoLista pFirst;
    private NodoLista pLast;
    private int size;

    
//constructor de lista de la lista con sus variables respectivas insert code construccion    
    public Lista(NodoLista pFirst, NodoLista pLast, int size) {
        this.pFirst = pFirst;
        this.pLast = pLast;
        this.size = size;
    }

//pero necesito incializar asi    
    public Lista() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
    
    
    
//Getters y Setters Right click inster code
    public NodoLista getpFirst() {
        return pFirst;
    }

    public void setpFirst(NodoLista pFirst) {
        this.pFirst = pFirst;
    }

    public NodoLista getpLast() {
        return pLast;
    }

    public void setpLast(NodoLista pLast) {
        this.pLast = pLast;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    //funciones originales
    
// Pregunta si la condicion pFirts == null se cumple, si se cumple retorna true si no false    
    public boolean EsVacio(){
        return pFirst == null;
    }
    
    public void InsertarFinal(String pregunta, String no, String si){
        NodoLista nuevoNodo = new NodoLista(pregunta, no, si);
        
        if (EsVacio()){
            pFirst = nuevoNodo;
            pLast = nuevoNodo;
        } else{
            NodoLista aux = pLast;
            aux.setpNext(nuevoNodo);
            pLast = nuevoNodo;
        }
        
        size += 1;
    }
    
    public void Imprimir(){
        
        if (!EsVacio()){
            NodoLista aux = pFirst;
            for (int i = 0; i < size; i++) {
                System.out.print(aux.getPregunta() + " ");
                System.out.println(aux.getNo() + " ");
                System.out.println(aux.getSi() + " ");
                aux = aux.getpNext();
                
            }
        }else{
            System.out.println("La lista esta vacia");
        }
    }
    
    public void EliminarAlInicio(){
        if (!EsVacio()){
            pFirst = pFirst.getpNext();
            size = size - 1;
        }else{
            System.out.println("La lista esta vacia");
        }
    }
    
    public void MostrarElementos(){
        String final_msg = "";
        if (!EsVacio()){
            NodoLista aux = pFirst;
            
            for (int i = 0; i < size; i++) {
                final_msg = final_msg + "Pregunta: " + aux.getPregunta() + "\n" + aux.getNo() + "\n" + aux.getSi() + "\n";
                aux = aux.getpNext();
                
            }
            JOptionPane.showMessageDialog(null, final_msg);
        }else{
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
        
    }
    
    
    
    
    
}
