package aula;

public class TesteCondicional {

	public static void main(String[] args) {

		System.out.println("Testando Condicional");
		int idade = 22;
		int quantidadePessoa = 3;
		// condicional simples
		if (idade >= 24) {
			System.out.println("Voce tem mais de 18 anos");
			System.out.println("Seja bem vindo!");

		} else {
			if (quantidadePessoa >= 2) {
				System.out.println("Vc tem mais de 23 anos mais pode Entrar");

			} else {
				System.out.println("Infelizmente nao podes Entrar");
			}
		}
	}

}
