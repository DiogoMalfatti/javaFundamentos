package pacoteAula03;

public class ExcecoesUnchecked {

	public static void main(String[] args) {
		
		// exce��es unchecked
		
		try {
			
			int val = 10/0;
			
			int[] valores = new int[3];
			System.out.println(valores[4]);
			
			String nome = null;
			System.out.println(nome.length());
			
			int numero = Integer.parseInt("zero");
			
		} catch (ArithmeticException e) {
			
			System.out.println("N�o � possivel realizar uma divis�o por zero!");
			
			// mensagem com a lista de erros
			System.out.println(e.getMessage());
			// imprime a pilha de erro da exce��o
			e.printStackTrace();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("N�o � possivel acessar a posi��o 4 do array!");
			
		} catch (NullPointerException e) {
			
			System.out.println("N�o foi possivel retornar o length, "
					+ "variavel nome n�o instanciada");
			
		} catch (NumberFormatException e) {
			
			System.out.println("N�o foi possivel realizar a convers�o!");
			
		} catch (Exception e) {
			
			System.out.println("Erro na execu��o do programa!");
			
		}
		
		/*
		finally {
		System.out.println("Sempre passara por aqui!");
		}
		*/

	}

}
