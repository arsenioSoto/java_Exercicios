/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testandotipos;

/**
 * licao 1.1
 *Convertendo valores 
 * @author Soto.Jr
 */
public class TestandoTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //conversao de Inteiro para String
        int idade = 30;//Atribuicao Simples
        String valor = Integer.toString(idade);//Convertendo com ha Classe Involocra Integer e metodo toString
        System.out.println(valor);
        
        String ano = "21"; //atribuicao normal 
        int val = Integer.parseInt(ano); // convertendo uma String para um Inteiro co, classe involocra Integer, parse=> converter para inteiro
        System.out.println(val);
        
        String a = "22"; //atribuicao normal 
        float v = Float.parseFloat(a); // convertendo uma String para um Inteiro co, classe involocra Integer, parse=> converter para inteiro
        System.out.printf("%.3f \n" , v);   //colocando casas decimais
    }
    
}
