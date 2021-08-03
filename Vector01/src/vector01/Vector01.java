/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector01;

/**
 *
 * @author Soto.Jr
 */
public class Vector01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declarando um vetor
        int n[] = {2,3,3,23,5};
        
        //
        
        //verificando o tamanho do vector
        System.out.println("Total de casasde N: " + n.length);
        
        //listagem com for// lista ate o menor que 5
        for(int c =0; c < 5; c++){
            //mostrando o vetor
            System.out.println("Na posicao " + c + " Temos = " +n[c] + " ");
        }
    }
    
}
