package javapolimorfismo.bytebankherdado;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario nico = new Funcionario("Nico", "123.123.123-40", 2324);
        System.out.println(nico.getNome());
    }
}
