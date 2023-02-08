package javaejavautil;

import javaejavalang.br.com.bytebank.banco.models.Conta;

public class GuardadorDeContas {
   private int posicao;
   private Conta[] referencias;

   public GuardadorDeContas(){
    this.referencias = new Conta[10];
    this.posicao = 0;
   }

    public void adiciona(Conta cc) {
        this.referencias[posicao] = cc;
        this.posicao++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicao;
    }

    public Conta getReferencia(int pos) {
        return this.referencias[pos];
    }
}
