package pattern;

import pattern.decorator.PresuntoDecorator;
import pattern.decorator.QueijoDecorator;
import pattern.domain.Pizza;
import pattern.domain.PizzaBordaNormal;
import pattern.domain.PizzaBordaRecheada;

public class PizzariaApp {

	public static void main(String args[]) {
		
		Pizza pizzaNormal = new PizzaBordaNormal();
		Pizza pizzaDeQueijo = new QueijoDecorator(pizzaNormal);
		Pizza pizzaPresuntoQueijo = new PresuntoDecorator(pizzaDeQueijo);

		System.out.println(pizzaPresuntoQueijo.getDetalhes()); 
		System.out.println("Preço em R$ " + String.format("%.2f", pizzaPresuntoQueijo.getPreco()));
		System.out.println();
		
		Pizza pizzaRecheada = new PizzaBordaRecheada();
		Pizza pizzaRecheadaDeQueijo = new QueijoDecorator(pizzaRecheada);
		Pizza pizzaRecheadaPresuntoQueijo = new PresuntoDecorator(pizzaRecheadaDeQueijo);

		System.out.println(pizzaRecheadaPresuntoQueijo.getDetalhes()); 
		System.out.println("Preço em R$ " + String.format("%.2f", pizzaRecheadaPresuntoQueijo.getPreco()));
	}
}
