package pacoteAula02;
// ABRE AULA
// FECHA AULA

public class Conta {
		
// ABRE AULA ATRIBUTOS
	int numero;
	double saldo;
	
	Cliente cliente = new Cliente();
// FECHA AULA ATRIBUTOS
	
// ABRE AULA METODOS
	public double recuperarSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
// FECHA AULA METODOS
		
}
