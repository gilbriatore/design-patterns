package pattern;

import pattern.domain.Pet;
import pattern.factory.Factory;
import pattern.factory.PetFactory;

public class PetApp {

	public static void main(String[] args) {
		
		//Cria a fábrica.
		Factory factory = new PetFactory();
		
		//Cria um animal de estimação.
		Pet pet = factory.criarPet("gato");
		pet.setNome("Tommy");
		pet.comer();
		
		System.out.println("Nome: " + pet.getNome());
		System.out.println("Tipo: " + pet.getTipo());
		System.out.println("Está com fome? " + pet.estaComFome());
		
		//Verifica a classe concreta que está sendo usada.
		System.out.println("Classe: " + pet.getClass().getCanonicalName());

	}

}
