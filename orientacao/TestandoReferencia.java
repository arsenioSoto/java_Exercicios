package orientacao;

public class TestandoReferencia {

	public static void main(String[] args) {
		//PrimeiraConta e uma Referencia e nao e um Objecto
		//dentro da primeira conta esta la o Objecto
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 423;
		
		System.out.println("Primeira conta: " +primeiraConta.saldo);
		
		//Exemplo 
		
		Conta segundaConta = primeiraConta;
		//copiamos a referencia da primeiraconta ou seja 
		//onde esta alocada na memoria a primeira coonta
		
		
		
		System.out.println(segundaConta);//para encontrar oque realmente esta dentro dela temos que acessar o atributo
		System.out.println("Segunda Conta: " +segundaConta.saldo);
		
		//outro exemplo
		segundaConta.saldo +=100;
		System.out.println("Testando2: "+ segundaConta.saldo);
		System.out.println("Testando1: "+ primeiraConta.saldo);
		//isso para dizer que somente temos uma variavel que referenciam para o mesmo objecto
		//exemplo a.saldo = C;
		// b.saldo = C;
		
		//testando
		
		if(primeiraConta == segundaConta) {
			System.out.println("Sao ha Mesma Conta");
		}else {
			System.out.println("Contas diferentes!");
		}
		
		//ver conta1 para entender melhor as referencias
	}

}
