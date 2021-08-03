package aula3;

public class TestaTurma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Turma primeiro = new Turma();
		primeiro.aluno = new Aluno[10];
		
		primeiro.aluno[0] = new Aluno(); //instanciamos um array
		primeiro.aluno[0].nome ="Arsenio";
		primeiro.aluno[0].nota = 10;
		
		primeiro.aluno[1] = new Aluno(); 
		primeiro.aluno[1].nome = "Soto";
		primeiro.aluno[1].nota = 9;
		
		primeiro.aluno[2] = new Aluno(); 
		primeiro.aluno[2].nome = "junior";
		primeiro.aluno[2].nota = 11;
		primeiro.imprimirNotas();
		
	}

}
