package model;

public class Autor {
    
    private Integer id;
    private String nome;
    private String email;
    
    public Autor(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Autor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Autor [id=" + id + ", nome=" + nome + ", email=" + email + "]";
    }
    
}
