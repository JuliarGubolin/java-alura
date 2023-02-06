package sintaxevariaveisfluxos;

public class TesteValores {
    public static void main(String[] args) {
        int primeiro = 5; 
        int segundo = 7;
        segundo = primeiro;
        primeiro=10;

        // Continua 5 pois ele copiou e colou o valor
        System.out.print(segundo);
    }
}
