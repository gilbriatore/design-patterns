package pattern.domain;

public abstract class Bike implements Cloneable {
	
	public static enum Tipo {
		Trilha,
		Corrida,
		Passeio
	}
	
	public static enum Marca {
		Caloi,
		Garmin,
		Mavic,
		Shimano,
		Smoove,
		Sram,
		Scott
	}
	
	private int codigo;
	protected Tipo tipo;
	protected Marca marca;
	
	public abstract void criarBike();
	
	public Bike() {
	}
	
	public Bike(int codigo, Tipo tipo, Marca marca) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.marca = marca;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	@Override
	protected Object clone() {
		Object clone = null;
		
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
	
	@Override
	public String toString() {
		StringBuffer detalhes = new StringBuffer();
		detalhes.append("Código: " + codigo);
		detalhes.append(" Tipo: " + tipo);
		detalhes.append(" Marca: " + marca);
		return detalhes.toString();
	}
}
