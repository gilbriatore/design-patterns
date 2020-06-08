package pattern.domain;

public abstract class Pizzaria {
	
	public static enum Localidade {
		Centro,
		AguaVerde
	}
 
	abstract Pizza produzirPizza(Pizza.Sabor sabor);
 
	public Pizza pedirPizza(Pizza.Sabor sabor) {
		Pizza pizza = produzirPizza(sabor);
		System.out.println("**************************************");
		System.out.println("Preparando a " + pizza.getNome() + "");
		pizza.preparar();
		pizza.assar();
		pizza.cortar();;
		pizza.embalar();
		return pizza;
	}
}