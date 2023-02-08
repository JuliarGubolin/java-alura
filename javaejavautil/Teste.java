package javaejavautil;

public class Teste {
    public static void main(String[] args) {
        int[] idades = new int[4];

        idades[0] = 2;
        int idade = idades[3];

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idade + i);
        }

        System.out.println(idade);
        System.out.println(idades.length);
    }
}
