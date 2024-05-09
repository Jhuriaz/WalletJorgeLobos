package walletDigital;

public class RunWallet {
	 public static void main(String[] args) {
		 
	     // Crear una cuenta corriente
		 walletDigital walletDigital = new walletDigital("Jorge Enrique", 5000000.0, 5000000.0);
	     System.out.println("Titular: " + walletDigital.getTitular());
	     System.out.println("Saldo: $" + walletDigital.getSaldo());
	     System.out.println("Límite de crédito: $" + walletDigital.getLimiteCredito());
	 }
	}