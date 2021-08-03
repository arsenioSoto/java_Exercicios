package orientacao.funcionario;

public class Funcionario {
	
	private int codigo, diasTrab;
	private String nome;
	private double salarioDiario;
	private static int objectosCriados = 0;
	
	public Funcionario(int codigo, String nome, double salarioDiario, int diasTrab) {
		this.codigo = codigo;
		this.nome = nome;
		this.salarioDiario = salarioDiario;
		this.diasTrab = diasTrab;
		objectosCriados++;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getDiasTrab() {
		return diasTrab;
	}

	public void setDiasTrab(int diasTrab) {
		this.diasTrab = diasTrab;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioDiario() {
		return salarioDiario;
	}

	public void setSalarioDiario(double salarioDiario) {
		this.salarioDiario = salarioDiario;
	}

	public static int getObjectosCriados() {
		return objectosCriados;
	}

	public static void setObjectosCriados(int objectosCriados) {
		Funcionario.objectosCriados = objectosCriados;
	}
	
	public boolean equals(Funcionario func) {
		if (this.codigo == func.codigo) {
			return true;
		} else {
			return false;	
		}
		
	}
	
	public double salario() {
		return diasTrab*salarioDiario;
	}
	
	public static double salario (int d, double s) {
		return d*s;
	}
	
	public String toString() {
		return codigo + " Codigo " + nome + " Nome " + salarioDiario+ " Salario " + diasTrab + " Dias trabalhados ";
	}

}
