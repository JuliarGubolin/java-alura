package javaejavautil.TesteUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javaejavalang.br.com.bytebank.banco.models.Conta;
import javaejavalang.br.com.bytebank.banco.models.ContaCorrente;

public class TesteLinkedList {
    public static void main(String[] args) {
        //Generics
        LinkedList<Conta> lista = new LinkedList<Conta>();

        //List é uma interface
        List<Conta> lista2 = new ArrayList<Conta>();
        List<Conta> lista3 = new LinkedList<Conta>();

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
