package orientacao;

public class CriaConta {

	public static void main(String[] args) {
		//criando umainstancia
		//palavra chave para criar uma nova conta, criar um novo Objecto do
		//tipo Conta
		
		//new Conta();
		//sempre que damos o new em um objecto devolvemos uma referencia
		//ou seja dentro de um objecto ou instancia criada encontramos uma referencia, onde
		//nos indica onde esta o Atributo
		//Instanciando o Objecto publico
		
		//Criamos um Objeecto, inicializamos ou instanciamos atravez da palavra reservada New
		// e o New nos devolve uma Referencia, que guardei dentro da referencia ou variavel os seguintes dados
		//saldo, numero etc..
		//fazemos tambem a atribuicao a um atributo usando a referencia.o nome do atributo
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 233; 
		//PrimeiraConta.saldo +=342;
		primeiraConta.numero = 32;
		primeiraConta.agencia = 454;
		primeiraConta.titular = "Arsenio Soto";
		
		//Criando uma nova Conta
		Conta segundaConta = new Conta();
		segundaConta.titular = "Junior";
		segundaConta.saldo = 123;
		
		System.out.println("Minha Conta");
		System.out.println("Nome: " + primeiraConta.titular);
		System.out.println("Agencia: " + primeiraConta.agencia);
		System.out.println("Numero da Conta:"+ primeiraConta.numero);
		System.out.println("Saldo: "+ primeiraConta.saldo);
		System.out.println(""
				);
		System.out.println("Outra Conta");
		System.out.println("Nome: " + segundaConta.titular);
		System.out.println("Saldo: " + segundaConta.saldo);
	}

}
