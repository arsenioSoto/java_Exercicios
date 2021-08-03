package orientacao.privado.construtor;

public class TestaValores {

	public static void main(String[] args) {
		
		//recebendo parametro do Contrutor
		//um construtor recebe parametros, onde pedinos valores default 
		//ou outras opcoes
		Conta nova = new Conta(-1233, 0);
		
		//conta inconsistente
		//nova.setAgencia(-797);
		//nova.setNumero(-779);
		//nova.depositar(-12312);
		
		System.out.println("Agencia: " + nova.getAgencia());

	}

}
