package pattern.factories;

import pattern.domain.Pizza;
import pattern.domain.Pizza.Sabor;
import pattern.domain.Pizzaria;
import pattern.domain.PizzariaCentro;

public class PizzariaCentroFactory extends PizzariaFactory {

	private Pizzaria pizzaria;

	public PizzariaCentroFactory() {
		pizzaria = new PizzariaCentro();
	}

	@Override
	public Pizza pedirPizza(Sabor sabor) {
		return pizzaria.pedirPizza(sabor);
	}
}