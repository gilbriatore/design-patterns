package pattern.domain;

public abstract class Pizza {
	
	protected String detalhes = "Pizza básica";
  
	public String getDetalhes() {
		return detalhes;
	}
	
	public abstract double getPreco();
}
