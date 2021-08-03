package bytebankencapsulado;

public class TestaValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta(132, 123);
		
		System.out.println(conta.getAgencia());
		
		Conta conta1 = new Conta(1232, 222);
		
		System.out.println(Conta.getTotal());
	

	}

}
