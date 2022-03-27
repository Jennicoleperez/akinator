/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Funciones {
    
    /**
    * Método lee el archivo predeterminado
    */
        
    public String leer(){
        String linea;
        String datos_csv = "";
        String path = "test\\conocimientos.csv";
        File file = new File(path);        
                                            
        try{
            if(!file.exists()){
                file.createNewFile();
            }else{
                    FileReader fr = new FileReader(file);
                    BufferedReader br = new BufferedReader(fr);   
                    
                    while ((linea = br.readLine()) != null ){
                        if (!linea.isEmpty()){
                            datos_csv += linea + "\n";                      
                        }
                    }

            }
        }catch (Exception err){
                    JOptionPane.showMessageDialog(null, "Error al leer los datos.");
        }
        return datos_csv ;  
    }
    
    /**
     * Método lee el archivo cargado de manera remota
     */
    
    public String leerCsvCargado() {

        String line;
        String csv = ""; 

        try {
            JFileChooser fileC = new JFileChooser();
            fileC.showOpenDialog(null);
            File file = fileC.getSelectedFile();
            if (!file.exists()) {
                file.createNewFile(); //si el archivo no existe, lo crea
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        csv += line + " ";
                    }

                }
                br.close();
                JOptionPane.showMessageDialog(null, "Lectura exitosa.");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer");
        }
        return csv;
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
