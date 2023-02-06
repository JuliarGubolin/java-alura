package javaexcecoes.conexao;

public class TesteConexao{
    public static void main(String[] args) {
        
        try (Conexao conn = new Conexao()) {
            conn.leDados();
        //Neste caso o catch é opcional
        } catch (IllegalStateException ex) {
            System.out.println("Erro");
        }

        //---------------Método antigo-------------------
        /*Conexao con = null;
        try {
            con = new Conexao();
            con.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Erro na conexão");
        //Finally: sempre será executado
        }finally{
            System.out.println("Finally");
            if(con != null){
                con.close();
            }
            
        }*/
    }
}
