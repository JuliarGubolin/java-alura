package javaejavaio.javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("C:\\Users\\jaui\\OneDrive - GFT Technologies SE\\Desktop\\workspace\\java-alura\\javaejavaio\\contas.csv"));
        //https://docs.oracle.com/javase/tutorial/java/data/
        while(sc.hasNextLine()){

            //Escaneia linhas dos arquivo
            String linha = sc.nextLine();
            System.out.println(linha);

            //Escaneira uma linha
            Scanner linhaScanner = new Scanner(linha);
            //Para que ele considere o . para separar inteiros de decimais e não ,
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");
            String valor1 = linhaScanner.next();
            int valor2 = linhaScanner.nextInt();
            int valor3 = linhaScanner.nextInt();

            //Formatando valores
            //%04d: 4 caracteres no número com 0 na frente
            String valorFormatado = String.format(new Locale("pt", "BR") ,"%20s - %04d - %d", valor1, valor2, valor3);
            //System.out.println(valor1+valor2+valor3);
            System.out.println(valorFormatado);

            String[] valores = linha.split(",");
            System.out.println(Arrays.toString(valores));
            linhaScanner.close();
        }
        sc.close();
        
    }
}
