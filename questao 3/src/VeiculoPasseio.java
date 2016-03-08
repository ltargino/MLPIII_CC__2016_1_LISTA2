public class VeiculoPasseio extends Veiculo{
	private boolean possuiAr;
	private int quantidadePortas;
	
	public VeiculoPasseio(String placa, String marca, String modelo, int ano, int valorKmRodado, int kmInicial, int kmFinal, double valorLocacao, String chassi, Pessoa proprietario) {
		super(placa, marca, modelo, ano, valorKmRodado, kmInicial, kmFinal, valorLocacao, chassi, proprietario);
	}
	
	public boolean isPossuiAr() {
		return possuiAr;
	}

	public void setPossuiAr(boolean possuiAr) {
		this.possuiAr = possuiAr;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	public String toString() {
		return "VeiculoDePasseio(" + super.toString() + ", possuiAr: " + possuiAr + ", quantidadePortas: " + quantidadePortas + ")";
	}
	
}