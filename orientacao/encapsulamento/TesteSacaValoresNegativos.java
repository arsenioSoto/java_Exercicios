package orientacao.encapsulamento;

public class TesteSacaValoresNegativos {

	public static void main(String[] args) {
		ContaEncapsulada conta = new ContaEncapsulada();
		conta.depositar(100);
		
		System.out.println("Seu Saldo: "+ conta.saldo);
		if (conta.saca(101)) {
			System.out.println("Consegue Lenvantar o Valor");
		} else {
			System.out.println("Nao Consegue Lenvantar o Valor");
		}
		
		System.out.println("Saldo Actual: " + conta.saldo);
		//deve ser proibido essa linha
		conta.saldo = conta.saldo - 101;
		System.out.println("Saldo depois de - 101:     " + conta.saldo);

	}

}
