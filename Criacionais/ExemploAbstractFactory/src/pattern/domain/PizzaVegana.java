package pattern.domain;

public class PizzaVegana extends Pizza {
	
	public PizzaVegana() {
		nome = "Pizza Vegana";
		massa = "Massa integral";
		molho = "Molho Marinara";
		coberturas.add("Mussarela desfiada");
		coberturas.add("Parmesão ralado");
		coberturas.add("Cebola em cubos");
		coberturas.add("Cogumelos fatiados");
		coberturas.add("Pimenta vermelha em fatias");
		coberturas.add("Azeitonas pretas fatiadas");
	}
}
