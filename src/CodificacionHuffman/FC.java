package CodificacionHuffman;

import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ecuad
 */
class FC implements Comparator<Node> {
    @Override
    public int compare(Node a, Node b) {int freqA = a.freq;int freqB = b.freq;return freqA-freqB;}
}