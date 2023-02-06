package javaoo.bytebank.bytebankcomposto;

public class TesteValores {
    public static void main(String[] args) { 
        Conta conta = new Conta();
        conta.setAgencia(-50);
        conta.setNumero(-330);
        System.out.println(conta.getAgencia());

        Cliente cliente = new Cliente();
        Conta conta2 = new Conta(300, 1, 5, cliente);
        Conta conta3 = new Conta(300, 1, 5, cliente);
        System.out.println(conta2.getSaldo());
    }
}
