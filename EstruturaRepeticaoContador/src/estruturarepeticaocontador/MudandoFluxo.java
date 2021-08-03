/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturarepeticaocontador;

/**
 *interopendo o Fluxo natural com o Continue
 * @author Soto.Jr
 */
public class MudandoFluxo {
    
    public static void main(String[] args) {
     
        int c = 0;
        while (c < 10) {            
            c++;
            if ((c ==5) || (c == 7)) {
                continue;
            }
            System.out.println(c + "- Arsenio Soto");
        }
        
    }
    
}
