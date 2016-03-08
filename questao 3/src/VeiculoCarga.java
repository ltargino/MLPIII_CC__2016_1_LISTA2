public class VeiculoCarga extends Veiculo{
	private double capacidadeCarga;
	
	public VeiculoCarga(String placa, String marca, String modelo, int ano, int valorKmRodado, int kmInicial, int kmFinal, double valorLocacao, String chassi, Pessoa proprietario) {
		super(placa, marca, modelo, ano, valorKmRodado, kmInicial, kmFinal, valorLocacao, chassi, proprietario);
	}
	
	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public String toString() {
		return "VeiculoDeCarga(" + super.toString() + ", capacidadeCarga: " + capacidadeCarga + ")";
	}

}