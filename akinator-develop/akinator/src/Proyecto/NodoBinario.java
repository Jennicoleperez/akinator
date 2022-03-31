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
public class NodoBinario {
    private NodoBinario hijoIzq;
    private NodoBinario hijoDer;
    private String elemento;
    
    public NodoBinario(String elemento){
        this.elemento = elemento;
        this.hijoIzq = null;
        this.hijoDer = null;
    }
    
    public String get_info(){
        return elemento;
    }

    public NodoBinario getHijoIzq() {
        return hijoIzq;
    }
    

    public void setHijoIzq(NodoBinario hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoBinario getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoBinario hijoDer) {
        this.hijoDer = hijoDer;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }
    
    public boolean eshoja(NodoBinario puntero){
        if(this.hijoIzq == null && this.hijoDer == null){
            return true;
        }else{
            return false;
        }
    }
 }
