package javaejavalang.br.com.bytebank.banco.tests;

public class TesteString {
    public static void main(String[] args) {

        //Uma string não pode ser alterada (imutabilidade)
        String nome1 = "Alura";
        char c = 'a';
        String vazio = " ";
        System.out.println(vazio.isEmpty());
        // Tira os espaços vazios
        vazio.trim();
        System.out.println(vazio.isEmpty());

        char caractere = nome1.charAt(2);
        int pos = nome1.indexOf("ur");
        nome1.substring(pos);
        String nome2 = nome1.replace("A", "a");
        String nome3 = nome1.toLowerCase();
        String nome4 = nome1.toUpperCase();
        System.out.println(caractere);
    }
}
