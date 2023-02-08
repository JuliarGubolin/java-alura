package javaejavautil;

import javaejavalang.br.com.bytebank.banco.models.Conta;
import javaejavalang.br.com.bytebank.banco.models.ContaCorrente;
import javaejavalang.br.com.bytebank.banco.models.ContaPoupanca;

public class TesteArrayReferencias {
    public static void main(String[] args) {

        Conta[] contasGeral = new Conta[3];
        //Object[] obj = new Object[3];

        ContaCorrente[] contas = new ContaCorrente[5];
        ContaCorrente conta1 = new ContaCorrente(22, 33);

        //ContaPoupanca[] contas2 = new ContaPoupanca[5];
        ContaPoupanca conta2 = new ContaPoupanca(22, 33);

        contas[0] = conta1;
        contasGeral[0] = conta2;

        // Eu sei que funciona mas o compilador não, então eu faço um cast
        ContaPoupanca ref = (ContaPoupanca) contasGeral[0];
        System.out.println(contas[0].getNumero());
        System.out.println(ref.getNumero());
    }
}
