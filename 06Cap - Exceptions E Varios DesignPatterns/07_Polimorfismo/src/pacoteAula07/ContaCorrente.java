package pacoteAula07;

public class ContaCorrente {
	
	protected double saldo;
	
	// Abre aula08 - modificadores
	public static final int BANCO = 33;
	// Fecha aula08 - modificadores
	
	public void sacar(double valor) throws SaldoInsuficienteException {
		
		if (valor > saldo) {
			
			throw new SaldoInsuficienteException();
			
		}
		
		saldo = saldo - valor;
	}
	
	// Abre aula08 - modificadores
	public abstract double verificaSaldo();
	// Fecha aula08 - modificadores

}
