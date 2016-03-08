public class FitaInf extends Fita{

	public FitaInf(String titulo, double preco, CategoriasFilmes categoria, Autor autor) {
		super(titulo, preco, categoria, autor);
	}

	public void setPreco(double p) {
		super.setPreco(p - ((p*40)/100));
	}

}