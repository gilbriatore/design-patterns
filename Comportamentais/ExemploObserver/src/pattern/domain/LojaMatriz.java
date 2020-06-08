package pattern.domain;

import pattern.observer.Observer;
import pattern.observer.Subject;

public class LojaMatriz implements Observer {

	private String nome;
	private Produto produto;
	
	private Subject subject;
	
	public LojaMatriz(Subject subject) {
		this.subject = subject;
		this.subject.registrarObserver(this);
		this.nome = "Loja Matriz";
	}

	@Override
	public void reajustarPreco(double percentual) {
	    double reajuste = produto.getPreco() * percentual;
	    double novoPreco = produto.getPreco() + reajuste;
		produto.setPreco(novoPreco);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
