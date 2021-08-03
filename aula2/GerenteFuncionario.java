package aula2;

public class GerenteFuncionario extends Funcionario {
	
	public double getBonos() {
		return this.getSalario() *  0.3;
	}

}
