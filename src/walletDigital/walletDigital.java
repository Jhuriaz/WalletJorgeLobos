package walletDigital;


//Clase CuentaCorriente (subclase de Cuenta)
class walletDigital extends Wallet {
private double limiteCredito;

//Constructor
public walletDigital(String titular, double saldo, double limiteCredito) {
	// Llama al constructor de la superclase (CON SUPER)
	 super(titular, saldo); 
 this.limiteCredito = limiteCredito;
}

//Getter específico para el atributo limiteCredito
public double getLimiteCredito() {
 return limiteCredito;
}
}