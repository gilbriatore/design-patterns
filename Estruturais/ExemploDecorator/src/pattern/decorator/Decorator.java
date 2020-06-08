package pattern.decorator;

import pattern.domain.Pizza;

public abstract class Decorator extends Pizza {
	
	Pizza pizza;
	public abstract String getDetalhes();
	
}
