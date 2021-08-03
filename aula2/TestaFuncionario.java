package aula2;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario arsenio = new Funcionario();
		arsenio.setSalrio(1000);
		
		GerenteFuncionario soto = new GerenteFuncionario();
		soto.setSalario(9999);
		System.out.println(arsenio.getBonos());
		System.out.println(soto.getBonos());
	}

}
