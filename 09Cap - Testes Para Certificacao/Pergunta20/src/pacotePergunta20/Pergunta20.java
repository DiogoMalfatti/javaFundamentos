package pacotePergunta20;

public class Pergunta20 {

	public static void main(String[] args) {
		
		String[]vetor = new String[] {"java", "html", "javascript"};
		
		String java = new String("java");
		String html = new String("HTML");
		String javascript = new String("Java");
		
		System.out.println(vetor[0]==java);
		System.out.println(""+vetor[1].equalsIgnoreCase(html)+"");
		System.out.println(vetor[2].startsWith(javascript));

	}

}
