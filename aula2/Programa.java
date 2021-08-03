package aula2;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Conta soto = new Conta();
		soto.titular = new Pessoa();
		soto.titular.nome = "Soto";
		soto.titular.cpf = "768788";
		soto.titular.dataNascimento = "1999-12-12";
		soto.numero = 123;
		soto.saldo = 30;
		//soto.titular ="Arsenio";  antes
		//depois
		
				
		soto.agencia = 1234;
		
		//usando metodos
		soto.deposita(20);
		
		soto.saca(40);
		
		
		Conta arsenio = new Conta();
		arsenio.titular = new Pessoa();
		arsenio.titular.nome = "Arsenio";
		arsenio.titular.cpf = "768788";
		arsenio.titular.dataNascimento = "1999-12-12";
		arsenio.numero = 10213;
		arsenio.saldo = 10;
		//arsenio.titular = "Soto"; antes 
		
		//depois
	
		
		arsenio.deposita(20);
		arsenio.saca(40);
		
		//transferencia
		soto.transfere(2, arsenio);
		
		System.out.println(soto.titular.nome);
		System.out.println(soto.titular.dataNascimento);
		System.out.println(soto.numero);
		System.out.println(soto.saldo); 
		System.out.println(arsenio.titular.nome);
		System.out.println(arsenio.titular.dataNascimento);
		System.out.println(arsenio.numero);
		System.out.println(arsenio.saldo);

	}

}
