package bytebankencapsulado;

public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	//definindo um atributo para usar se em todas as instancias criadas
	private static int total = 0;
	//
	public Cliente titular ;
	
	public Conta(int numero, int agencia) {
		Conta.total++; //ou total++;
		//System.out.println("O tatal de Contas: " + total);
		this.numero = numero;
		this.agencia = agencia;
		//System.out.println("Iniciando o programa");
	}
	
	public void deposita(double valor){
		
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
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -=valor;// ou this.saldo -= sacar
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int novoNumero){
		if(novoNumero <= 0) {
			System.out.println("Nao pode numero menor ou igual a zero");
			return;
		}
		this.numero = novoNumero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int novaAgencia) {
		if(novaAgencia <= 0) {
			System.out.println("Nao pode haver numero manor ou iGual a zero");
			return;
		}
		
		this.agencia = novaAgencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		return total;
	}
}
