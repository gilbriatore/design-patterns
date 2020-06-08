package pattern.strategy;

import pattern.domain.Imposto;
import pattern.domain.ImpostoSaoPaulo;

public class NotaFiscalSaoPauloStrategy implements NotaFiscalStrategy {

	private Imposto imposto = new ImpostoSaoPaulo();
	
	@Override
	public double calcularImposto(double valor) {
		System.out.println("Calculando imposto do Estado de São Paulo...");
		return imposto.calcular(valor);
	}

}
