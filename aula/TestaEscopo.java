package aula;

public class TestaEscopo {
	public static void main(String[] args) {
		
		//escopo de variavel eh onde nasce e morre uma variavel

		System.out.println("Testando Condicional");
		int idade = 19;
		int quantidadePessoa = 3;
		boolean acompanhado;
		
		
		if (quantidadePessoa >= 2) {
			//exemplo de escopo de variavel
			//aqui a variavel acompanhado ainda nao existe
			//aqui tambem
			acompanhado = true;
			
			//boolean acompanhado = true; //comeca a existir agora
			//ainda existe
		
		
		
		} else {//a variavel para de existir aqui
			//nao existe
			//nao existe
			
			acompanhado = false;
			
			
			
			//boolean acompanhado = false;//ja existe
			//ainda existe
			//ainda existe
		
		
		
		}//a variavel more aqui
		
		System.out.println(acompanhado);

	}
}
