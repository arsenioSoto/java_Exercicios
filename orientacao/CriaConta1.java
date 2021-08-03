package orientacao;

public class CriaConta1 {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 233;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 12;
		
		System.out.println("Saldo 2: "+ segundaConta.saldo);
		System.out.println("Saldo 1: "+ primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("Sao ha Mesma Conta");
		}else {
			System.out.println("Contas diferentes!");
		}
		
		System.out.println("Referencia  2: "+ segundaConta);
		System.out.println("Referencia  1: "+ primeiraConta);
		
	}

}
