package aula1;

public class MaiorIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idadeVisitante = 95;
		boolean amigoDoDono = true;
		
		if(idadeVisitante > 60) {
			System.out.println("Aproveiite a melhor idade");
		}	
		else if (idadeVisitante >= 18 && amigoDoDono) {
			System.out.println("Entre na Festa");
		}else {
			System.out.println("Volte para Casa");
		}

	}

}
