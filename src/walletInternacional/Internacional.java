package walletInternacional;

class Internacional extends WalletInternacional{

	public Internacional(String titular, double saldo) {
	     super(titular, saldo);
	 }
	
	@Override
	 public boolean verificarFondos() {
	     return getSaldo() >= 0;
	 }
}