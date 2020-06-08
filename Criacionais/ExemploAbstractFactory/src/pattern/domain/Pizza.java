package pattern.domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	
	public static enum Sabor {
		Calabresa,
		Pepperoni,
		Queijo,
		Vegana
	}
	
	String nome;
	String massa;
	String molho;
	List<String> coberturas = new ArrayList<String>();

	public String getNome() {
		return nome;
	}

	public void preparar() {
		System.out.println("Preparando " + nome);
	}

	public void assar() {
		System.out.println("Assando " + nome);
	}

	public void cortar() {
		System.out.println("Cortando " + nome);
	}

	public void embalar() {
		System.out.println("Embalando " + nome);
	}

	public String toString() {
		StringBuffer detalhes = new StringBuffer();
		detalhes.append("**************************************\n");
		detalhes.append("Pizza solicitada saiu para entrega!\n");
		detalhes.append("**************************************\n");
		detalhes.append("Classe: " + this.getClass().getCanonicalName() +  "\n");
		detalhes.append(nome  + "\n");
		detalhes.append(massa + "\n");
		detalhes.append(molho + "\n");
		for (String cobertura : coberturas) {
			detalhes.append(cobertura + "\n");
		}
		return detalhes.toString();
	}
}