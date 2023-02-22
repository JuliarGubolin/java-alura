
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import factory.ConnectionFactory;

public class TestaInsercaoComParametro {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection conn = connectionFactory.recuperaraConexao();
        conn.setAutoCommit(false);

        //Usuário pode inserir "Mouse sem fio); delete from Produto" para prejudicar o projeto
        //String nome = "julia", descricao = "pessoa";
        //String sql = "INSERT INTO PRODUTO (nome, descricao) values ('"+nome+"', '"+descricao+"')";
        //System.out.println(sql);

        try (
            PreparedStatement stm = 
                conn.prepareStatement("INSERT INTO PRODUTO (nome, descricao) values (?, ?)", Statement.RETURN_GENERATED_KEYS);
            ){

            adicionarVariavel("SmartTV", "45 polegadas", stm);
            adicionarVariavel("Radio", "Radio Gamer", stm);

            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            conn.rollback();
        }
    }

    private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
        stm.setString(1, nome);
        stm.setString(2, descricao);

        //O retorno é true quando é um ResultSet
        stm.execute();

        //O try ajuda a não precisar explicitar os fechamentos como stm.close() ou rst.close()
        try(ResultSet rst = stm.getGeneratedKeys()){
            while(rst.next()){
                Integer id = rst.getInt(1);
                System.out.println("O id criado foi:" + id);
            }
        }
    }
}
