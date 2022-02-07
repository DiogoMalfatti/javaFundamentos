import java.util.Arrays;

public class ReplaceSplit {

	public static void main(String[] args) {
		
		String descricao = new String("Maça Gala, a maça mais doce do mercado!");
		
		System.out.println(descricao.replace("G", "g"));
		System.out.println(descricao.replace("Gala", "Fuji"));
		System.out.println(descricao.replace("a", "A"));
		
		System.out.println(descricao.split("").length);
		System.out.println(Arrays.toString(descricao.split(" ")));

	}

}
