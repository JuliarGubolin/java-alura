public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {
        Curso javaCurso = new Curso("Dominando coleções", "Paulo Silveira");

        //javaCurso.getAulas().add(new Aula("AAA", 21));
        javaCurso.adiciona(new Aula("AAA", 21));
        javaCurso.adiciona(new Aula("BBB", 13));

        Aluno a1 = new Aluno("Julia", 5617);
        Aluno a2 = new Aluno("Julia2", 1323);
        Aluno a3 = new Aluno("Julia3", 1323);

        javaCurso.matricula(a1);
        javaCurso.matricula(a2);
        javaCurso.matricula(a3);

        javaCurso.estaMatriculado(a1);

        System.out.println("Quem é o aluno com matrícula 5617");
        Aluno buscaMatriculado = javaCurso.buscaMatriculado(5617);
        System.out.println(buscaMatriculado);
    }
}
