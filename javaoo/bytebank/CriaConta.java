package javaoo.bytebank;

public class CriaConta {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 500;
        primeiraConta.saldo +=100;
        System.out.println(primeiraConta.saldo);
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        System.out.println(segundaConta.saldo);
        
        if(segundaConta == primeiraConta){
            System.out.println("São a mesma coisa!");
        }else{
            System.out.println("Contas diferentes");
        }
    }
}
