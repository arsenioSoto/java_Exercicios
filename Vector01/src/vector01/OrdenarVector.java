/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector01;

import java.util.Arrays;

/**
 *
 * @author Soto.Jr
 */
public class OrdenarVector {
    
    public static void main(String[] args){
        int num[] ={2,3,4,1,0,45,1,23};
        Arrays.sort(num);
        for(int valor: num){
            System.out.println(valor + " ");
        }
    }
    
}
