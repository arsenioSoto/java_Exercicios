package aula;

public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando Condicional");
		int idade = 19;// declarando variavel do tipo int com o identificador Idade a receber valor 3
		int quantidadePessoa = 3;//
		boolean acompanhado = quantidadePessoa >= 2;//declarando uma variavel do tipo boolean que nos testa se uma condicao e verdade ou falso,
		//neste caso testa se a quantidadedePessoas e maior ou igual ha 2
		
		
		// condicional simples testando o OU
		//if (idade >= 18 || quantidadePessoa >= 2) {
		
		
		
		//testando o E
		//	if (idade >= 18 && quantidadePessoa >= 2) {
		
		
		
		//Testando o tipo Boolean
		System.out.println("Quantidade Pessoa: " + acompanhado);
		//nsesta condicao nos ira retorna uma condicqao boolean se a idade >= 18 e aCompanha for verdade 
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!");

		} else {
			System.out.println("Infelizmente nao podes Entrar");
		}
	}
}
