
import java.sql.SQLException;

import factory.ConnectionFactory;


public class TestaPollDeConexoes {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();

        for (int i = 0; i < 20; i++) {
            connectionFactory.recuperaraConexao();
            System.out.println("Conexão de número: "+ i);
        }
    }
}
