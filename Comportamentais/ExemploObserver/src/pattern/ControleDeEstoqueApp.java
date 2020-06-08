package pattern;

import pattern.domain.LojaFilial;
import pattern.domain.LojaMatriz;
import pattern.domain.Produto;
import pattern.observer.EstoqueSubject;

public class ControleDeEstoqueApp {
	
	public static void main(String[] args) {
		
		EstoqueSubject estoque = new EstoqueSubject();
		
		Produto produto1 = new Produto("Camisa", 100.00);
		LojaMatriz lojaMatriz = new LojaMatriz(estoque);
		lojaMatriz.setProduto(produto1);
		
		Produto produto2 = new Produto("Calça", 130.00);
		LojaFilial lojaFilial = new LojaFilial(estoque);
		lojaFilial.setProduto(produto2);
		
		estoque.setReajuste(0.1);
		System.out.println(produto1);
		System.out.println(produto2);
		
	}

}
