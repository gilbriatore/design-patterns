package pattern.strategy;

public class NotaFiscalContext {

	private enum Estado {
		Parana,
		SaoPaulo
	}
	
	private double valorDaNota;
	private double valorDoImposto;
	
	private Estado configSistema = Estado.Parana;
	
	//ImpostoContext TEM UM strategy.
	private NotaFiscalStrategy strategy;

	public double getValorDoImposto() {
		return valorDoImposto;
	}
	
	public double getValorLiquido() {
		return valorDaNota - valorDoImposto;
	}
	
	public NotaFiscalContext(double valorDaNota) {
		
		this.valorDaNota = valorDaNota;
		
		if (configSistema == Estado.Parana) {
			this.strategy = new NotaFiscalParanaStrategy();	
		} else if (configSistema == Estado.SaoPaulo) {
			this.strategy = new NotaFiscalSaoPauloStrategy();
		} else {
			this.strategy = new NotaFiscalFederalStrategy();
		}
		this.valorDoImposto  = strategy.calcularImposto(valorDaNota);
	}
}
