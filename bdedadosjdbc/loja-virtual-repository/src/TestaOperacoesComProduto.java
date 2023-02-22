import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.ProdutoDAO;
import factory.ConnectionFactory;
import modelo.Produto;

public class TestaOperacoesComProduto {
    public static void main(String[] args) throws SQLException {
        //Produto comoda = new Produto("Comoda", "Comoda marrom grande");

        try (Connection connection = new ConnectionFactory().recuperaraConexao()){
            ProdutoDAO persistenciaProduto = new ProdutoDAO(connection);
            //persistenciaProduto.salvar(comoda);
            List<Produto> lista = persistenciaProduto.listar();
            lista.stream().forEach(p -> System.out.println(p));
        }
    }
}
