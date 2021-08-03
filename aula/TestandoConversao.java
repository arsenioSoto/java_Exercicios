package aula;

public class TestandoConversao {
	
	public static void main(String[] args) {
		
		//podemos verificar que atribuimos e declaramos uma variavel
		//salario do tipo double, e criamos uma outra varia vel para receber este salario
		//mais como a variavel e do tipo inteiro nao e possivel fazer a conversao
		
		//double salario = 123.21;
		//int valor = salario;
		
		//mais podemos forcar a Conversao
		//para tal IUsamos o Cast
		
		double salario = 123.21;
		//          usam os o cast para Caonverter
		int valor = (int) salario;
		
		System.out.println(valor);
		
		
		//tipos de dadsos
		//tipo Int pode guardar de 
		//Long GUARDA ate 2milhoes ao Quadrado
		//short valor pequeno ate 16 bits
		//byte mais pequeno vai ate 127
		//float valor com virgula
		//double valor com virgula
	}

}
