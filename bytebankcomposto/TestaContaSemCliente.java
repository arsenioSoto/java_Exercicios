package bytebankcomposto;

import bytebankencapsulado.Cliente;
import bytebankencapsulado.Conta;

public class TestaContaSemCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta contaSoto = new Conta(123, 113);
	//	System.out.println(contaSoto.saldo);
		
		contaSoto.titular =  new Cliente();
		System.out.println(contaSoto.titular);
		
		contaSoto.titular.setNome("Sword");
		System.out.println(contaSoto.titular.getNome());
	}

}
