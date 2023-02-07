package javaejavalang.br.com.bytebank.banco.models;

public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(String msg){
        super(msg);
    }
}
