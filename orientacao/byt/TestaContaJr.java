package orientacao.byt;

public class TestaContaJr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta contaJr = new Conta();
		System.out.println(contaJr.saldo);
		
		contaJr.titular = new Cliente();
		System.out.println(contaJr.titular);
		
		contaJr.titular.nome = "Arsenio Soto";
		System.out.println(contaJr.titular.nome);
	}

}
