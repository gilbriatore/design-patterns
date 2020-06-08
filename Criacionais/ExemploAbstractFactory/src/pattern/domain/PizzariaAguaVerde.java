package pattern.domain;

public class PizzariaAguaVerde extends Pizzaria {

	Pizza produzirPizza(Pizza.Sabor sabor) {
		if (sabor.equals(Pizza.Sabor.Queijo)) {
			return new PizzaDeQueijo();
		} else if (sabor.equals(Pizza.Sabor.Vegana)) {
			return new PizzaVegana();
		} else if (sabor.equals(Pizza.Sabor.Calabresa)) {
			return new PizzaDeCalabresaBairro();
		} else if (sabor.equals(Pizza.Sabor.Pepperoni)) {
			return new PizzaDePepperoni();
		} else return null;
	}
}
