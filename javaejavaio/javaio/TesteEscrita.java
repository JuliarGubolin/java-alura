package javaejavaio.javaio;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        //Fluxo de entrada com Arquivo
        FileOutputStream fis = new FileOutputStream("C:\\Users\\jaui\\OneDrive - GFT Technologies SE\\Desktop\\workspace\\java-alura\\javaejavaio\\lorem2.txt");
        // Melhorando para caracteres (bytes em caracteres)
        OutputStreamWriter isr = new OutputStreamWriter(fis);
        // Lendo os caracteres
        BufferedWriter bw = new BufferedWriter(isr);

        bw.write("Tutututa");
        bw.newLine();

        bw.close();
    }
}
