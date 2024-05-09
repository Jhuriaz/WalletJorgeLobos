package walletDigital;

public class Wallet {

	private String titular;
    private double saldo;

    // Constructor
    public Wallet(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Getter para el atributo titular
    public String getTitular() {
        return titular;
    }

    // Getter para el atributo saldo
    public double getSaldo() {
        return saldo;
    }
    
    
}