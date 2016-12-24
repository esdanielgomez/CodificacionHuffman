package CodificacionHuffman;

import static CodificacionHuffman.HuffmanApp.Ordenados;
import java.util.ArrayList;

/**
 *
 * @author ecuad
 */
class Node {
 
    public char alpha;
    public int freq;
    public Node left, right;
    public static Object objeto;
    public Node(char a, int f) {
        alpha = a;
        freq = f;
    }
    
    public Node(){}
 
    public void preOrden(Node nodo)
    {   
        
        if(nodo == null)
            return;
        
        if(nodo.alpha != '\u0000') {
            System.out.println(nodo.alpha + "->!" + nodo.freq);     //mostrar datos del nodo
            Ordenados.add(new Elementos(nodo.freq,nodo.alpha));
        }
            
        preOrden(nodo.left);   //recorre subarbol izquierdo
        preOrden(nodo.right);     //recorre subarbol derecho
    }
 
}