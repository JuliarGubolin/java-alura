package javaexcecoes.excecoes;

public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (Exception e) {
            String msg = e.getMessage();
            System.out.println("Exception: "+ msg);
            //Imprime a call stack
            e.printStackTrace();
        }
        
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        /*try {
            metodo2();
        } catch (ArithmeticException e) {
            System.out.println("AritmeticException");
        }*/
        
        System.out.println("Fim do metodo1");
    }

    // Se a classe herdar diretamente de Exception, preciso colocar throws Exception na assinatura
    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        throw new MinhaExcecao("Minha exceção erro");
        //System.out.println("Fim do metodo2");
    }
}
