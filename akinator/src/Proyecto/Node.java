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
public class Node {
    public String data;
	public Node left;
	public Node right;
	
	public Node(String ddata) {
		this.data = ddata;
		this.left = null;
		this.right = null;
	}

	public void displayNode(Node n) {
		System.out.print(n.data + " ");
	}
        
        public String get_info(){
            return this.data;
        }
        public void Set_info(String data){
            this.data=data;
        }
        public Node Left_child(){
            return this.left;
        }
         public Node Right_child(){
            return this.right;
        }
         public void Set_Left_child(Node n){
             this.left=n;
         }
         public void Set_Right_child(Node n){
             this.right=n;
         }
         
         //Metodo para ver si el nodo no tiene hijos, es decir: llegamos al final del arbol
         public boolean eshoja(Node puntero){
             boolean hoja = false;
             if(puntero.Left_child() == null && puntero.Right_child() == null){
                 hoja = true;
             }
             return hoja;
         }

}
