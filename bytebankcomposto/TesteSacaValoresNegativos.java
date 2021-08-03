package bytebankcomposto;

import bytebankencapsulado.Conta;

public class TesteSacaValoresNegativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta(234, 233);
		conta.deposita(100);
		System.out.println(conta.saca(200));
		//System.out.println(conta.saldo);
		
		//nunca podemos acessar um atribute directamente tenos
		//de invocar-los para um funcionamento melhor 
		//conta.saldo = conta.saldo - 108;
		//System.out.println(conta.saldo);
		
		
		conta.saca(50);
		//invocando um metodo
		System.out.println(conta.getSaldo());

	}

}
