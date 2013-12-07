package br.com.caelum.livraria.teste;

import java.util.List;

import br.com.caelum.livraria.dao.DAO;
import br.com.caelum.livraria.modelo.Autor;
import br.com.caelum.livraria.modelo.Livro;

public class TesteCarregaDados {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Livro livro = new Livro();
		//livro = new DAO<Livro>(Livro.class).buscaPorId(26);
		
		
		
		List<Autor> autores = livro.getAutores();

		for (Autor autor : autores) {
			System.out.println("\nTitulo ..: " + autor.getNome());
		}
	}

}
