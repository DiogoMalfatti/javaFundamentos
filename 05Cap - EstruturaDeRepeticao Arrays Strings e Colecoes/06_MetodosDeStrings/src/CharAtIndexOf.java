
public class CharAtIndexOf {

	public static void main(String[] args) {
		
		String descricao = new String("Ma�a Gala, a ma�a mais doce do mercado!");
		
		System.out.println(descricao.charAt(1));
		
		System.out.println(descricao.indexOf("G"));
		System.out.println(descricao.indexOf("Gala"));
		
		System.out.println(descricao.indexOf("a"));
		System.out.println(descricao.lastIndexOf("a"));
	}

}
