package javaejavaio.javaio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        //Fluxo de entrada com Arquivo
        FileInputStream fis = new FileInputStream("C:\\Users\\jaui\\OneDrive - GFT Technologies SE\\Desktop\\workspace\\java-alura\\javaejavaio\\lorem.txt");
        // Melhorando para caracteres (bytes em caracteres)
        InputStreamReader isr = new InputStreamReader(fis);
        // Lendo os caracteres
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();
        //System.out.println(linha);

        while(linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();
    }
}
