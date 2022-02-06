package pacoteAula02;

//ABRE AULA JAVABEAN E ENCAPSULAMENTO

import java.io.Serializable;

public class Pessoa implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
// FECHA AULA JAVABEAN E ENCAPSULAMENTO
	
}
