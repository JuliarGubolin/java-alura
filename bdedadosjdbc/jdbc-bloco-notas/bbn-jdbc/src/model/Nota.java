package model;

public class Nota {
    
    private Integer id;
    private String titulo;
    private String descricao;
    private int autorId;
    
    public Nota(String titulo, String descricao, int autor) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.autorId = autor;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAutorId() {
        return autorId;
    }
    public void setAutor(int autor) {
        this.autorId = autor;
    }
    @Override
    public String toString() {
        return "Nota [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", autorId=" + autorId + "]";
    }
}
