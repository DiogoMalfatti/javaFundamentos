package pacoteAula07;

import java.util.ArrayList;
import java.util.List;

public class InterfaceListEUsoDeGenerics {

	public static void main(String[] args) {
		
		// interface list e uso de generics
		// generics n�o permite tipos primitivos
		
		List<String> carrinho = new ArrayList<String>();
		
		//System.out.println(carrinho.isEmpty());
		
		carrinho.add("Ma�a");
		carrinho.add("Morango");
		carrinho.add("Ma�a");
		//carrinho.set(1, "Pera");
		
		//System.out.println(carrinho.isEmpty());
		//System.out.println(carrinho.size());
		
		System.out.println(carrinho.contains("Ma�a"));
		System.out.println(carrinho.indexOf("Ma�a"));
		System.out.println(carrinho.get(carrinho.indexOf("Ma�a")));
		System.out.println(carrinho.lastIndexOf("Ma�a"));
		
		carrinho.remove(carrinho.indexOf("Ma�a"));
		System.out.println(carrinho.get(0));
		
		carrinho.clear();
		System.out.println(carrinho.isEmpty());

	}

}
