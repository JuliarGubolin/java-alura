package javaexcecoes.excecoes;

public class FluxoComTratamento {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (NullPointerException | ArithmeticException e) {
            String msg = e.getMessage();
            System.out.println("Exception: "+ msg);
            //Imprime a call stack
            e.printStackTrace();
        }
        
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        /*try {
            metodo2();
        } catch (ArithmeticException e) {
            System.out.println("AritmeticException");
        }*/
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        Conta c = new Conta();
        ArithmeticException exception = new ArithmeticException("error");
        /*//Conta c = null;
            //c.deposita();
            //int a = i/0;
            try {
                int a = i/0;
                //Catch: indica qual pepino pode acontecer
            } catch (ArithmeticException ex) {
                System.out.println("AritmeticException");
            }*/
        throw exception;
        //System.out.println("Fim do metodo2");
    }
}
