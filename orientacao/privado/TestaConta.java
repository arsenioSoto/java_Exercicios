package orientacao.privado;

public class TestaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.depositar(100);

		System.out.println(primeiraConta.getSaldo());

	}

}
