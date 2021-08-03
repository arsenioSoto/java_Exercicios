package bytebank;

public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(233); 
		System.out.println("Saldo da Primeira Conta: " + primeiraConta.getSaldo());
	
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo segunda Conta " + segundaConta.getSaldo());
	
		segundaConta.deposita(123);
		
		System.out.println("Saldo da Primeira Conta: " + primeiraConta.getSaldo());
		System.out.println("Saldo da Segunda Conta: " + segundaConta.getSaldo());
	
	
		if (primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
		}
	}

}
