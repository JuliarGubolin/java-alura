
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
//import java.util.TreeSet;

public class Curso {
    
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
    //LinkedHashMap: guarda a ordem
    //HashTable: ThreadSafe
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
    //LinkedList: guarda a ordem adicionada
    //private Set<Aluno> alunos = new LinkedHashSet<>();
    //Guarda na ordem natural dos objetos (ordem do comparable)
    //private Set<Aluno> alunos = new TreeSet<>();

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }
    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }
    public String getNome() {
        return nome;
    }
    public String getInstrutor() {
        return instrutor;
    }
    public List<Aula> getAulas() {
        //Não deixa ordenar a lista
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public int getTempoTotal(){
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }
    @Override
    public String toString() {
        return "[Curso :" + nome +", tempo total: "+ this.getTempoTotal()+", " + this.aulas +"]";
    }
    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }
    public boolean estaMatriculado(Aluno a1) {
        return this.alunos.contains(a1);
    }
    public Aluno buscaMatriculado(int numero) {
        if(!matriculaParaAluno.containsKey(numero)){
            throw new NoSuchElementException();
        }
        return matriculaParaAluno.get(numero);
    }
}
