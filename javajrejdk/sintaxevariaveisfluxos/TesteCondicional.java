package sintaxevariaveisfluxos;

public class TesteCondicional {
    public static void main(String[] args) {
        int idade = 20;
        int quentidadePessoas = 3;
        if(idade >= 18){
            System.out.println("Maior de idade");
        }else{
            if(quentidadePessoas >= 2){
                System.out.println("Menor acompanhado");
            }
            System.out.println("Menor de idade");
        }
    }
}
