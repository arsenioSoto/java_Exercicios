package aula;

public class TestaCaracteres {
	
	public static void main(String[] args) {
		//char recebe somente um numero de caractere
		//e um numero
		char sexo = 'M';
		System.out.println(sexo);
		
		char valor = 66;//valor na bela e equivalente a = B
		
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String palavra = "cursos online de tecnologias";
		System.out.println(palavra);
		
		//somando String com numero
		palavra = palavra + 2021;
		
		System.out.println(palavra);
	}

}
