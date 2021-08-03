/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturarepeticaocontador;

/**
 *
 * @author Soto.Jr
 */
public class MudandoFluxoComBreak {
    
    public static void main(String[] args) {
        
        int c =0;
        while (c<10) {
        c++;
            if ((c ==2) || (c == 3) || (c == 4)) {
                continue;//Saltando os Numeros Acima
   
            }
            if (c ==7) {
                break;//encerrando a contagem
            }
            System.out.println(c + "- Arsenio Soto");
        }
    }
    
}
