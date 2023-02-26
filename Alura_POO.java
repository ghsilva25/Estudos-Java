package alura.java;

class Conta {
	
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	void deposita (double valores) {
		this.saldo = saldo + valores;
		
	}
	
	public boolean saca (double valores) {
		if (this.saldo >= valores) {
			this.saldo = this.saldo - valores;
			return true;
			
		} else {
			return false;
		}
	}
		public boolean transfere(double valores, Conta destino) {
	        if(this.saldo >= valores) {
	            this.saldo -= valores;
	            destino.deposita(valores);
	            return true;
	        }
	        return false;
	    }
	}