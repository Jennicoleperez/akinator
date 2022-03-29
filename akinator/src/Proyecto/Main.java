/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import Interfaces.VentanaInicio;

/**
 *
 * @author Jennifer Pérez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funciones func = new Funciones();
        VentanaInicio vi = new VentanaInicio();
                boolean respuesta;
		ArbolBinario tree = new ArbolBinario();
		
		tree.insertRoot("Vuela?");
		tree.insertLeft("Vuela?","Ladra?");
		tree.insertRight("Vuela?", "Caza?");
		tree.insertLeft("Caza?", "Come Carroña?");
		tree.insertRight("Caza?", "Es Aguila");
		tree.insertLeft("Come Carroña?", "Insecto?");
		tree.insertRight("Come Carroña?", "Buitre");
		tree.insertLeft("Insecto?", "Es Pajaro");
                tree.insertRight("Insecto?", "Es Mosca");
                tree.insertLeft("Ladra?", "Tiene Colmillos?");
                tree.insertRight("Ladra?", "Es Perro");
                tree.insertLeft("Tiene Colmillos?", "Cuello Largo?");
                tree.insertRight("Tiene Colmillos?", "Tiene Trompa?");
                tree.insertLeft("Cuello Largo?", "Es Ratón");
                tree.insertRight("Cuello Largo?", "Jirafa");
                tree.insertLeft("Tiene Trompa?", "Entra en el agua?");
                tree.insertRight("Tiene Trompa?", "Elefante");
                tree.insertLeft("Entra en el agua?", "Es Jabalí");
                tree.insertRight("Entra en el agua?", "Se sumerge?");
                tree.insertLeft("Se sumerge?", "Es Rinoceronte");
                tree.insertRight("Se sumerge?", "Es Hipopotamo");
                Node puntero = tree.getRoot();
                tree.printTree(puntero);
                System.out.println("VOY A ADIVINAR TU ANIMAL!");
                tree.recorrido(puntero);

////        String csvPred = func.leer();
//        Lista csvCarg = func.leerCsvCargado();
////        System.out.println(csvPred);
//        ArbolBinario tree = func.ListToTree(csvCarg);
//        Node puntero = tree.getRoot();
//        tree.printTree(puntero);
        
    }
    
}
