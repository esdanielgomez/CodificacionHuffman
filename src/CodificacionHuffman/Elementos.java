/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodificacionHuffman;

/**
 *
 * @author jeffer
 */
public class Elementos {
    private int freq;
    private char caracter;

    public Elementos(int freq, char caracter) {
        this.freq = freq;
        this.caracter = caracter;
    }

    public char getCaracter() {
        return caracter;
    }

    public int getFreq() {
        return freq;
    }
    
}
