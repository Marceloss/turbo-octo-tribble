package br.com.livrariasofia.model;

public class Livro {

	private String titulo;
	private String autor;
	private String descricao;
	
	public Livro(String titulo, String autor, String descricao){
		this.autor = autor;
		this.titulo = titulo;
		this.descricao = descricao;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
