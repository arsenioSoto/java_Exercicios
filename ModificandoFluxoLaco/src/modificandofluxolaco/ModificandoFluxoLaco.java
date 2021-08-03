/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificandofluxolaco;

/**
 *
 * @author Soto.Jr
 */
public class ModificandoFluxoLaco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc  =  1;
        while (cc <= 20){
          cc++;
          if(cc == 4 || cc == 18){
              continue;
          }
            System.out.println("cambalhota " +   cc);
    }
    
}
}
