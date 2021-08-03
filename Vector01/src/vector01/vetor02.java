/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector01;

/**
 *mostrando quantos dias tem o mes dentro de anos
 * @author Soto.Jr
 */
public class vetor02 {
    
    public  static void main(String[] args){
        
        String mes[]= {"jan", "fev", "Marc","Abr","Mai","jun",
                        "jul","ago", "set","out", "Nov","dez"};
        int tot[]= {31,28,31,30,31,30,31,31,30,31,30,31};   
        for(int c=0; c<mes.length; c++){
            System.out.println("O mes de "+ mes[c] + "  Tem " + tot[c] + "  dias oa todo");
        }
        
    }
    
}
