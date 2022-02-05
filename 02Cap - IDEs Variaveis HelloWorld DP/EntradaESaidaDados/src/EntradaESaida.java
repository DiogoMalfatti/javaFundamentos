
import java.util.Scanner;

public class EntradaESaida {

	public static void main(String[] args) {
		
		int idade = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome :");
		String nome = sc.next();
		
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		
		if (idade < 0)
			System.out.println("idade invalida");
		
		if (idade >= 18 && idade < 70) {
			System.out.println("maior idade");
		} else if (idade >= 70) {
			System.out.println("terceira idade");
			if (idade >= 100) {
				System.out.println("centenaria");
			}
		}else {
			System.out.println("menor idade");
		}

	}

}
