import java.util.ArrayList;
import java.util.Comparator;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.function.Consumer;
import java.util.List;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("Aula 142342");
        palavras.add("Aula 244444444");
        palavras.add("Aula 34");

        //Collections.sort(palavras, comparator);
        // -----------------
        /*palavras.sort((s1,  s2) -> {
                if(s1.length() < s2.length()){
                    return -1;
                }
                if(s1.length() < s2.length()){
                    return 1;
                }
                return 0;
        });

        palavras.sort((s1,  s2) -> Integer.compare(s1.length(), s2.length()));*/

        palavras.sort(Comparator.comparing(s -> s.length()));
        palavras.sort(Comparator.comparing(String::length));
        // -----------------

        System.out.println(palavras);

        for (String string : palavras) {
            System.out.println(string);
        }
 
        palavras.forEach(s -> System.out.println(s));
        palavras.forEach(System.out::println);
    }
}

/*class ImprimeNaLinha implements Consumer<String>{
    @Override
    public void accept(String t) {
        System.out.println(t);
    }
}*/

/*class ComparadorPorTamanho implements Comparator<String>{
    @Override
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length()){
            return -1;
        }
        if(s1.length() < s2.length()){
            return 1;
        }
        return 0;
    }
}*/
