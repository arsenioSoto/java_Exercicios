package orientacao.privado.statica;

public class TestaConta {

	public static void main(String[] args) {
		
		
		Conta primeiraConta = new Conta(123, 123);
		primeiraConta.depositar(100);
		
		Conta jr = new Conta(989,  323);
		

		System.out.println(primeiraConta.getSaldo());
		System.out.println("Total de Conta: " + Conta.getTotal());
	}

}
