package CodificacionHuffman;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ecuad
 */
public class HuffmanApp {  
    public static PriorityQueue<Node> q;
    public static HashMap<Character, String> charToCode;
    
    
    public static HashMap<String, Character> codeToChar;
    
    public static ArrayList<Elementos> Ordenados;
    // This method builds the tree based on the frequency of every characters
    public static Node huffman(int n) {
        Node x, y;
 
        for(int i = 1; i <= n-1; i++) {
            Node z = new Node();
            z.left = x = q.poll();
            z.right = y = q.poll();
            z.freq = x.freq + y.freq;
            q.add(z);
        }
 
        return q.poll();
    }
    
    public static String Procesar(String text) throws FileNotFoundException, IOException{
        Ordenados = new ArrayList<>();
        // Count the frequency of all the characters
        HashMap<Character, Integer> dict = new HashMap<Character, Integer>();
 
        for(int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
 
            if(dict.containsKey(a))
                dict.put(a, dict.get(a)+1);
            else
                dict.put(a, 1);
        }
 
        // Create a forest (group of trees) by adding all the nodes to a priority queue
        q = new PriorityQueue<Node>(100, new FC());
        int n = 0;
 
        for(Character c : dict.keySet()) {
            q.add(new Node(c, dict.get(c)));
            n++;
        }
 
        // Identify the root of the tree
        Node root = huffman(n);
 
        // Build the table for the variable length codes
        buildTable(root);
 
        root.preOrden(root);
        
        String compressed = compress(text);
         
        ///////////////////
        try{
            FileOutputStream fs = new FileOutputStream("objHF.ser");//Creamos el archivo
            ObjectOutputStream os = new ObjectOutputStream(fs);//Esta clase tiene el método writeObject() que necesitamos
            os.writeObject(codeToChar);//El método writeObject() serializa el objeto y lo escribe en el archivo
            os.close();//Hay que cerrar siempre el archivo
          }catch(FileNotFoundException e){}catch(IOException e){}
        //////////////////////////////////////////
        
        
        return compressed;
        //saveToFile(compressed);
    }
    
   
    // This method builds the table for the compression and decompression
    public static void buildTable(Node root) {
        charToCode = new HashMap<Character, String>();
        codeToChar = new HashMap<String, Character>();
 
        recorrido(root, new String());
    }
 
    // This method is used to traverse from ROOT-to-LEAVES
    public static void recorrido(Node n, String s) {
        if(n == null)
            return;
 
        recorrido(n.left, s+"0");
        recorrido(n.right, s+"1");
 
        // Visit only nodes with keys
        if(n.alpha != '\u0000') {
            System.out.println("\'" + n.alpha + "\' -> " + s);
            charToCode.put(n.alpha, s);
            codeToChar.put(s, n.alpha);
        }
    }
 
    // This method assumes that the tree and dictionary are already built
    public static String compress(String s) throws FileNotFoundException {
        String c = new String();
        
        PrintWriter fil = new PrintWriter("compressHF.txt");
        for(int i = 0; i < s.length(); i++){
            c = charToCode.get(s.charAt(i));
            fil.print(c);
        }
        fil.close();
        return new Scanner(new File("compressHF.txt")).useDelimiter("\\A").next();

    }
 
    // This method assumes that the tree and dictionary are already built
    public static String decompress(String s) {
        String temp = new String();
        String result = new String();
 
        for(int i = 0; i < s.length(); i++) {
            temp = temp + s.charAt(i);
 
            if(codeToChar.containsKey(temp)) {
                result = result + codeToChar.get(temp);
                temp = new String();
            }
        }
 
        return result;
    }
 
}