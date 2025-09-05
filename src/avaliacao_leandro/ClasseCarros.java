package avaliacao_leandro;

public class ClasseCarros extends ClasseAutomotores {
	int quantidadePortasAt;
	
	public ClasseCarros(String corPar, String tipoPar, String modeloPar, String marcaPar, int quantidadePortasPar) {
		
		super(corPar, tipoPar, marcaPar, modeloPar );
		
		this.quantidadePortasAt = quantidadePortasPar;
		
	}
	public int pegarQuantidadePortasAt() {
		return quantidadePortasAt;
	}
	
	public void alterarQuantidadePortas(int quantidadePortasPar) {
		this.quantidadePortasAt = quantidadePortasPar;
	}

}
