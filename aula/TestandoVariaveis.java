package aula;

public class TestandoVariaveis {

	public static void main(String[] args) {
		
// Declarando uma variavel
		//da Class String e do tipo de dado Int 
		String nome = "Arsenio Jose Soto";
		int idade = 22;
		int telefone = 845072619;
		char sexo = 'M';
		double peso = 67, altura = 1.70;
		
		System.out.println("Nome: " + nome);
		System.out.println("Tem: " + idade + " anos");
		System.out.println("Telefone: " + telefone);
		System.out.println("Sexo: " + sexo);
		System.out.println("Imc: " + peso / (altura*altura));
	}
}
