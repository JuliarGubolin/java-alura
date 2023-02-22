package javaejavaio.javaio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket();

        InputStream fiss = s.getInputStream();
        FileInputStream fis = new FileInputStream("C:\\Users\\jaui\\OneDrive - GFT Technologies SE\\Desktop\\workspace\\java-alura\\javaejavaio\\lorem.txt");
        InputStreamReader isr = new InputStreamReader(fiss);
        BufferedReader br = new BufferedReader(isr);

        //FileOutputStream fos = new FileOutputStream("C:\\Users\\jaui\\OneDrive - GFT Technologies SE\\Desktop\\workspace\\java-alura\\javaejavaio\\lorem2.txt");
        OutputStream fos = s.getOutputStream();
        OutputStreamWriter isw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(isw);

        String linha = br.readLine();

        while(linha != null && !linha.isEmpty()){
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();
        }

        br.close();
        bw.close();
    }
}
