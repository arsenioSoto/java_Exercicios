package aula1;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idadeArsenio = 22;
		int idadeSoto = 21;
		
		int somaIdade = idadeArsenio + idadeSoto;
		
		System.out.println(somaIdade);
		
		//toda varialvel deve ser inicializada 
		int numero = 10;
		System.out.println(numero);
		
		//tipo de daddo para receber numeros com pontos flutuantes
		double pi = 3.1415;
		double doubroPi = pi * 2;
		System.out.println(doubroPi);
		
		//variaveldo tipo logico
		boolean amigo = true;
		boolean inimigo = false;
		
		System.out.println(!amigo);
		System.out.println(!inimigo);
		
		//testando condicoes logicas
		
		boolean maiorDeIdade = idadeSoto <= 19;
		System.out.println(maiorDeIdade);
		
		// tipo de dado para receber um caracter
		
		char letra = 'A';
		
		//classe para receber mais de 1 caracter
		
		String nome = "Arsenio";
		
		//trabalhando com quantidade de espacos que possam caber nos tipos primitivos
		
		
		int numeroPequeno = 32000;
		
		long numeroGrande = 9999999999L;
		
		// ira dar Erro dizendo que nao pode Converter
		//um numero de Long para int devido o espaco que o Inte 
		//tem em relacao ao Long
		//para usar temos que fazxer a conversao usanedo
		//o famoso TypeCaste
		numeroPequeno = (int) numeroGrande;
		
		//mais podemos inserir o valor de int no tipo long
		numeroGrande = numeroPequeno;
		
		float outroPi = 3.14f;
		double pii = 3.14;
		
		// para fazer conque um float receba o valor de um Double
		//temos que Converter primero e nesta conversao podemos
		//usar o TypeCast(float)
		outroPi = (float) pii;
		
		//mais p double pode receber o valor de float
		pii = outroPi;

	}

}
