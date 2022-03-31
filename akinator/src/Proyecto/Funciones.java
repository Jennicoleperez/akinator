/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Funciones {
    
    public static ArbolBinario leerCsvCargado() {
        
        String linea;
        ArbolBinario arbol;
        int contador = 0;

        try {
            JFileChooser fileC = new JFileChooser();
            fileC.showOpenDialog(null);
            File file = fileC.getSelectedFile();
            if (!file.exists()) {
                file.createNewFile(); //si el archivo no existe, lo crea
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                
                String[] aux = br.readLine().split("; ");              
                NodoBinario raiz = new NodoBinario(aux[0]);
                arbol = new ArbolBinario(raiz);
                raiz.setHijoIzq(new NodoBinario(aux[1]));
                raiz.setHijoDer(new NodoBinario(aux[2]));
                
                
                
                while ((linea = br.readLine()) != null) {
                    if (!linea.isEmpty()) {
                        
                        String[] aux3 = linea.split("; ");
                        NodoBinario raizAux = arbol.buscar(aux3[0], raiz);
                        raizAux.setHijoIzq(new NodoBinario(aux3[1]));
                        raizAux.setHijoDer(new NodoBinario(aux3[2]));
                    }
                }
//                br.close();
//                JOptionPane.showMessageDialog(null, "Lectura exitosa.");
                
                return arbol;
            }    
                
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer");

            
            
        }
        return null;
    }
    
    /**
     * Función que lee archivo de txt precargado y retorna arbol con valores
     * 
     * @param texto texto proveniente de leer el csv
     * @return arbol con info del texto
     * 
     */
    
    
    public static ArbolBinario leer() {
        String linea;
        String path = "test\\conocimientos.csv";
        File file = new File(path);
        ArbolBinario arbol;

        try {
            if (!file.exists()) {
                file.createNewFile();

            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                
                String[] aux = br.readLine().split("; ");
                NodoBinario raiz = new NodoBinario(aux[0]);
                arbol = new ArbolBinario(raiz);
                raiz.setHijoIzq(new NodoBinario(aux[1]));
                raiz.setHijoDer(new NodoBinario(aux[2]));
          
                
                while ((linea = br.readLine()) != null) {
                    if (!linea.isEmpty()) {
                        String[] aux2 = linea.split("; ");
                        NodoBinario raizAux = arbol.buscar(aux2[0], raiz);
                        raizAux.setHijoIzq(new NodoBinario(aux2[1]));
                        raizAux.setHijoDer(new NodoBinario(aux2[2]));
                    }
                }
                return arbol;
            }
            
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Error al leer los datos.");
        }
        return null;
    }
    
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