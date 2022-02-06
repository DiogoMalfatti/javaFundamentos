package pacoteAula02;
// ABRE AULA
// FECHA AULA

/**
 * Classe que abstrai uma conta bancaria
 * @author dimal Diogo Malfatti
 * @version 1.0
 */

public class Conta {
		
// ABRE AULA ATRIBUTOS
	int agencia; // Aula08 private/protected
	int numero;
	double saldo; // friendly ou package
	
	Cliente cliente = new Cliente();
// FECHA AULA ATRIBUTOS
	
// ABRE AULA METODOS
	
	/**
	 * Verifica o saldo da conta
	 * @return valor do saldo da conta
	 */
	
	public double recuperarSaldo() {
		return this.saldo; //Aula07
	}
	
	/**
	 * Acrescenta valor ao saldo da conta
	 * @param valor que sera depositado
	 */
	
	public void depositar(double valor) {
		this.saldo += valor; //Aula07
	}
	
// ABRE AULA CONSTRUTORES
	public Conta() { //construtor padrão
		
	}
	
	//public Conta(int numero) {
		//this.numero = numero;
		//this.saldo = 0;
	//}
	
	public Conta(int agencia, int numero, double saldo) { //construtor de classe
		this.agencia = agencia;
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
	
	/**
	 * Retira um valor do saldo da conta
	 * @param valor
	 * @see depositar
	 */
	
	public void retirar(double valor) {
		saldo -= valor; //Aula07
	}
	
	public void retirar(double valor, double taxa) {
		saldo = saldo - valor - taxa;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
// FECHA AULA SOBRECARGA DE MÉTODOS
		
}
