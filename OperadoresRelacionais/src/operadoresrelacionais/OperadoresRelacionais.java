/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresrelacionais;

/**
 *
 * @author Soto.Jr
 */
public class OperadoresRelacionais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
        * Operadores Logicos
        * ->  && Testa uma Clasula do Tipo E-(I) onde .Verdade &&  Falso  . Falso
        * -> || Testa ema Clausula do Tipo (OU) onde  . Falso  ||  Verdade. Verdade   
        *    
        * -> ^ Testa uma Clasula do Tipo XOU ou Exclusivo onde .Verdade ^  Verdadeiro  . Falso
        * -> ! Testa ema Clausula do Tipo (nao) onde  . !Falso =  Verdade .                  .   
        * 
        */                                          
        /*
        v e f = F 
        v e v = v
        
        */
        
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        
        boolean res, r, re, rs;

        res = (x<y && y<z)?true:false;
        System.out.println("E: " + res);
        
        r = (x<y || y<z)?true:false;
        System.out.println("OU: " + r);
        
        res = (x<y ^ y<z)?true:false;
        System.out.println("OUexclusivo: " + res);
        
    }
    
}
