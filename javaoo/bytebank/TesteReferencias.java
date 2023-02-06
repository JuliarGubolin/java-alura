package javaoo.bytebank;

public class TesteReferencias {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println(segundaConta.saldo);
        
        segundaConta.saldo +=100;
        System.out.println(segundaConta.saldo);
        System.out.println(primeiraConta.saldo);

        if(segundaConta == primeiraConta){
            System.out.println("São a mesma coisa!");
        }else{
            System.out.println("Contas diferentes");
        }

        //Referencias diferentes para o MESMO objeto
        System.out.println(primeiraConta+" "+segundaConta);
    }
}
