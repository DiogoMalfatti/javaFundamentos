package pacoteAula04;

public class Caixa {

	public static void main(String[] args) {
		
		Produto produtos[] = new Produto[2];
		
		Produto prod1 = new Produto();
		prod1.setNome("Lim�o");
		prod1.setDescricao("Galego");
		prod1.setValor(4);
		
		Produto prod2 = new Produto();
		prod2.setNome("Ma�a");
		prod2.setDescricao("Gala");
		prod2.setValor(5);
		
		produtos[0] = prod1;
		produtos[1] = prod2;
		
		/*
		for (int i=0; i < produtos.length; i++) {
			System.out.println(produtos[i].toString());
		}
		*/
		
		//ForEach
		
		for(Produto prod:produtos) {
			System.out.println(prod.toString());
		}

	}

}
