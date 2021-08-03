package orientacao.privado;

import orientacao.ContaMetodos;

public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	// metodo que nao retorna nada, que recebe um parametro de do tipo double
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
		// recebendo o valor, e uma referencia onde sera transferido
	}

	public boolean transfere(double valor, ContaMetodos destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
	}
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int novaAgencia) {
		this.agencia = novaAgencia;
	}
	
	public void setTitular(Cliente novoTitular) {
		this.titular = novoTitular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
}
