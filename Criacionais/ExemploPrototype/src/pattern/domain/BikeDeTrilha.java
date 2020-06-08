package pattern.domain;

public class BikeDeTrilha extends Bike {
	
	public BikeDeTrilha() {
		tipo = Tipo.Trilha;
	}

	@Override
	public void criarBike() {
		System.out.println("Bike de trilha criada!");
	}
}