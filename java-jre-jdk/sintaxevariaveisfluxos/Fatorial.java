package sintaxevariaveisfluxos;

public class Fatorial {
    public static void main(String[] args) {
        int fator = 5;
        for(int cont = fator-1; cont > 0; cont--) {
            if(fator == 0){
                System.out.println("1");
            }else{
                fator = fator * cont;
            }
            
        } 
        System.out.println("O fatorial é " + fator);
    }
    
}
