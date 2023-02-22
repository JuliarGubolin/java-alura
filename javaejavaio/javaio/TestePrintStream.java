package javaejavaio.javaio;

import java.io.IOException;
//import java.io.PrintStream;
import java.io.PrintWriter;

public class TestePrintStream {
    public static void main(String[] args) throws IOException {

        // Os dois são iguais, mesma função
        //PrintStream ps = new PrintStream("C:\\Users\\jaui\\OneDrive - GFT Technologies SE\\Desktop\\workspace\\java-alura\\javaejavaio\\lorem2.txt");
        PrintWriter ps = new PrintWriter("C:\\Users\\jaui\\OneDrive - GFT Technologies SE\\Desktop\\workspace\\java-alura\\javaejavaio\\lorem2.txt");

        ps.println("Lorem novo");
        ps.println();
        ps.println("Tubarao te amo");

        ps.close();
    }
}
