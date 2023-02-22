
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import factory.ConnectionFactory;

public class TestaRemocao {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection conn = connectionFactory.recuperaraConexao();

        //PrepareStatement: evita SQL Injection
        PreparedStatement stm = conn.prepareStatement("DELETE FROM PRODUTO WHERE ID > ?");
        stm.setInt(1, 2);
        stm.execute();

        Integer linhasModificadas = stm.getUpdateCount();
        System.out.println(linhasModificadas);

        conn.close();
    }
}
