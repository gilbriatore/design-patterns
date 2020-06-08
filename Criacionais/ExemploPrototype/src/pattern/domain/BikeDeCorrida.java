package pattern.domain;

public class BikeDeCorrida extends Bike {

	public BikeDeCorrida() {
		tipo = Tipo.Corrida;
	}
	
	@Override
	public void criarBike() {
		System.out.println("Bike de corrida criada!");
	}
}