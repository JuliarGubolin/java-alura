package javaejavalang.br.com.bytebank.banco.models;

public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 42;
	}

}
