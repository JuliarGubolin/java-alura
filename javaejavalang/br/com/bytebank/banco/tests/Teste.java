package javaejavalang.br.com.bytebank.banco.tests;

import javaejavalang.br.com.bytebank.banco.models.Cliente;
import javaejavalang.br.com.bytebank.banco.models.ContaCorrente;
import javaejavalang.br.com.bytebank.banco.models.ContaPoupanca;

public class Teste {
    public static void main(String[] args) {

        //Sobrecarga do método println
        System.out.println();
        System.out.println("X");
        System.out.println(2);
        System.out.println(false);

        ContaCorrente cc = new ContaCorrente(11, 33);
        ContaPoupanca cp = new ContaPoupanca(11, 33);
        Cliente cliente = new Cliente();

        System.out.println(cc.toString());
        System.out.println(cp);
        System.out.println(cliente);

        // --------------------- //
        //Todas as classes herdam da classe Object (extends Object)
        //Object cli = new Cliente();
        //O toString() é da classe Object
    }
}
