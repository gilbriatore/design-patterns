 package pattern.domain;

public class ImpostoFederal implements Imposto {

	@Override
	public double calcular(double valor) {
		return valor * 0.10;
	}

}
