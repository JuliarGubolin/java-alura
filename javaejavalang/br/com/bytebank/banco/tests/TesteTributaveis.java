package javaejavalang.br.com.bytebank.banco.tests;

import javaejavalang.br.com.bytebank.banco.models.CalculadorDeImposto;
import javaejavalang.br.com.bytebank.banco.models.ContaCorrente;
import javaejavalang.br.com.bytebank.banco.models.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc= new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());

	}

}
