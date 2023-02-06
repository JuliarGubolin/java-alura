package javaoo.bytebank.bytebankcomposto;

public class TesteBanco {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.setProfissao("programador");
        paulo.setCpf("12345678910");
        paulo.setNome("Paulo");

        Conta conta  = new Conta();
        conta.deposita(300);
        //conta.titular = paulo;
        //System.out.println(conta.titular.nome);

    }
}
