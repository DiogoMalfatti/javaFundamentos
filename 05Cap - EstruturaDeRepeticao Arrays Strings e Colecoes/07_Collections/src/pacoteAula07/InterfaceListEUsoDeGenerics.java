package pacoteAula07;

import java.util.ArrayList;
import java.util.List;

public class InterfaceListEUsoDeGenerics {

	public static void main(String[] args) {
		
		// interface list e uso de generics
		// generics não permite tipos primitivos
		
		List<String> carrinho = new ArrayList<String>();
		
		//System.out.println(carrinho.isEmpty());
		
		carrinho.add("Maça");
		carrinho.add("Morango");
		carrinho.add("Maça");
		//carrinho.set(1, "Pera");
		
		//System.out.println(carrinho.isEmpty());
		//System.out.println(carrinho.size());
		
		System.out.println(carrinho.contains("Maça"));
		System.out.println(carrinho.indexOf("Maça"));
		System.out.println(carrinho.get(carrinho.indexOf("Maça")));
		System.out.println(carrinho.lastIndexOf("Maça"));
		
		carrinho.remove(carrinho.indexOf("Maça"));
		System.out.println(carrinho.get(0));
		
		carrinho.clear();
		System.out.println(carrinho.isEmpty());

	}

}
