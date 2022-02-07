package pacoteAula04;

public class ArrayMultiDimensional {

	public static void main(String[] args) {
		
		//10 corredores com trÊs partileiras cada
		
		Produto[][] localizacaoProduto = new Produto[10][3];
		
		Produto prod1 = new Produto();
		prod1.setNome("Limão");
		prod1.setDescricao("Galego");
		prod1.setValor(4);
		
		Produto prod2 = new Produto();
		prod2.setNome("Maça");
		prod2.setDescricao("Gala");
		prod2.setValor(5);
		
		localizacaoProduto[2][1] = prod1;
		localizacaoProduto[2][2] = prod2;
		
		System.out.println(localizacaoProduto[2][1].getNome());

	}

}
