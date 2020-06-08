package pattern.factories;

import pattern.domain.Pizza;
import pattern.domain.Pizza.Sabor;
import pattern.domain.Pizzaria;
import pattern.domain.PizzariaAguaVerde;

public class PizzariaAguaVerdeFactory extends PizzariaFactory {

	private Pizzaria pizzaria;
	
	public PizzariaAguaVerdeFactory() {
		pizzaria = new PizzariaAguaVerde();
	}
	
	@Override
	public Pizza pedirPizza(Sabor sabor) {
		return pizzaria.pedirPizza(sabor);
	}
}