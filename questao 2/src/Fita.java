public class Fita {
	private String titulo;
	private double preco;
	private CategoriasFilmes categoria;
	private Autor autor;
	
	public Fita(String titulo, double preco, CategoriasFilmes categoria, Autor autor) {
		this.titulo = titulo;
		this.preco = preco;
		this.categoria = categoria;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public CategoriasFilmes getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriasFilmes categoria) {
		this.categoria = categoria;
	}
	
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String toString() {
		return "Fita(titulo: " + titulo + ", preco: " + preco + ", categoria: " + categoria + ", autor: " + autor + ")";
	}
	
}