package sintaxevariaveisfluxos;

public class TesteCondicional2 {
    public static void main(String[] args) {
        int idade = 18;
        int quantidadePessoas = 2;
        boolean acompanhado = quantidadePessoas >=2;

        if(idade >= 18 && acompanhado){
            System.out.println("Maior de idade e acompanhado = " + acompanhado);
        }else{
            System.out.println("Menor de idade");
        }
    }
}
