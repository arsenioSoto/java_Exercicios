/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturacondssimplsmedia;

import java.util.Scanner;

/**
 *
 * @author Soto.Jr
 */
public class EstruturaCondSsimplsMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a Primeira Nota: ");
        float n1 = entrada.nextFloat();
        System.out.println("Digite a Segunda Nota: ");
        float n2 = entrada.nextFloat();
        float m =(n1+n2)/2;
        System.out.println("A Sua Media Foii: " + m);
        if (m>10) {
            System.out.println("Parabens, Estudante!");
        }
    }
    
}
