package pattern.domain;

import pattern.observer.Subject;
import pattern.observer.Observer;

public class LojaFilial implements Observer {

	private String nome;
	private Produto produto;
	
	private Subject subject;

	public LojaFilial(Subject subject) {
		this.subject = subject;
		this.subject.registrarObserver(this);
		this.nome = "Loja Filial";
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
