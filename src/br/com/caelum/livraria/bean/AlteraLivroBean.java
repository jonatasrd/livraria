package br.com.caelum.livraria.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.caelum.livraria.dao.DAO;
import br.com.caelum.livraria.modelo.Autor;
import br.com.caelum.livraria.modelo.Livro;

@ManagedBean
@SessionScoped
public class AlteraLivroBean {

	Livro livro = new Livro();

	private Integer autorId;

	public void setAutorId(Integer autorId) {
		this.autorId = autorId;
	}

	public Integer getAutorId() {
		return autorId;
	}

	public Livro getLivro() {
		if (livro != null) {
			return new DAO<Livro>(Livro.class).buscaLivroComAutores(livro.getId());
		}
		return livro;
	}
	
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	public List<Autor> getAutoresDoLivro() {
		return this.livro.getAutores();
	}

	public void alterarLivro() {
		new DAO<Livro>(Livro.class).atualiza(livro);
		FacesContext.getCurrentInstance().addMessage("autor",
				new FacesMessage("Livro alterado com sucesso."));

	}
	
	public String formAutor() {
		return "autor?faces-redirect=true";
	}
	
	public List<Autor> getAutores() {
		return new DAO<Autor>(Autor.class).listaTodos();
	}
	


}
