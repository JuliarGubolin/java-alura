
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

import factory.ConnectionFactory;

public class TestaInsercao {
    public static void main(String[] args) throws SQLException{
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection conn = connectionFactory.recuperaraConexao();

        Statement stm = conn.createStatement();
        //O retorno é true quando é um ResultSet
        stm.execute("INSERT INTO PRODUTO (nome, descricao) values ('mouse', 'mouse sem fio gamer')"
        , Statement.RETURN_GENERATED_KEYS);

        ResultSet rst = stm.getGeneratedKeys();

        while(rst.next()){
            Integer id = rst.getInt(1);
            System.out.println("O id criado foi:" + id);
        }

        conn.close();
    }
}
