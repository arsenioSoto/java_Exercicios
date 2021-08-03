/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author Soto.Jr
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n, s = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Digite um numero: ");
            n = teclado.nextInt();
            s = s+n;
            System.out.println("quer Contunuar");
            resp = teclado.next();
            
        }while(resp.equals("S"));
        System.out.println("A soma total e igual ah: " + s);
    }
    
}
