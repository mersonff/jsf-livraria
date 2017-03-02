package br.com.emerson.livraria.bean;

import javax.faces.bean.ManagedBean;

import br.com.emerson.livraria.dao.DAO;
import br.com.emerson.livraria.modelo.Autor;

@ManagedBean
public class AutorBean {

	private Autor autor = new Autor();

	public Autor getLivro() {
		return autor;
	}

	public void setLivro(Autor livro) {
		this.autor = livro;
	}

	public void gravar() {
		System.out.println("Gravando livro " + this.autor.getNome());
		
		new DAO<Autor>(Autor.class).adiciona(this.autor);
		
		this.autor = new Autor();
	}

}
