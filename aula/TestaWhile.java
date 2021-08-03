package aula;

public class TestaWhile {
	
	public static void main(String[] args) {
		//somatorias Parcias
		int total = 0;
		int contador = 0;
		while(contador <= 10) {
			
			total = total + contador;
			contador++;
			System.out.println(total);
		}
	}

}
