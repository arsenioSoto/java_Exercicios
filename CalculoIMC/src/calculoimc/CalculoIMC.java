/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoimc;

/**
 *Calculando o Indece de massa corporal formula IMC = pesoKg/altura * altura
 * @author Soto.Jr
 */
public class CalculoIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double pesoEmQuilogramas = 70;
        double alturaEmMetros = 1.70;
        double imc = pesoEmQuilogramas/ (alturaEmMetros * alturaEmMetros); 
        System.out.println("O seu Imc e igual ah: " + imc);
        //operador ternario
        //funciona da seguinte forma
        //faz uma avaliacao onde se essa avaliacao for verdadeiro retorna nos um valor
        //e se for falso retorna um outro diferrente
        String  msg = "";
       // msg = (imc >= 20 && imc =<25)? "Peso ideial": "fora do peso ideial";
        System.out.println("vc esta " + imc);
    }
    
}
