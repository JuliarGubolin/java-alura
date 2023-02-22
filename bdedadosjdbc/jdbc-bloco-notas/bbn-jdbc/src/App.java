import java.util.List;

import controller.AutorController;
import controller.NotaController;
import model.Autor;
import model.Nota;

public class App {

    public static void main(String[] args) {
        AutorController autorController = new AutorController();
        NotaController notaController = new NotaController();
        
        /*Autor autor = new Autor("Ana Maria Almeida", "ana.maria@hotmail.com");
        autorController.salvar(autor);*/

        Nota nota = new Nota("Lista de afazeres", "Tirar o lixo", 3);
        notaController.salvar(nota);

        List<Autor> listaAutores = autorController.listar();
        System.out.println(listaAutores);

        List<Nota> listaNotas = notaController.listar();
        System.out.println(listaNotas);
    }
}
