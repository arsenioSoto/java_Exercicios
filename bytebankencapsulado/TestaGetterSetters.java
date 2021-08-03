package bytebankencapsulado;

public class TestaGetterSetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		
		Conta conta = new Conta(123, 123);
		//conta.setNumero(1234);
		System.out.println(conta.getNumero());
		
		Cliente arsenio = new Cliente();
		arsenio.setNome("Arsenio");
		conta.setTitular(arsenio);
		
		Cliente sword = conta.getTitular();
		
		System.out.println(arsenio.getNome());
		System.out.println(conta.getTitular().getNome());
		
		System.out.println(arsenio);
		System.out.println(sword);

	}

}
