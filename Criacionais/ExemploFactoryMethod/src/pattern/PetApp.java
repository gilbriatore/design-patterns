package pattern;

import pattern.domain.Pet;
import pattern.factory.Factory;
import pattern.factory.PetFactory;

public class PetApp {

	public static void main(String[] args) {
		
		//Cria a f�brica.
		Factory factory = new PetFactory();
		
		//Cria um animal de estima��o.
		Pet pet = factory.criarPet("gato");
		pet.setNome("Tommy");
		pet.comer();
		
		System.out.println("Nome: " + pet.getNome());
		System.out.println("Tipo: " + pet.getTipo());
		System.out.println("Est� com fome? " + pet.estaComFome());
		
		//Verifica a classe concreta que est� sendo usada.
		System.out.println("Classe: " + pet.getClass().getCanonicalName());

	}

}
