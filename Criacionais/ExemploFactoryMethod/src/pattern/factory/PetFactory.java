package pattern.factory;

import pattern.domain.Cachorro;
import pattern.domain.Gato;
import pattern.domain.Pet;

public class PetFactory implements Factory {
	
    public Pet criarPet(String tipoDoAnimal){
    	
        switch(tipoDoAnimal.toLowerCase()){
            case "cachorro":
                return new Cachorro();
            case "gato":
                return new Gato();
            default:
                throw new UnsupportedOperationException("Animal desconhecido!");
        }
    }
}
