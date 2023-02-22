package controller;

import java.sql.Connection;
import java.util.List;

import dao.AutorDAO;
import factory.ConnectionFactory;
import model.Autor;

public class AutorController {

    private AutorDAO autorDAO;

    public AutorController(){
        Connection connection = new ConnectionFactory().connect();
		this.autorDAO = new AutorDAO(connection);
    }

    public void deletar(Integer id) {
		this.autorDAO.deletar(id);
	}

	public void salvar(Autor autor) {
		this.autorDAO.salvar(autor);
	}

	public List<Autor> listar() {
		return this.autorDAO.listar();
	}

	public void alterar(String nome, String descricao, Integer id) {
		this.autorDAO.alterar(nome, descricao, id);
	}
    
}
