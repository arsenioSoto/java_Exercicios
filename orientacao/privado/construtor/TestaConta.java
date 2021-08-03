package orientacao.privado.construtor;

public class TestaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta(123, 123);
		primeiraConta.depositar(100);

		System.out.println(primeiraConta.getSaldo());

	}

}
