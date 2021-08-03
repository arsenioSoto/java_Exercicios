/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoratribuicao;

/**
 *Exercicio: adicao, multiplicacao, div, etc...
 * 2020-07-03
 * @author Soto.Jr
 */
public class OperadorAtribuicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float soma = 4, divisao = 10, multi = 3, sub = 10;
        
        
        soma += 2.5f; //Explicacao: nr = 4 entao sera nr = 4 + 2 = sera Igual ha 6
        System.out.println("A Soma eh: " + soma);
        
        
        multi *= 7;
        System.out.println("A Multiplicacao eh Igual: " + multi);
        
        divisao /= 2;
        System.out.println("A divisao eh Igual: " + divisao);
        
       sub -= 5;
        System.out.println("A Subtracao eh igual: " + sub);
        
        
        
        
    }
    
}
