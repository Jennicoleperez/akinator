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
     * leerCsvCargado()
     * Método lee el archivo cargado desde el computador 
     * Retorna una Lista de Nodos donde la informacion contenida en cada nodo
     * es la informacion por linea del csv
     */
    
    public Lista leerCsvCargado() {
        
        Lista csvListaNodos = new Lista();
        String line;
        String csvPorLinea = ""; 

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
                        csvPorLinea += line + "\n"; //cambie " " por "\n" para que leerCsv cargado y leer() retornen el mismo String
                    }

                }
                
                if (!"".equals(csvPorLinea)){
                    String[] csvListaporLinea = csvPorLinea.split("\n");
                    for (int i = 0; i < csvListaporLinea.length; i++) {
                        String[] csvListaInfoporLinea = csvListaporLinea[i].split("; ");
                        if (csvListaInfoporLinea[0].equalsIgnoreCase("pregunta")){
                            ;
                        }else{
                            csvListaNodos.InsertarFinal(csvListaInfoporLinea[0], csvListaInfoporLinea[1], csvListaInfoporLinea[2]);
                        }
                          
                    }
                }
                
                
                
                
                br.close();
                JOptionPane.showMessageDialog(null, "Lectura exitosa.");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer");
            System.out.println(e);
        }
        return csvListaNodos;
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
    
    
    /**
     * Función que devuelve Un arbol binario
     * 
     * @param Lista proveniente de leer el csv
     * @return Arbol con animales de lista que se meta en la funcion
     * 
     */
    public ArbolBinario ListToTree(Lista myList){
        ArbolBinario myTree = new ArbolBinario();
        int contador = 0;
        if (!myList.EsVacio()){ //lista distinto de 
            NodoLista aux = myList.getpFirst();
            for (int i = 0; i < myList.getSize(); i++) {
                
                if (contador == 0){
                    myTree.insertRoot(aux.getPregunta()); //Pregunta es lo equivalente a root o parent
                    myTree.insertLeft(aux.getPregunta(), aux.getNo()); //No es el Hijo Izquierdo
                    myTree.insertRight(aux.getPregunta(), aux.getSi()); //Si es el Hijo Derecho
                    contador ++;
                    aux = aux.getpNext();
                }
                else{
                    myTree.insertLeft(aux.getPregunta(), aux.getNo());
                    myTree.insertRight(aux.getPregunta(), aux.getSi());
                    aux = aux.getpNext();
                }
                
            }
        }else{
            System.out.println("La lista esta vacia");
        }
        return myTree;
    }
}
