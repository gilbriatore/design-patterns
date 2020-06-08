package pattern.factories;

import pattern.domain.Pizzaria.Localidade;

public abstract class PizzariaFactory implements AbstractFactory{
	
	public static AbstractFactory getFactory(Localidade localidade) {
		
		AbstractFactory factory;
		if (localidade.equals(Localidade.Centro)){
			factory = new PizzariaCentroFactory();
		} else {
			factory = new PizzariaAguaVerdeFactory();
		}
	    return factory;
	}
}