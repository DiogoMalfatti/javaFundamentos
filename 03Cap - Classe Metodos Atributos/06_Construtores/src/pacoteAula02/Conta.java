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
	
// ABRE AULA CONSTRUTORES
	public Conta() {
		
	}
	
	//public Conta(int numero) {
		//this.numero = numero;
		//this.saldo = 0;
	//}
	
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
		
	public void setNumero(int numero) {
		this.numero = numero;
	}
		
	public int getNumero() {
		return numero;
	}
// FECHA AULA CONSTRUTORES
		
// FECHA AULA METODOS	
	
// ABRE AULA SOBRECARGA DE MÉTODOS
	public void retirar(double valor) {
		saldo = saldo - valor;
	}
	
	public void retirar(double valor, double taxa) {
		saldo = saldo - valor - taxa;
	}
	
	int agencia;
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
// FECHA AULA SOBRECARGA DE MÉTODOS
		
}
