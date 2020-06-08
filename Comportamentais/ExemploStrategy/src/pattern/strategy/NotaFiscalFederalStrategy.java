package pattern.strategy;

import pattern.domain.Imposto;
import pattern.domain.ImpostoFederal;

public class NotaFiscalFederalStrategy implements NotaFiscalStrategy {

	private Imposto imposto = new ImpostoFederal();
	
	@Override
	public double calcularImposto(double valor) {
		System.out.println("Calculando imposto federal...");
		return imposto.calcular(valor);
	}

}
