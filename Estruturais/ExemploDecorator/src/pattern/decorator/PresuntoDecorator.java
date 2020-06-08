package pattern.decorator;

import pattern.domain.Pizza;

public class PresuntoDecorator extends Decorator {
 
	public PresuntoDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDetalhes() {
		return pizza.getDetalhes() + ", Presunto";
	}
 
	public double getPreco() {
		return pizza.getPreco() + 0.30; 
	}
}
