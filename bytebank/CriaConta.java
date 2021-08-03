package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		
		//instanciando um Objecto
		Conta primeiraConta = new Conta();
		
		Conta segundaConta = new Conta();
		
		//Atribuindo um atributo
		primeiraConta.deposita(2000); 
		//primeiraConta.saldo+=100;
		//Imprimindo o Saldo
		System.out.println("Primeira Conta tem: " + primeiraConta.getSaldo());
		
		segundaConta.deposita(670);
		
		System.out.println("Segunda Conta Tem: " + segundaConta.getSaldo());
	}

}
