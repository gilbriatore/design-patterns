package pattern;

import java.math.BigDecimal;

import pattern.builder.PedidoBuilder;
import pattern.domain.Pedido;

public class VendaApp {

	public static void main(String[] args) {

//		Cliente cliente = new Cliente();
//		cliente.setCodigo(100);
//		cliente.setNome("Ricardo");
//		cliente.setTelefone("99988-0000");
//
//		Vendedor vendedor = new Vendedor();
//		vendedor.setCodigo(1);
//		vendedor.setNome("Carlos");
//
//		Produto produto1 = new Produto();
//		produto1.setNome("Notebook");
//		produto1.setQuantidade(1);
//		produto1.setValor(new BigDecimal(8000.00));
//
//		Produto produto2 = new Produto();
//		produto2.setNome("iPhone");
//		produto2.setQuantidade(2);
//		produto2.setValor(new BigDecimal(5000.00));
//
//		Pedido pedido = new Pedido();
//		pedido.setNumero("1234567890");
//		pedido.setCliente(cliente);
//		pedido.setVendedor(vendedor);
//		pedido.addProduto(produto1);
//		pedido.addProduto(produto2);

		Pedido pedido = new PedidoBuilder()
				.setNumero("1234567890")
				.setCliente(100, "Ricardo", "99988-0000")
				.setVendedor(1, "Carlos")
				.setProduto("Notebook", 1, new BigDecimal(8000.00))
				.setProduto("iPhone", 2, new BigDecimal(5000.00))
				.builder();

		System.out.println(pedido);

	}

}
