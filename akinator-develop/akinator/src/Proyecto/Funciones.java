/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import javax.swing.JOptionPane;


public class Funciones {
       
    
    /**
     * Función que devuelve un arreglo con todas las palabras del texto, sin caracteres especiales.
     * 
     * @param texto texto proveniente de leer el csv
     * @return arreglo con las palabras
     * 
     */
    public String[] soloPalabrasArray(String texto) {

        texto = texto.replaceAll("[^A-Za-z0-9áéíóúÁÉÍÓÚüÜ ]", "").toLowerCase();
        texto.replace('á', 'a').replace('é', 'e').replace('í', 'i').replace('ó', 'o').replace('ú', 'u').replace("ü", "u");

        String[] array = texto.split(" ");

        return array;

    }
    
}