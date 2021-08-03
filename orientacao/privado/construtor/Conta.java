package orientacao.privado.construtor;

import orientacao.ContaMetodos;

public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	//Contrutor da Classe, Rotina de inicializacao, somente executa uma vez
	//para cada objecto criado, EXemplo; Conta novaconta = new Conta()
	//neste caso ira executar quendo dermos um outro new ira Criar novamentes
	
	
	//pode receber paramentros exempllo,podemos passar a agencia, e o numero
	public Conta(int agencia, int numero) {
		if (agencia <= 0 && numero <=0) {
			System.out.println("Numeros Negativos Conta nao pode ser criada");
			return;
		}
		this.agencia = agencia;
		this.numero = numero;
		
		System.out.println("Crindo uma conta come numero: " + this.numero);
		
	}
	
	

	// metodo que nao retorna nada, que recebe um parametro de do tipo double
	public void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("Nao pode Depositar valor manor ou igual a Zero");
			return;
		} else {
			this.saldo += valor;
			System.out.println("Valor depositado com sucesso: " + valor);
		}
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
		if (novoNumero <= 0) {
			System.out.println("Nao pode Inserir o numero da conta com Valor menor ou iguais a zero");
			return;
		}
		this.numero = novoNumero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int novaAgencia) {
		if (novaAgencia <= 0) {
			System.out.println("Nao pode inserir O Numero da agencia com Valores menores ou iguais a zero");
			return;
		}
		this.agencia = novaAgencia;
	}

	public void setTitular(Cliente novoTitular) {
		this.titular = novoTitular;
	}

	public Cliente getTitular() {
		return titular;
	}
}
