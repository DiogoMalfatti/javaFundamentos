package pacoteAula05;

public class Strings {

	public static void main(String[] args) {
		
		/*
		String nome;
		nome = new String();
		nome = "Ma�a";
		System.out.println(nome);
		
		String nome2 = new String("Ma�a");
		System.out.println(nome2);
		
		String nome3 = "Ma�a";
		System.out.println(nome3);
		*/
		
		// caracteres especiais, quebra de linha, Escapes
		
		/*
		String descricao = "Tipo Gala \nA ma�a mais doce do mercado";
		System.out.println(descricao);
		
		descricao = "Tipo Gala \tA ma�a mais doce do mercado";
		System.out.println(descricao);
		
		descricao = "Tipo Gala: \"A ma�a mais doce do mercado\"";
		System.out.println(descricao);
		*/
		
		// concatena��o
		
		String nome = new String("ma�a");
		String descricao = new String();
		descricao = "tipo gala, a ma�a mais doce do mercado";
		
		String propaganda = nome + " " + descricao;
		System.out.println(propaganda);
		
		propaganda = nome.concat(" ").concat(descricao);
		System.out.println(propaganda);
		
		propaganda += "!";
		System.out.println(propaganda);

	}

}
