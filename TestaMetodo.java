package alura.java;

public class TestaMetodo {
	
	public static void main (String [] args) {
		
		Conta contaDaFran = new Conta ();
		contaDaFran.saldo = 100;
		contaDaFran.deposita(50);
		
		System.out.println(contaDaFran.saldo);
		
		boolean conseguiuRetirar = contaDaFran.saca(20);
		
		System.out.println(contaDaFran.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDoGabriel = new Conta();
		contaDoGabriel.deposita(1000);
		
		if(contaDoGabriel.transfere (300, contaDaFran)) {
			System.out.println("Transferência realizada com sucesso");
			
		} else {
			System.out.println("Faltou dinheiro");
		}
		
		
		System.out.println(contaDoGabriel.saldo);
		System.out.println(contaDaFran.saldo);
	

	}

}
