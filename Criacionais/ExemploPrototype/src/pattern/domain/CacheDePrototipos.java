package pattern.domain;

import java.util.Hashtable;

import pattern.domain.Bike.Marca;
import pattern.domain.Bike.Tipo;

public class CacheDePrototipos {
	
	private static Hashtable<Bike.Tipo, Bike> bikes = new Hashtable<Bike.Tipo, Bike>();
	
	public static Bike getBikeClonada(Bike.Tipo tipo) {
		Bike retorno = bikes.get(tipo);
		return (Bike) retorno.clone();
	}
	
	public static void criar() {
		
		Bike bikeDeTrilha = new BikeDeTrilha();
		bikeDeTrilha.setCodigo(997);
		bikeDeTrilha.setTipo(Tipo.Trilha);
		bikeDeTrilha.setMarca(Marca.Shimano);
		bikes.put(bikeDeTrilha.getTipo(), bikeDeTrilha);
		bikeDeTrilha.criarBike();
		
		Bike bikeDeCorrida = new BikeDeCorrida();
		bikeDeCorrida.setCodigo(998);
		bikeDeCorrida.setTipo(Tipo.Corrida);
		bikeDeCorrida.setMarca(Marca.Caloi);
		bikes.put(bikeDeCorrida.getTipo(), bikeDeCorrida);
		bikeDeCorrida.criarBike();
		
		Bike bikeDePasseio = new BikeDePasseio();
		bikeDePasseio.setCodigo(999);
		bikeDePasseio.setTipo(Tipo.Passeio);
		bikeDePasseio.setMarca(Marca.Smoove);
		bikes.put(bikeDePasseio.getTipo(), bikeDePasseio);
		bikeDePasseio.criarBike();
	}

}
