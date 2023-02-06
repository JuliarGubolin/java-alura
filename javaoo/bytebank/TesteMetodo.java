package javaoo.bytebank;

public class TesteMetodo {
    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.saldo = 100;
        conta.saldo = 400;
        conta.deposita(50);
        System.out.println(conta.saldo);
        boolean conseguiuSacar = conta.saca(40);
        System.out.println(conta.saldo);

        Conta contaMarcela = new Conta();
        contaMarcela.deposita(1200);
        contaMarcela.transfere(300, conta);
        System.out.println(contaMarcela.saldo);
        System.out.println(conta.saldo);
    }
}
