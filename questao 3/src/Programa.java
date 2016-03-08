public class Programa {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Larissa Targino", 20);
		Pessoa pessoa2 = new Pessoa("Janaina Targino", 50);
		VeiculoCarga veiculo1 = new VeiculoCarga("OEW2671", "Volkswagen", "Gol", 2005, 70, 100, 1000, 0, "0ASDO01DMS0ADN1N2E012N321", pessoa1);
		VeiculoPasseio veiculo2 = new VeiculoPasseio("MPE9201", "Chevrolet", "Onix", 2016, 200, 300, 12000, 0, "WD89FN38RN2FDNWS1DW1W1", pessoa2);
		
		System.out.println(veiculo1);
		System.out.println(veiculo2);
	}
}