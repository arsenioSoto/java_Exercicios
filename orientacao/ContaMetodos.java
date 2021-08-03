package orientacao;

public class ContaMetodos {
	
	 double saldo;
	 int agencia;
	 int numero;
	 String titular;
	
	//metodo que nao retorna nada, que recebe um parametro de do tipo double
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
											//recebendo o valor, e uma referencia onde sera transferido					
	}
	public boolean transfere(double valor, ContaMetodos destino){
		if (this.saldo >= valor) {
			this.saldo -=valor;
			destino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}

}
