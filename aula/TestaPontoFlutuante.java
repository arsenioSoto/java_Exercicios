package aula;

public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		
		double salario = 123.20;
		
		System.out.println("Meu salario por hora eh: " + salario);
		
		//double tambem recebe valores inteiros
		double idade = 76;
		
		System.out.println("Double Recebendo o valor inteiro: " + idade);
	
		double divisao = 3.14 / 2;
		
		System.out.println("Resultado: " + divisao);
		
		//int recebendo resultado com ponto flutuante mais 
		//ele tem o poder de abstrair e levar o numero inteiro
		int div = 5/2;
		 System.out.println("Forcando: " + div);
	}

}
