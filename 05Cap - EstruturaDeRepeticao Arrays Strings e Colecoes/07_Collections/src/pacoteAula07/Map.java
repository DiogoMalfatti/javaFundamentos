package pacoteAula07;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		
		Map<String, String> caixa = new HashMap<String, String>();
		
		caixa.put("M2225", "Fernando");
		caixa.put("M2226", "Maria");
		caixa.put("M2227", "Soraya");
		
		System.out.println(caixa.isEmpty());
		System.out.println(caixa.size());
		System.out.println(caixa.containsKey("M2225"));
		System.out.println(caixa.containsValue("Fernando"));
		System.out.println(caixa);

	}

}
