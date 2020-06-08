package pattern.domain;

public class BikeDePasseio extends Bike {

	public BikeDePasseio() {
		tipo = Tipo.Passeio;
	}
	
	@Override
	public void criarBike() {
		System.out.println("Bike de passeio criada!");
	}
}