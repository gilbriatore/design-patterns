package pattern;

import pattern.controller.CarrinhoController;
import pattern.facade.PedidoFacade;
import pattern.facade.PedidoFacadeImpl;

public class VendaApp {

	public static void main(String[] args) {

		PedidoFacade facade = new PedidoFacadeImpl();
		CarrinhoController controller = new CarrinhoController(facade);
		controller.selecionarProduto(9);
		boolean resultado = controller.isPedidoRealizado();
		System.out.println("Pedido concluído? " + resultado); 

	}
}