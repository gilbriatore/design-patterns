package pattern;

import pattern.domain.Bike;
import pattern.domain.Bike.Tipo;
import pattern.domain.CacheDePrototipos;

public class BikesShopApp {
	
	public static void main(String[] args) {
		
		// Cria os protótipos para uso posterior.
		CacheDePrototipos.criar();
		
		// Cria e usa os clones.
		Bike bikeTrilhaClonada = CacheDePrototipos.getBikeClonada(Tipo.Trilha);
		System.out.println(bikeTrilhaClonada);
		
		Bike bikeCorridaClonada = CacheDePrototipos.getBikeClonada(Tipo.Corrida);
		System.out.println(bikeCorridaClonada);
		
		Bike bikePasseioClonada = CacheDePrototipos.getBikeClonada(Tipo.Passeio);
		System.out.println(bikePasseioClonada);	
	}
}