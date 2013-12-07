package br.com.caelum.livraria.teste;

import java.util.List;

import br.com.caelum.livraria.dao.DAO;
import br.com.caelum.livraria.modelo.Autor;
import br.com.caelum.livraria.modelo.Livro;

public class TesteBuscaDescricao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro livro = new Livro();
		livro.setTitulo("use");
		

		List<Livro> livros = new DAO<Livro>(Livro.class)
				.listaTodos();
		
		

		//for (Livro l : livros) {
			//System.out.println("\nTitulo ..: " + l.getId()+ " " +l.getTitulo());
			// System.out.println("Valor ......: R$ " + );
		//}
		
		Livro livroComAutores = new DAO<Livro>(Livro.class).buscaLivroComAutores(28);
		
		for (Autor a : livroComAutores.getAutores()){
			System.out.println("Autor: " + a.getNome());
		}

	}

	// public List<Livro> getLivros() {
	// return
	// }

}
