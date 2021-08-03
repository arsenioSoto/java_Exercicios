package orientacao;

public class ContaMetodosTeste {

	public static void main(String[] args) {
		//criando uma conta e depositando um valor
		
		ContaMetodos novaConta = new ContaMetodos();
		//invocando um metodo ou chamando um metodo
		// usamos a referencia de seguida o nome do metodo
		novaConta.depositar(200);
		
		
		System.out.println(novaConta.saldo);
		novaConta.sacar(100);
		System.out.println(novaConta.saldo);
		
		//testando o boolean
		//quando nao consegui returna o true se nao false
		//criamos uma variavel do tipo boolean
		//para receber veradadeiro ou falso
		//e atribuimos oque ira retornanr na invocacao do metodo sacar
		boolean res = novaConta.sacar(1000);
		System.out.println(res);
		
		//instanciando um novo objecto com a palavra reservado New
		ContaMetodos outraConta = new ContaMetodos();
		outraConta.depositar(3442);
		System.out.println("Inico valor outra Conta Outra: " + outraConta.saldo);
		if(outraConta.transfere(2000, novaConta)){// se isso for Verdade
			System.out.println("Transferencia Efectuada Com sucesso!");
			System.out.println("Restou: " + outraConta.saldo);
		}else {
			System.out.println("Transferencia mal sucedida, saldo insuficiente!");
		}
		
		
		
		System.out.println("Nova Conta Recebe: " + novaConta.saldo);
		System.out.println("Outra Conta: " + outraConta.saldo);
		

	}

}
