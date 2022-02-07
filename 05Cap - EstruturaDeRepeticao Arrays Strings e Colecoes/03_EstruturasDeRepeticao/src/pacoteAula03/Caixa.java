package pacoteAula03;

public class Caixa {

	public static void main(String[] args) {
		
		int qtdProdutos = 5;
		//int registro = 0;
		
		/*
		while (registro < qtdProdutos) {
			registro++;
			System.out.println("O produto número " + registro + " foi registrado");
		}
		*/
		
		/*
		do {
			registro++;
			System.out.println("O caixa registrou o produto " + registro);
		}while (registro < qtdProdutos);
		*/
		
		for (int i = 0; i < qtdProdutos; i++) {
			System.out.println("O caixa registrou o produto " + i);
		}
		
	}

}
