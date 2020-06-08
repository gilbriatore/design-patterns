package pattern.domain;

public class ImpostoParana implements Imposto {
	
	@Override
	public double calcular(double valor) {
		return valor * 0.09;
	}
}
