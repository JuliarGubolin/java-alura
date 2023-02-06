package javaoo.bytebank.bytebankcomposto;

public class TesteContaSemCliente {
    public static void main(String[] args) {
        Conta conta = new Conta();
        System.out.println(conta.getSaldo());

        //ERRO: NullPointerException
        //conta.titular.nome = "julia";
        //System.out.println(conta.titular.nome);

        Cliente cliente = new Cliente();
        cliente.setNome("Ana Maria");
        conta.setTitular(cliente);
        System.out.println(conta.getTitular().getNome());
    }  
}
