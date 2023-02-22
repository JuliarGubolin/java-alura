package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Nota;

public class NotaDAO {
    
    private Connection connection;

    public NotaDAO(Connection connection){
        this.connection = connection;
    }

    public void salvar(Nota nota){
        try {
            String sqlComand = "INSERT INTO NOTA (TITULO, DESCRICAO, AUTOR_ID) VALUES (?, ?, ?)";

            try(PreparedStatement pstm = connection.prepareStatement(sqlComand, Statement.RETURN_GENERATED_KEYS)){

                pstm.setString(1, nota.getTitulo());
				pstm.setString(2, nota.getDescricao());
                pstm.setInt(3, nota.getAutorId());

                pstm.execute();

                try (ResultSet rst = pstm.getGeneratedKeys()) {
					while (rst.next()) {
						nota.setId(rst.getInt(1));
					}
				}
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void alterar(String titulo, String descricao, Integer id){
        try (PreparedStatement stm = connection
				.prepareStatement("UPDATE NOTA P SET P.TITULO = ?, P.DESCRICAO = ? WHERE ID = ?")) {
			stm.setString(1, titulo);
			stm.setString(2, descricao);
			stm.setInt(3, id);
			stm.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }

    public List<Nota> listar(){
        List<Nota> notas = new ArrayList<Nota>();
		try {

			String sql = "SELECT TITULO, DESCRICAO, AUTOR_ID FROM NOTA";

			try (PreparedStatement pstm = connection.prepareStatement(sql)) {
				pstm.execute();

                try (ResultSet rst = pstm.getResultSet()) {
					while (rst.next()) {
						Nota nota = new Nota(rst.getString(1), rst.getString(2), rst.getInt(3));

						notas.add(nota);
					}
				}
			}
			return notas;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }

    public void deletar(Integer id){
        try (PreparedStatement stm = connection.prepareStatement("DELETE FROM NOTA WHERE ID = ?")) {
			stm.setInt(1, id);
			stm.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
}
