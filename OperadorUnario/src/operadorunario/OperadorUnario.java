/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorunario;

/**
 *Exercicio: Estudando sob Operador Unario
 * Diferenca entre pre Decremento e Pos Decremento
 * 2020-07-03
 * @author Soto.Jr
 */
public class OperadorUnario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 5;
        
        //explicacao
        //exemplo pegamos o numero e depois somamos
        System.out.println("pos decremento: " + numero++);
        //Improme depois
        System.out.println("depois: "+numero);
         
        int nr = 5;
        System.out.println("pre decremento: " + ++nr);
        //Improme depois
        System.out.println("depois: " + nr);
        ////
        int val = 5;
        
        System.out.println("pre decremento: " + --val);
        System.out.println("depois " + val);
        //''''''''''''''''''''''''''''''''''''''''''''''''
        int nrr = 5;
        System.out.println("POS DECREMENTO: " + nrr--);
        System.out.println("depois: " + nrr);
    }
    
}
