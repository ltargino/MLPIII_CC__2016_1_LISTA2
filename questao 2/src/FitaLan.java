public class FitaLan extends Fita{
	
	public FitaLan(String titulo, double preco, CategoriasFilmes categoria, Autor autor) {
		super(titulo, preco, categoria, autor);
	}

	public void setPreco(double p) {
		super.setPreco(p + ((p*20)/100));
	}

}