package sintaxevariaveisfluxos;

public class TesteConversao {
    public static void main(String[] args){
		
        double salario = 125.6;
        //Casting: o java não compilaria, mas podemos forçar isso
        int valor = (int) salario;
        System.out.println(valor);

        //Long: coloca o L no final
        long numeroGrande = 97423844689472847l;
        System.out.println(numeroGrande);

        //Short
        short numeroPequeno= 1234;
        System.out.println(numeroPequeno);

        //Curiosidade -> resultado  =0.3000000004
        double v1=0.2, v2=0.1;
        System.out.println(v1+v2);
	}
}
