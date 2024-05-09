package walletInternacional;

public class RunInternacional {
	public static void RunInternacional(String[] args) {
		
        // Crear una cuenta nacional
		Nacional nacional = new Nacional("Jorge Enrique", 5000000.0);
        System.out.println("Titular: " + nacional.getTitular());
        System.out.println("Saldo CL: $" + nacional.getSaldo());
        System.out.println("Tiene Fondos! " + nacional.verificarFondos());

     // Crear una cuenta internacional
        Internacional internacional = new Internacional("Jorge Enrique", 5000000.0);
        System.out.println("Titular: " + internacional.getTitular());
        System.out.println("Saldo USD: $" + internacional.getSaldo());
        System.out.println("Tiene Fondos! " + internacional.verificarFondos());
    }
}