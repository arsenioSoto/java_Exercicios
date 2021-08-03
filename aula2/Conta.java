package aula2;

public class Conta {
	
	int numero;
	Pessoa titular;
	double saldo;
	int agencia; 
	
	void deposita(double valorASerDepositado){
		this.saldo += valorASerDepositado;
	}
	
	void saca(double valorASerSacado) {
		if(this.saldo >= valorASerSacado) {
		this.saldo -= valorASerSacado;
		}
	}
	
	void transfere(double valor, Conta destino) {
		this.saldo -= valor;
		destino.saldo +=valor;
	}
}
