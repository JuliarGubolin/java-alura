package javaejavautil.TesteUtil;

import java.util.ArrayList;

import javaejavalang.br.com.bytebank.banco.models.Conta;
import javaejavalang.br.com.bytebank.banco.models.ContaCorrente;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<>();

        ArrayList<String> lista2 = new ArrayList<>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(224, 114);
        lista.add(cc2);

        System.out.println(lista.size());

        Object ref = lista.get(0);
        lista.remove(ref);

        for(Conta a: lista){
            System.out.println(a);
        }

    }
}
