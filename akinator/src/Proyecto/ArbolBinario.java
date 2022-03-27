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
	Node root;
        
	public ArbolBinario() {
		this.root = null;
	}
        public boolean its_empty(Node n){
            return n==null;
        }
	public void insertLeft(String parent, String leftvalue) {
		Node n = find(root, parent);
		Node leftchild = new Node(leftvalue);
		n.Set_Left_child(leftchild);
	}

	public void insertRight(String parent, String rightvalue) {
		Node n = find(root, parent);
		Node rightchild = new Node(rightvalue);
		n.Set_Right_child(rightchild);
	}

	public void insertRoot(String data) {
		root = new Node(data);
	}

	public Node getRoot() {
		return root;
	}

	public Node find(Node n, String key) {
		Node result = null;
		if (n == null)
			return null;
		if (n.get_info() == key)
			return n;
		if (n.Left_child() != null)
			result = find(n.Left_child(), key);
		if (result == null)
			result = find(n.Right_child(), key);
		return result;
	}

	public int getheight(Node root) {
		if (root == null)
			return 0;
		return Math.max(getheight(root.Left_child()), getheight(root.Right_child())) + 1;
	}

	public void printTree(Node n) {
		if (n == null)
			return;
		printTree(n.Left_child());
		n.displayNode(n);
		printTree(n.Right_child());
	}
        //Recorre el arbol haciendo preguntas al usuario hasta que se encuentra con una hoja(nodo que no tiene hijos),
        //Al final adivina que animal era
        
        public void recorrido(Node puntero){
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
                    puntero = puntero.Left_child();
                    }
                if(respuesta == 2){
                    puntero = puntero.Right_child();
                    }
                recorrido(puntero);
            }
            else{
            RespuestaFinal(puntero);
            }
        }
        
        //Despues de adivinar pregunta si era correcto o no.
        public void RespuestaFinal(Node puntero){
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
        
        // Metodo para insertar el nuevo animal, recibe como dato el animal que adivinaste mal
        //y crea 2 nuevos nodos: la respuesta correcta y lo que los diferencia
        public void InsertarNuevo(Node puntero){
            System.out.println("Cual era tu animal?");
            String correcto; 
            correcto = sc.next();
            System.out.println("En que se diferencia a lo que adivine?");
            String difer;
            difer = sc.next();
            Node puntero2 = new Node(difer);
            Node puntero3 = new Node(correcto);
            puntero2.Set_Left_child(puntero);
            puntero2.Set_Right_child(puntero3);
            //printTree(puntero);
        }
    
}

