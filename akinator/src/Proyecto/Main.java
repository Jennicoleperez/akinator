/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import Interfaces.VentanaInicio;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Jennifer Pérez
 */
public class Main {

    /**
     * @param args the command line arguments
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

    public static void main(String[] args) {
        VentanaInicio vi = new VentanaInicio();
        ArbolBinario arbol = leer();
  
        arbol.preorden();
        
        
          

    }
  
}
