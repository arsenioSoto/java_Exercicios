package aula;

public class TestaLacos2 {

	public static void main(String[] args) {
		
		for(int linha = 0; linha < 10; linha++) {
			for(int coluna = 0; coluna < 10; coluna++) {
				if(coluna > linha) {//se o numero de linhas maior que colunas
					break;//sai da interacao e passe para ou senao imprime asteristicos
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
