package orientacao.byt;

public class TestaConta {

	public static void main(String[] args) {
		
		Cliente arsenio = new Cliente();
		arsenio.nome ="Arsenio";
		arsenio.cpf ="12321312312";
		arsenio.profissao ="Programador";
		
		Conta arsenioSoto = new Conta(); 
		arsenioSoto.depositar(1000);
		
		arsenioSoto.titular = arsenio;
		
		System.out.println(arsenioSoto.titular.nome);

	}

}
