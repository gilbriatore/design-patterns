package pattern.domain;

public class ImpostoSaoPaulo implements Imposto {

	@Override
	public double calcular(double valor) {
		return valor * 0.05;
	}
	
}
