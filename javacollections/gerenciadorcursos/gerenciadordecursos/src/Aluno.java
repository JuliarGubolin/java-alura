public class Aluno {
    
    private String nome;
    private int numeroMatricula;

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public Aluno(String nome, int numeroMatricula) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", numeroMatricula=" + numeroMatricula + "]";
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }

    //Se reescrevo o equals, preciso reescrever o hashcode
    @Override
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;
        return this.nome.equals(outro.nome);
    }
}
