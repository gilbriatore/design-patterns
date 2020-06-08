package pattern.factory;

import pattern.domain.Pet;

public interface Factory {
	
	public Pet criarPet(String tipoDoAnimal);

}