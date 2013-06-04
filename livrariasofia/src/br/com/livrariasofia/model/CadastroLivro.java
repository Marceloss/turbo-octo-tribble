package br.com.livrariasofia.model;
import java.util.*;
import br.com.livrariasofia.model.Livro;

public class CadastroLivro {

	private ArrayList<Livro> lista = null;
	
	public CadastroLivro(){
		lista = new ArrayList<Livro>();
	}
	
	public boolean addLivro(Livro livro)
	{
		return lista.add(livro);
	}		
	
	
	
}
