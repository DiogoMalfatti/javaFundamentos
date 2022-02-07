package pacoteAula02;

import java.io.Serializable;

// ABRE AULA
// FECHA AULA

public class Conta implements Serializable {
		
// ABRE AULA ATRIBUTOS
	
	//ABRE AULA JAVABEAN E ENCAPSULAMENTO
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int agencia;
	private int numero;
	private double saldo;
	
	//ABRE AULA JAVABEAN E ENCAPSULAMENTO
	
	Cliente cliente = new Cliente();
// FECHA AULA ATRIBUTOS
	
// ABRE AULA METODOS
	public double getSaldo() {
		return this.saldo; //Aula07
	}
	
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
		
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
		
	
// FECHA AULA CONSTRUTORES
		
// FECHA AULA METODOS	
	
// ABRE AULA SOBRECARGA DE MÉTODOS
	public void retirar(double valor) {
		saldo -= valor; //Aula07
	}
	
	public void retirar(double valor, double taxa) {
		saldo = saldo - valor - taxa;
	}
	
// FECHA AULA SOBRECARGA DE MÉTODOS
		
}
