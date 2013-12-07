package br.com.caelum.livraria.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.caelum.livraria.dao.DAO;
import br.com.caelum.livraria.modelo.Livro;

@ManagedBean
@ViewScoped
public class pesquisarLivroBean {

	boolean renderiza = false;

	Livro livro = new Livro();

	public boolean isRenderiza() {
		return renderiza;
	}

	public void setRenderiza(boolean renderiza) {
		this.renderiza = renderiza;
	}

	public Livro getLivro() {
		System.out.println("executou o get");
		return livro;
	}

	public void pesquisar() {
		renderiza = true;
		return;
	}

	public List<Livro> getLivros() {
		return new DAO<Livro>(Livro.class).listaPorDescricao(livro);
	}

	public String navegar() {
		return "alteraLivro?faces-redirect=true";
	}
	
	public void apagarLivro(Livro livro){
		new DAO<Livro>(Livro.class).remove(livro);
		FacesContext.getCurrentInstance().addMessage("autor",
				new FacesMessage("Livro excluído com sucesso."));
	}


}
