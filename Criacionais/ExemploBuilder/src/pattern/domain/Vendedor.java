package pattern.domain;

public class Vendedor {

	private int codigo;
	private String nome;
	
	public Vendedor() {
	}

	public Vendedor(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		StringBuffer detalhes = new StringBuffer();
		detalhes.append("Código: " + codigo);
		detalhes.append(" Vendedor: " + nome);
		return detalhes.toString();
	}
}