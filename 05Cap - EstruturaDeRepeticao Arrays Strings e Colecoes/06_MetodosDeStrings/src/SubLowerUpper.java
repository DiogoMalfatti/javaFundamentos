
public class SubLowerUpper {

	public static void main(String[] args) {
		
		String descricao = new String("Ma�a Gala, a ma�a mais doce do mercado!");
		
		System.out.println(descricao.toLowerCase());
		System.out.println(descricao.toUpperCase());
		
		System.out.println(descricao.substring(0,4));
		System.out.println(descricao.substring(4));
		
		System.out.println(descricao.substring(
				descricao.indexOf("Ma�a"),
				descricao.indexOf("")));
		
		System.out.println(descricao);

	}

}
