/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector01;

import java.util.Arrays;

/**
 *busca binaria
 * @author Soto.Jr
 */
public class buscaVector {
    
    public static void main(String[] args){
        
        int num[] ={2,3,32,2,3,4,3,0,432,43,24,32,43};
        for(int valor: num){
            System.out.println(valor + " ");
        }
        System.out.println(" ");
        int pos = Arrays.binarySearch(num, 43);
         System.out.println("Encontrei o Valor na Posicao: " + pos);
    }
    
}
