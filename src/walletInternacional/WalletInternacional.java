package walletInternacional;

//Clase abstracta Wallet Internacional
abstract class WalletInternacional {
	
	private String titular;
	 private double saldo;
	 
	 //Constructor
	public WalletInternacional(String titular, double saldo) {
	     this.titular = titular;
	     this.saldo = saldo;
	 }

	// Método abstracto para verificar fondos (debe ser implementado por las subclases)
	 public abstract boolean verificarFondos();

	//Getter para el atributo titular
	public String getTitular() {
	  return titular;
	}

	// Getter para el atributo saldo
	public double getSaldo() {
	  return saldo;
	}
}