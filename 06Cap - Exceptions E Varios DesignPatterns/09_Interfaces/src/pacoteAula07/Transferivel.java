package pacoteAula07;

public interface Transferivel {
	
	public boolean realizarDoc(int nrBanco, int nrAgencia, int nrConta, double valor);
	
	public boolean realizarTed(int nrBanco, int nrAgencia, int nrConta, double valor);
	
	default boolean realizarTransferenciaInterna( int nrAgenciaDestion, 
			int nrContaDestino, double valor) {
		
		// regra de negocio
		
		return true;
	}

}
