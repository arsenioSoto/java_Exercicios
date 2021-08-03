package aula2;

public class Funcionario {
	
	private String nome;
	protected double salario;
	//private int cargo;
	
	public void setSalrio(double valor) {
		this.setSalario(valor);
	}
	
	public double getBonos() {
		return this.getSalario()*0.2;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
