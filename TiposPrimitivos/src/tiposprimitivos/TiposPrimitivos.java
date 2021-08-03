/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 * Licao nr 1
 *Ler numero e nome Via Teclado e Imprimir na Tela O Conteudo
 * @author Soto.Jr
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ler nome e a nota
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o Seu Nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite ha Nota: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s eh %.2f \n", nome, nota);
    }
    
}
