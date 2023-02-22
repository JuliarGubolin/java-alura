

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.CategoriaDAO;
import factory.ConnectionFactory;
import modelo.Categoria;
import modelo.Produto;

public class TestaListagemCategorias {
    public static void main(String[] args) throws SQLException {

        try(Connection connectionFactory = new ConnectionFactory().recuperaraConexao()){
            CategoriaDAO categoriaDAO = new CategoriaDAO(connectionFactory);
            List<Categoria> categorias = categoriaDAO.listar();
            categorias.stream().forEach(ct -> {
				System.out.println(ct.getNome());
				for(Produto produto : ct.getProdutos()) {
					System.out.println(ct.getNome() + " - " + produto.getNome());
				}
			});
        }

    }
}
