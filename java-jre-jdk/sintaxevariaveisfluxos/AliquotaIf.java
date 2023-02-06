package sintaxevariaveisfluxos;

public class AliquotaIf {
    public static void main(String[] args) {

        double salario = 3300.0;
        double impostoRenda = 0.0;

        if(salario >= 1900.0 && salario <=2800.0){
            impostoRenda = salario + (salario * 0.075) - 142;
        }else if(salario >= 2800.1 && salario <=3751.0){
            impostoRenda = salario + (salario * 0.15) - 350;
        }else if(salario >= 3751.1  && salario <=4664.0){
            impostoRenda = salario + (salario * 0.225) - 636;
        }
        System.out.println("Imposto: "+ impostoRenda +" Salário: "+ salario);
    }
}
