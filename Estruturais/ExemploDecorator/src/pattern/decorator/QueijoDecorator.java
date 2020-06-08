package pattern.decorator;

import pattern.domain.Pizza;

public class QueijoDecorator extends Decorator {
	
 
	public QueijoDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDetalhes() {
		return pizza.getDetalhes() + ", Queijo";
	}
 
	public double getPreco() {
		return pizza.getPreco();
	}
}
