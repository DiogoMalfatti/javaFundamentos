package pacoteAula05;

public class Strings {

	public static void main(String[] args) {
		
		/*
		String nome;
		nome = new String();
		nome = "Maça";
		System.out.println(nome);
		
		String nome2 = new String("Maça");
		System.out.println(nome2);
		
		String nome3 = "Maça";
		System.out.println(nome3);
		*/
		
		// caracteres especiais, quebra de linha, Escapes
		
		/*
		String descricao = "Tipo Gala \nA maça mais doce do mercado";
		System.out.println(descricao);
		
		descricao = "Tipo Gala \tA maça mais doce do mercado";
		System.out.println(descricao);
		
		descricao = "Tipo Gala: \"A maça mais doce do mercado\"";
		System.out.println(descricao);
		*/
		
		// concatenação
		
		String nome = new String("maça");
		String descricao = new String();
		descricao = "tipo gala, a maça mais doce do mercado";
		
		String propaganda = nome + " " + descricao;
		System.out.println(propaganda);
		
		propaganda = nome.concat(" ").concat(descricao);
		System.out.println(propaganda);
		
		propaganda += "!";
		System.out.println(propaganda);

	}

}
