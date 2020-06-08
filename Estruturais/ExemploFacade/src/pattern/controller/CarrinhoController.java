package pattern.controller;

import pattern.facade.PedidoFacade;

public class CarrinhoController {

	private PedidoFacade facade;
	private boolean pedidoRealizado = false;
	
	public CarrinhoController(PedidoFacade facade) {
		this.facade = facade;
	}
	
	public void selecionarProduto(int idProduto) {
		pedidoRealizado = facade.criarPedido(idProduto);
	}


	public boolean isPedidoRealizado() {
		return pedidoRealizado;
	}
}
