package orientacao.privado;

import orientacao.privado.Cliente;
import orientacao.privado.Conta;

@SuppressWarnings("unused")
public class TestaGettersSetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta();
		
		//testando acesso antigo
		//conta.numero = 687687; nao funciona poque os atributos sao privados
		
		//atribuindo valor a um atributo
		conta.setNumero(423);
		
		//usando o get para pegar valor de um atributo
		System.out.println("Numero :" +conta.getNumero());
		
		conta.setAgencia(2321);
		
		System.out.println("Agencia: " +conta.getAgencia());
		
		////////////////////////////////////////////////////////////
		
		Cliente arsenio = new Cliente();
		
			///nao ira compilar pois este atributo e privado ou seja nao esta visivel
		//arsenio.titular;
		
		//entendendo essa parte 
		//ele cria uma referencia onde guarda o Objecto
		// atraverz dessa referencia ele faz a referencia. depois da referencia
		//vai ate os metodos acessores o set para escrever ou dar valor ha um atributo
		//escreve a string abaixo
		arsenio.setNome("Junior");
		
		
		//entendendo esssa parte
		//ele pega a referencia criada que e a conta, dentro dessa referencia encontramos o objecto,
		//dai chamamos o metodo acessor para fazer a ligacao da conta e o Cliente criado acima
		//ou seja Conta = Cliente = nova Instancia
		conta.setTitular(arsenio);
		
		
		//impressao da referencia onde esta armazenada o Cliente
		System.out.println(conta.getTitular());
		
		//impressao do dado do Cliente
		//conta criada = pega o que esta no titular Return tutular
		//de seguida pega o que o atributo nome nosn Retorna
		System.out.println(conta.getTitular().getNome()); 
		
		//Alterando alguma coisa
		//entramos na conta, pegamos o titular da conta, e escrevemos dentrodo
	    //do atributo titular Programador
		//acesso Indirecto
		 conta.getTitular().setProfissao("Programador");
		 
		 //Acesso directo
		 arsenio.setProfissao("Mysql");
		 
		 
		 
		 //outro exemplo
		 Cliente titularConta = conta.getTitular();
		 titularConta.setProfissao("Development");
		 
		 arsenio.setProfissao("Mysql");
		 
		 
		 //pode se verificar que nesta impressao os resultados serao os mesmos
		 //cuja Criamos um unico objecto e atribuimos o valor no mesmo objecto
		 
		 System.out.println(arsenio);
		 System.out.println(titularConta);
		 
		 System.out.println(" ");
		 System.out.println("Melhor percepcao ");
		 //melhor percepcao
		 System.out.println(arsenio.getProfissao());
		 System.out.println(titularConta.getProfissao());
		 
		 
	}

}
