package orientacao.encapsulamento;

public class ContaEncapsulada {
	

	double saldo;
	int agencia;
	int numero;
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true; 
		}else {
			return false;
		}
	}

}
