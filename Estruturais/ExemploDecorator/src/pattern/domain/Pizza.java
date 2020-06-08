package pattern.domain;

public abstract class Pizza {
	
	protected String detalhes = "Pizza b�sica";
  
	public String getDetalhes() {
		return detalhes;
	}
	
	public abstract double getPreco();
}
