package javaejavalang.br.com.bytebank.banco.models;

/**
 * 
 * @author Julia Gubolin 
 * @throws
 * @param
*/

public class Cliente {

    private String nome;
    private String cpf;
    private String profissao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    
    /** 
     * @param profissao
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}
