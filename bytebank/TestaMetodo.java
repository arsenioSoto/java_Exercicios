package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaArsenio = new Conta();
		contaArsenio.deposita(100);
		contaArsenio.deposita(100);
		
		System.out.println(contaArsenio.getSaldo());
		//declarando uma variavel para saber se e verdade ou falso
		boolean consegiuRetirar = contaArsenio.saca(100);
		System.out.println(contaArsenio.getSaldo());
		System.out.println(consegiuRetirar);
		
		contaArsenio.titular = "Arsenio jose Soto ";
		System.out.println(contaArsenio.titular);
		
	
		
		Conta contaSoto =  new Conta();
		contaSoto.titular = "Soto junior";
		System.out.println(contaSoto.titular);
		contaSoto.deposita(1000);
		if(contaSoto.transfere(400, contaArsenio)){
			System.out.println("Transferencia foi Feita Com Sucesso para Conta de: " +contaArsenio.titular);
		}else {
			System.out.println("Transferencia mal Sucedida!");
		}
		
		System.out.println(contaSoto.getSaldo());
		System.out.println(contaArsenio.getSaldo());
		
	
	}

}
