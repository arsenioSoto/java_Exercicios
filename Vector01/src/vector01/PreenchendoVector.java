
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Soto.Jr
 */
public class PreenchendoVector {
    
    public static void main (String[] args){
        
        int v[] = new int[20];
        Arrays.fill(v, 0);
        for(int valor: v){
            System.out.print(valor + " ");
        }
    }
    
}
