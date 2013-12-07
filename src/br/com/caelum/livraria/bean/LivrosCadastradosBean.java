package br.com.caelum.livraria.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import br.com.caelum.livraria.dao.DAO;
import br.com.caelum.livraria.modelo.Livro;

@ManagedBean
public class LivrosCadastradosBean {

	Livro livro = new Livro();

	public List<Livro> getLivros() {
		return new DAO<Livro>(Livro.class).listaTodos();
	}

}
