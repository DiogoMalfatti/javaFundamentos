
public class Comparacao {

	public static void main(String[] args) {
		
		String nome = new String("maça");
		String nome2 = new String("Maça");
		String nome3 = new String("maça");
		
		System.out.println(nome.equals(nome2)); //false
		
		System.out.println(nome.equalsIgnoreCase(nome2)); //true
		
		System.out.println(nome.equals(nome3)); //true
		
		boolean teste = (nome == nome3);
		System.out.println(teste); //false
		
		String nome4 = "maça";
		String nome5 = "maça";
		
		teste = (nome4 == nome5);
		System.out.println(teste); //true
		
		

	}

}
