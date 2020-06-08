package pattern.strategy;

import pattern.domain.Imposto;
import pattern.domain.ImpostoParana;

public class NotaFiscalParanaStrategy implements NotaFiscalStrategy {

	private Imposto imposto = new ImpostoParana();
	
	@Override
	public double calcularImposto(double valor) {
		System.out.println("Calculando imposto do Estado do Paraná...");
		return imposto.calcular(valor);
	}

}
