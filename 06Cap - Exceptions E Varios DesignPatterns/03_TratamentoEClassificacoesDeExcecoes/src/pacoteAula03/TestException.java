package pacoteAula03;

public class TestException {

	public static void main(String[] args) throws DivisaoPorZeroException {
		
		try {
			
			//trecho onde a exce��o pode ocorrer
			int val = 10 / 0;
			System.out.println(val);
			
		} catch (Exception e) { //captura da exce��o
			
			//tratamento da exce��o
			e.printStackTrace();
			
		}

	}

}
