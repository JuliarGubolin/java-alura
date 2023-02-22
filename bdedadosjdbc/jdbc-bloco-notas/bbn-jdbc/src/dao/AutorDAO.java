package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Autor;

public class AutorDAO {
    
    private Connection connection;

    public AutorDAO(Connection connection){
        this.connection = connection;
    }

    public void salvar(Autor autor){
        try {
            String sqlComand = "INSERT INTO AUTOR (NOME, EMAIL) VALUES (?, ?)";

            try(PreparedStatement pstm = connection.prepareStatement(sqlComand, Statement.RETURN_GENERATED_KEYS)){

                pstm.setString(1, autor.getNome());
				pstm.setString(2, autor.getEmail());

                pstm.execute();

                try (ResultSet rst = pstm.getGeneratedKeys()) {
					while (rst.next()) {
						autor.setId(rst.getInt(1));
					}
				}
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void alterar(String nome, String email, Integer id){
        try (PreparedStatement stm = connection
				.prepareStatement("UPDATE AUTOR A SET A.NOME = ?, A.DESCRICAO = ? WHERE ID = ?")) {
			stm.setString(1, nome);
			stm.setString(2, email);
			stm.setInt(3, id);
			stm.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }

    public List<Autor> listar(){
        List<Autor> autores = new ArrayList<Autor>();
		try {

			String sql = "SELECT ID, NOME, EMAIL FROM AUTOR";

			try (PreparedStatement pstm = connection.prepareStatement(sql)) {
				pstm.execute();

                try (ResultSet rst = pstm.getResultSet()) {
					while (rst.next()) {
						Autor autor = new Autor(rst.getInt(1), rst.getString(2), rst.getString(3));

						autores.add(autor);
					}
				}
			}
			return autores;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }

    public void deletar(Integer id){
        try (PreparedStatement stm = connection.prepareStatement("DELETE FROM AUTOR WHERE ID = ?")) {
			stm.setInt(1, id);
			stm.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
}
