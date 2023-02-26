package alura.java;

public class TesteReferencia {
	
	public static void main (String [] args) {
		
		Conta primeiraConta = new Conta ();
		primeiraConta.saldo = 300;
		
		System.out.println("O saldo da primeira conta é: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("O saldo da segunda conta é: " + primeiraConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("A segunda conta tem " + segundaConta.saldo);
		
		System.out.println(segundaConta.agencia);
		
		segundaConta.agencia = 146;
		System.out.println("Agora a segunda conta esta" + " na agencia " + segundaConta.agencia);
		
		if (primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
			
			
		} else {
			System.out.println("contas diferentes");
			
		}
		
		
	
	}

}
