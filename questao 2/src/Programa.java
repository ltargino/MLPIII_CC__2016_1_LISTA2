public class Programa {
	public static void main(String[] args) {
		Autor autordefilmes = new Autor("Larissa");
		FitaInf fitaInf = new FitaInf("UM MALUCO NO PEDAÇO", 11, CategoriasFilmes.COMEDIA, autordefilmes);
		FitaLan fitaLan = new FitaLan("A BRANCA DE NEVE 2", 50, CategoriasFilmes.FICCAOCIENTIFICA, autordefilmes); 
		System.out.println(fitaInf);
		System.out.println(fitaLan);
	}
}
