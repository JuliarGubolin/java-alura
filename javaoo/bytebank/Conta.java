package javaoo.bytebank;

public class Conta {

    //Se eu colocar um valor default nestas variáveis, TODAS AS INSTÂNCIAS receberão este valor
    //a não ser que eu altere o valor do objeto após instanciá-lo
    double saldo;
    int agencia;
    int numero;
    String titular;

    public void deposita(double valor){
        this.saldo = this.saldo+valor;
    }

    public boolean saca(double valor){

        if(this.saldo >= valor){
            this.saldo = this.saldo-valor;
            return true;
        }else{
            return false;
        }
    } 

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo = this.saldo-valor;
            destino.deposita(valor);
            return true;
        }else{
            return false;
        }
    } 
}
