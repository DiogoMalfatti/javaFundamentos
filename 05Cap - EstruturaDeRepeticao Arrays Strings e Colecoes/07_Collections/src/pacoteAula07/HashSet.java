package pacoteAula07;

import java.util.Set;

public class HashSet {

	public static void main(String[] args) {
		
		Set<String> cesta = new HashSet<String>();
		
		System.out.println(cesta.isEmpty());
		cesta.add("Ma�a");
		cesta.add("Ma�a");
		cesta.add("ma�a");
		System.out.println(cesta.isEmpty());
		
		System.out.println(cesta.size());
		System.out.println(cesta);

	}

}
