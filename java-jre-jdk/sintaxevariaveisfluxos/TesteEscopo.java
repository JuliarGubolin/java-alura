package sintaxevariaveisfluxos;

public class TesteEscopo {
    public static void main(String[] args) {
        int idade = 18;
        int quantidadePessoas = 2;
        //boolean acompanhado = quantidadePessoas >=2;

        //Aprendendo sobre escopo com a variável acompanhado
        boolean acompanhado;

        if(quantidadePessoas >=2 ){
            acompanhado = true;
        }else{
            acompanhado = false;
        }

        if(idade >= 18 && acompanhado){
            System.out.println("Maior de idade e acompanhado = " + acompanhado);
        }else{
            System.out.println("Menor de idade");
        }
    }
}
