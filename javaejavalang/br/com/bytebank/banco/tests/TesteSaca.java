package javaejavalang.br.com.bytebank.banco.tests;

import javaejavalang.br.com.bytebank.banco.models.Conta;
import javaejavalang.br.com.bytebank.banco.models.ContaCorrente;
import javaejavalang.br.com.bytebank.banco.models.SaldoInsuficienteException;

public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);
        conta.deposita(200.0);
        try {
            conta.saca(1000.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Exception " + e.getMessage());
        }
        
        System.out.println(conta.getSaldo());
    }
}
