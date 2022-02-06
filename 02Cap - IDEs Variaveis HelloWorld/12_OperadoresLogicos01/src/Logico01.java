
public class Logico01 {

	public static void main(String[] args) {
		
		int idade = 20;
		boolean precisaVotar = idade >= 18 && idade < 70;
		System.out.println(precisaVotar);
		
		int nrAmarelo = 2, nrVermelho = 1;
		boolean suspenso = nrAmarelo == 2 || nrVermelho == 1;
		System.out.println(suspenso);

	}

}
