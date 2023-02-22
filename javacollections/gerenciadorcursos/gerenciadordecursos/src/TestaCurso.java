import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        //Array: busca rápida mas inserir e deletar no começo/fim é lento. Mais vantajoso a linkedList
        Curso javaCurso = new Curso("Dominando coleções", "Paulo Silveira");

        //javaCurso.getAulas().add(new Aula("AAA", 21));
        javaCurso.adiciona(new Aula("AAA", 21));
        javaCurso.adiciona(new Aula("BBB", 13));

        //List<Aula> aulas = javaCurso.getAulas();
        List<Aula> aulasImutaveis = javaCurso.getAulas();

        System.out.println(javaCurso.getAulas());

        List<Aula> aulas2 = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas2);
        System.out.println(javaCurso);
        
    }
}
