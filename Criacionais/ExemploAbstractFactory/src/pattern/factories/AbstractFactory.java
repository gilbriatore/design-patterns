package pattern.factories;

import pattern.domain.Pizza;
import pattern.domain.Pizza.Sabor;

public interface AbstractFactory {
	
	public Pizza pedirPizza(Sabor sabor);

}
