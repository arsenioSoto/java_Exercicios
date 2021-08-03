/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturaccidade;

import java.util.Scanner;

/**
 *
 * @author Soto.Jr
 */
public class EstruturaCCIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu Ano de Nascimento!, Somente o Ano Nascimento");
        int nascimento = entrada.nextInt();
        int idade = 2021 - nascimento;
        
        if (idade >= 18) {
            System.out.println("Maior de Idade");
            System.out.println("Sua idade Eh: " + idade);
        } else {
            System.out.println("Menor de Idade");
            System.out.println("Sua idade Eh: " + idade);
        }
    }
    
}
