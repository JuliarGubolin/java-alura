package javaejavaio.charsetsenconding;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "CCCC";
        System.out.println(s.codePointAt(0));

        //Enconding da máquina
        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = s.getBytes();
        System.out.println(bytes.length + " windows-1252");
        String snovo = new String(bytes);
        System.out.println(snovo);

        byte[] bytes2 = s.getBytes("UTF-16");
        System.out.println(bytes2.length + " UTF-16");
        snovo = new String(bytes2);
        System.out.println(snovo);

        byte[] bytes3 = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes3.length);
    }
}
