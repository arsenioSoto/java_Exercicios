package orientacao.funcionario;

import java.util.Scanner;

public class TestaFunc {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Codigo: ");
		int codigo = k.nextInt();
		System.out.println("Nome: ");
		String nome = k.next();
		System.out.println("Salario: ");
		double salarioDiario = k.nextDouble();
		System.out.println("Dias Trabalhados: ");
		int diasTrab = k.nextInt();
		
		System.out.println("Codigo: ");
		int codigo1 = k.nextInt();
		System.out.println("Nome: ");
		String nome1 = k.next();
		System.out.println("Salario: ");
		double salarioDiario1 = k.nextDouble();
		System.out.println("Dias Trabalhados: ");
		int diasTrab1 = k.nextInt();
		
		Funcionario func1, func2;
		
		func1 = new Funcionario (codigo, nome, salarioDiario, diasTrab);
		func2 = new Funcionario (codigo, nome, salarioDiario, diasTrab);
	
		boolean resultado = func1.equals(func2);
		System.out.println("Comparacao de Objectos: " + resultado);
		System.out.println(func1.toString());
		System.out.println(func2.toString());
		
		double salarioFuncionario1 = func1.getSalarioDiario();
		System.out.println("Salario func 1: " + salarioFuncionario1 + func1.getDiasTrab());
		
		double salarioFuncionario2 = func2.getSalarioDiario();
		System.out.println("Salario func 2: " + salarioFuncionario2 + func2.getDiasTrab());
		
		System.out.println("Objectos Criados: " + Funcionario.getObjectosCriados());
		
	}

}
