import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        String aula1 = "conhecendo mais de listas";
        String aula2 = "modelando a classe aula";
        String aula3 = "trabalhando com cursos e sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        for (String aula : aulas) {
            System.out.println("Aula: " +  aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("Aula 1: "+ primeiraAula);

        for(int i=0; i<aulas.size();i++){
            System.out.println("Aula: " +  aulas.get(i));
        }

        aulas.forEach(aula -> {System.out.println("(Aula): "+ aula);});

        aulas.add("Aumentando conhecimemnto");

        //Ordena a string
        Collections.sort(aulas);
        System.out.println(aulas);
    }
}
