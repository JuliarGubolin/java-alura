package javaejavautil.TesteUtil;

import java.util.ArrayList;

import javaejavalang.br.com.bytebank.banco.models.Conta;
import javaejavalang.br.com.bytebank.banco.models.ContaCorrente;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        boolean existe = lista.contains(cc2);

        System.out.println("Já existe? " + existe);

        for(Conta conta : lista) {
                System.out.println(conta);
        }

        Conta cc3 = new ContaCorrente(22, 22);
        for(Conta conta : lista) {
            if(conta == cc3) {
                System.out.println("Já tenho essa conta!");
            }
        }
        Conta cc4 = new ContaCorrente(22, 11);
        Conta cc5 = new ContaCorrente(22, 22);

        boolean igual = cc4.ehIgual(cc5);
        System.out.println(igual);
    }
}
