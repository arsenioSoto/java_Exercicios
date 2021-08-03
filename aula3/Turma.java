package aula3;

public class Turma {
	
	Aluno[] aluno;
	
	void imprimirNotas() {
		//condicao para imprimir notas do primeiro ate o ultimo
		//fazer de 0 ate primeira.notas.length === segnifica que e para imprimir ate o ultimo numero ou seja percorrer todo array
		//this diz para ele que esta dentro desta classs a varialvel notas 
		for (int i = 0; i < this.aluno.length; i++) {
			Aluno aluno = this.aluno[i];
			if(aluno == null) continue;
		System.out.println("Nome: "+aluno.nome + "     Nota: " + aluno.nota);
		
		}
	}

}
