/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturacondicaomultiplaescolha;

import java.util.Scanner;

/**
 *
 * @author Soto.Jr
 */
public class EstruturaCondicaoMultiplaEscolha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        System.out.println("Qual eh o Teu Mes?");
        int mes = tec.nextInt();
        String tipo;
        
       // System.out.print("===: " );
        
        switch(mes){
            case 1:
                tipo ="Janeiro";
                break;
        
            case 2:
                tipo ="Feverreiro";
                break;
            case 3:
                tipo ="Marco";
                break;
            case 4:
                tipo ="Abril";
                break; 
            case 5:
                tipo ="Maio";
                break;
        
            case 6:
                tipo ="Junho";
                break;
            case 7:
                tipo ="Julho";
                break;
            case 8:
                tipo ="Agosto";
                break; 
                
            case 9:
                tipo ="Setembro";
                break;
        
            case 10:
                tipo ="Otubro";
                break;
            case 11:
                tipo ="Novembro";
                break;
            case 12:
                tipo ="Dezembro";
                break;     
                
            default:
                tipo = "Mes nao Encontrado";
        }
        System.out.println("===" + tipo);
        
    }
    
}
