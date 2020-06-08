package pattern;

import pattern.strategy.NotaFiscalContext;

public class EmissoNotaFiscalApp {
	
	public static void main(String[] args) {
		
		double valorTotalDaNota = 1000;
		
		NotaFiscalContext context = new NotaFiscalContext(valorTotalDaNota);
		double valorDoImposto = context.getValorDoImposto();
		double valorLiquido = context.getValorLiquido();
		
		System.out.println("Total do imposto: " + valorDoImposto);
		System.out.println("Valor líquido: " + valorLiquido);
		System.out.println("Valor total da nota: " + valorTotalDaNota);
    }
}