/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classemath;

/**
 *Exercicio: Arrendondando os Numeros
 * 2020-07-03
 * @author Soto.Jr
 */
public class ClasseMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float v = 8.9f;
        int baixo = (int) Math.floor(v);
        System.out.println("Arredendando para Baixo: " + baixo);
        
        float vv = 8.2f;
        int cima = (int) Math.ceil(vv);
        System.out.println("Arredendando para Cima: " + cima);
        
        float vvv = 8.5f;
        int normal = (int) Math.round(vvv);
        System.out.println("Arredondando Nomal: " + normal);
        
        //numero aleatorio
        double aleatorio = Math.random();
        System.out.println("O numero Gerado: " + aleatorio);
        
        //escolher em que posicao
        
        double ale = Math.random();
        int nr = (int) (10 + ale * (100 - 10));// antes do Rendom que e *ale* colocamos o menor numero
        // somamos o menor e o Ale depois multiplicamos com o resultado adequerido dentro de ( parentises)
        System.out.println("O Numero Escolhido eh: " + nr);
    }
    
}
