package pacoteAula02;
// ABRE AULA
// FECHA AULA

public class TesteConta {

	public static void main(String[] args) {
		
	// ABRE AULA CLASSE
		Conta contaCorrente = new Conta();
		Conta contaPoupanca = new Conta();
		Conta contaInvestimento = new Conta();
	// FECHA AULA CLASSE
		
	// ABRE AULA CONSTRUTORES
		Conta cc = new Conta(1000, 50.0);
		
		System.out.println(cc.recuperarSaldo());
	// FECHA AULA CONSTRUTORES
		
	// ABRE AULA ATRIBUTOS
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
		
		System.out.println(contaCorrente.numero);
		System.out.println(contaCorrente.saldo);
		System.out.println(contaCorrente.cliente.nome);
		System.out.println(contaCorrente.cliente.idade);
	// FECHA AULA ATRIBUTOS

	}

}
