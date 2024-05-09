package walletInternacional;

class Nacional extends WalletInternacional{

	public Nacional(String titular, double saldo) {
	     super(titular, saldo);
	 }
	@Override
	 public boolean verificarFondos() {
	     return getSaldo() >= 0;
	 }
}
