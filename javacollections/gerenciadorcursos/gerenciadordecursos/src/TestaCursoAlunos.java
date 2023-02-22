import java.util.Iterator;
import java.util.Set;
//import java.util.Vector;

public class TestaCursoAlunos {
    public static void main(String[] args) {

        //Set: não tem garantia da ordem dos objetos
        //Vantagem: não aceita elementos repetidos; velocidadde e performance; velocidade maior em buscas (gfaz poucas comparações)
        Curso javaCurso = new Curso("Dominando coleções", "Paulo Silveira");

        //javaCurso.getAulas().add(new Aula("AAA", 21));
        javaCurso.adiciona(new Aula("AAA", 21));
        javaCurso.adiciona(new Aula("BBB", 13));

        Aluno a1 = new Aluno("Julia", 123);
        Aluno a2 = new Aluno("Julia2", 1323);
        Aluno a3 = new Aluno("Julia3", 1323);

        javaCurso.matricula(a1);
        javaCurso.matricula(a2);
        javaCurso.matricula(a3);
        javaCurso.getAlunos().forEach(a -> {System.out.println(a);});

        System.out.println("O aluno esta matriculado?: " + javaCurso.estaMatriculado(a1));

        //Se dois objetos são iguais eles precisam ter o MESMO hashcode

        // ----- Já obsoletos -----
        //Iterator: antes do JAVA 5
        Set<Aluno> alunos = javaCurso.getAlunos();
        Iterator<Aluno> iterator = alunos.iterator();
        while(iterator.hasNext()){
            Aluno aluno = iterator.next();
            System.out.println(aluno);
        }

        //ThreadSafe
        //Vector<Aluno> vector = new Vector<>();
    }
}
