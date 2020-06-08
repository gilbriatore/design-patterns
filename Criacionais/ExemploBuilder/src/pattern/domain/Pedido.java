package pattern.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private String numero;
	private Cliente cliente;
	private Vendedor vendedor;
	private List<Produto> produtos;
	
	public Pedido() {
		produtos = new ArrayList<Produto>();
	}
	
	public BigDecimal getValorTotal() {
		BigDecimal total = BigDecimal.ZERO;
		for (Produto produto : produtos) {
			BigDecimal qtde = new BigDecimal(produto.getQuantidade());
			BigDecimal valor = produto.getValor();
			BigDecimal vTotal = valor.multiply(qtde);
			total = total.add(vTotal);
		}
		return total;
	}
	
	public int getTotalDeProdutos() {
		int total = 0;
		for (Produto produto : produtos) {
			total += produto.getQuantidade();
		}
		return total;
	}
	
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	@Override
	public String toString() {
		StringBuffer detalhes = new StringBuffer();
		detalhes.append("**************************************\n");
		detalhes.append("        Pedido " + numero  + "\n");
		detalhes.append("**************************************\n");
		detalhes.append(cliente  + "\n");
		detalhes.append(vendedor  + "\n");		
		for (Produto produto : produtos) {
			detalhes.append(produto  + "\n");
		}
		detalhes.append("Qtde de produtos: " + getTotalDeProdutos() + "\n");
		detalhes.append("Total: " + getValorTotal() + "\n");
		return detalhes.toString();
	}
}