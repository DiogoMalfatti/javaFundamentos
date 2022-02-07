package pacoteAula02;
// ABRE AULA
// FECHA AULA

public class TesteConta {

	public static void main(String[] args) {
		
	// ABRE AULA CLASSE
		//Conta contaCorrente = new Conta();
		//Conta contaPoupanca = new Conta();
		//Conta contaInvestimento = new Conta();
	// FECHA AULA CLASSE
		
	// ABRE AULA CONSTRUTORES
		
		// ABRE AULA 07
		
		//ABRE AULA JAVABEAN E ENCAPSULAMENTO
		
		/*
		Conta cc = new Conta();
		cc.depositar(50.0);
		cc.setAgencia(123);
		cc.setNumero(321);
		*/
		
		//FECHA AULA JAVABEAN E ENCAPSULAMENTO
		
		//ABRE AULA HERANÇA HANDS ON
		
		ContaCorrente cc = new ContaCorrente();
		cc.setAgencia(1111);
		cc.setNumero(2222);
		cc.setTipo("PF");
		cc.setChequeEspecial(1000);
		
		//FECHA AULA HERANÇA HANDS ON
		
		cc.depositar(1000);
		System.out.println("aula07-cc : " + cc.getSaldo());
		
		Conta poupanca = new Conta(111, 222, 1000);
		poupanca.retirar(50.0);
		System.out.println("aula07-poupanca : " + poupanca.getSaldo());
		// FECHA AULA 07
		
	// FECHA AULA CONSTRUTORES
		
	// ABRE AULA ATRIBUTOS
		
		/*
		contaCorrente.numero = 11;
		contaCorrente.saldo = 20.5;
		contaCorrente.cliente.nome = "Diogueira";
		contaCorrente.cliente.idade = 39;
		
		contaPoupanca.numero = 22;
		contaPoupanca.saldo = 30;
		contaPoupanca.cliente.nome = "Fulano";
		contaPoupanca.cliente.idade = 40;
		
		contaInvestimento.numero = 33;
		contaInvestimento.saldo = 40;
		contaInvestimento.cliente.nome = "Ciclano";
		contaInvestimento.cliente.idade = 40;
		*/
		
		//System.out.println(contaCorrente.numero);
		//System.out.println(contaCorrente.saldo);
		//System.out.println(contaCorrente.cliente.nome);
		//System.out.println(contaCorrente.cliente.idade);
	// FECHA AULA ATRIBUTOS

	}

}
