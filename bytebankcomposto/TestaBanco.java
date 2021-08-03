package bytebankcomposto;

import bytebankencapsulado.Cliente;
import bytebankencapsulado.Conta;

public class TestaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente arsenio = new Cliente();
		arsenio.setNome("Arsenio");
		arsenio.setCpf("1233");
		arsenio.setProfissao("Programador");
		arsenio.setContact("786887");
		
		Conta contaArsenio = new Conta(12, 123);
		contaArsenio.deposita(899);
		
		contaArsenio.titular = arsenio;
		System.out.println(contaArsenio.titular.getNome());
		System.out.println(contaArsenio.titular.getProfissao());

	}

}
