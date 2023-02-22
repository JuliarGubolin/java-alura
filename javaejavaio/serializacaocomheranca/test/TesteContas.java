package javaejavaio.serializacaocomheranca.test;

import javaejavaio.serializacaocomheranca.modelo.ContaCorrente;
import javaejavaio.serializacaocomheranca.modelo.ContaPoupanca;
import javaejavaio.serializacaocomheranca.modelo.SaldoInsuficienteException;

//br.com.bytebank.banco.test.TesteContas 
public class TesteContas {

	//java.lang.String
	public static void main(String[] args) throws SaldoInsuficienteException{
						
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());


	}

}
