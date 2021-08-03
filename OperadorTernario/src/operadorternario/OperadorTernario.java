/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author Soto.Jr
 */
public class OperadorTernario {

    
        //> Maior             10 > 2   Verdade
        //< Menor             10 < 2   Falso   
        //>= Maior ou Igual   10 >= 2  Verdade 
       // <= Menor ou Igual   10<= 2   Falso
        //== Igual a          10 == 2  Falso
        //!= Diferente de     10 != 2  Verdade 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, res;
        
        n1 = 4;
        n2 = 8;
        //Acoma declaramos e Atribuimos as Variasveis
        //Abaixo Fazemos as Comparacoes
        //se n1 for maior que n2 devemos somar senao subtrair
        
        res = (n1>n2)?n1+n2:n2-n1;
        System.out.println(res);
        
        
        String nome1 = "Soto";//declaracao de variavel
        String nome2 = "Soto";
        String nome3 = new String("Soto");//nome tres tem Igualdade no Conteudo com os Outros; e diferente porque ele foi Instanciado
        //para Verificar se o Conteudo do Nome1 Eh igual ao conteudo de n3 temos de Colocar o <<Equlas> metodo> ele verifica se os 
        // conteudos dos objectos sao Iguais;
        String re;
        String r;
        re = (nome1 ==nome2)?"Igual":"Diferente";
        r = (nome1.equals(nome3))?"Igual":"Diferente";
        System.out.println("n1 e n3: " + re);
        System.out.println("n1 e n3: " + r);
    }
    
}
