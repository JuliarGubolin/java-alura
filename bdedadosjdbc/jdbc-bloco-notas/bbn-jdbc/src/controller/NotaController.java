package controller;

import java.sql.Connection;
import java.util.List;

import dao.NotaDAO;
import factory.ConnectionFactory;
import model.Nota;

public class NotaController {
    private NotaDAO notaDAO;

    public NotaController(){
        Connection connection = new ConnectionFactory().connect();
		this.notaDAO = new NotaDAO(connection);
    }

    public void deletar(Integer id) {
		this.notaDAO.deletar(id);
	}

	public void salvar(Nota nota) {
		this.notaDAO.salvar(nota);
	}

	public List<Nota> listar() {
		return this.notaDAO.listar();
	}

	public void alterar(String titulo, String descricao, Integer id) {
		this.notaDAO.alterar(titulo, descricao, id);
	}
}
