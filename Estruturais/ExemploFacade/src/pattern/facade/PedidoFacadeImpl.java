package pattern.facade;

import pattern.domain.Produto;
import pattern.service.EstoqueService;
import pattern.service.PagamentoService;
import pattern.service.TransportadorService;

public class PedidoFacadeImpl implements PedidoFacade {

	public boolean criarPedido(int idProduto) {
		
		boolean pedidoRealizado = false;
		
		Produto produto = new Produto();
		produto.id = idProduto;
		
		if (EstoqueService.isDisponivel(produto)) {
			System.out.println("Produto com ID " + produto.id + " está disponível!");
			boolean pagtoConfirmado = PagamentoService.realizarPagamento();
			if (pagtoConfirmado) {
				System.out.println("Pagamento confirmado...");
				TransportadorService.entregarProduto(produto);
				System.out.println("Produto despachado...");
				pedidoRealizado = true;
			}
		}
		return pedidoRealizado;
	}
}
