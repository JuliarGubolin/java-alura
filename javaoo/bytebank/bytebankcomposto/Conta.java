package javaoo.bytebank.bytebankcomposto;

public class Conta {

    //Se eu colocar um valor default nestas variáveis, TODAS AS INSTÂNCIAS receberão este valor
    //a não ser que eu altere o valor do objeto após instanciá-lo
    private double saldo;
    private int agencia;
    private int numero;

    //Informação da classe, não de cada instância
    private static int total;

    private Cliente titular = new Cliente();

    public Conta(double saldo, int agencia, int numero, Cliente titular) {
        total++;
        System.out.println("O número de contas é: "+total);
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public Conta(){

    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) { 
        if (agencia <= 0) { 
            System.out.println("nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;            
    }

    public void setNumero(int numero) { 
        if (numero <= 0) {
            System.out.println("não pode valor <= 0");
            return;
        }
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

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
