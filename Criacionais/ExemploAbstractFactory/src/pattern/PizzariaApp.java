package pattern;

import pattern.domain.Pizza;
import pattern.domain.Pizza.Sabor;
import pattern.domain.Pizzaria.Localidade;
import pattern.factories.AbstractFactory;
import pattern.factories.PizzariaFactory;

public class PizzariaApp {
	
	public static void main(String[] args) {
		
		// Classes concretas.
//		PizzaDePepperoni pizzaPepperoni = new PizzaDePepperoni();
//		PizzariaCentro pizzariaCentro = new PizzariaCentro();
		
		// Interfaces.
		AbstractFactory factory = PizzariaFactory.getFactory(Localidade.Centro);
		
		
		//AbstractFactory factory = new PizzariaCentroFactory();
		//AbstractFactory factory = new PizzariaAguaVerdeFactory();
		
		Pizza pizza = factory.pedirPizza(Sabor.Calabresa);
		
		System.out.println(pizza); 
		
	}

}
