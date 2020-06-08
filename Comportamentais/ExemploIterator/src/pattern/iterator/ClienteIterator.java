package pattern.iterator;

import pattern.domain.Cliente;

public class ClienteIterator implements Iterator {

	private int index = 0;
	private Cliente[] clientes;

	public ClienteIterator() {
		this.clientes = new Cliente[3];
		this.clientes[0] = new Cliente(1, "Ana");
		this.clientes[1] = new Cliente(2, "Carlos");
		this.clientes[2] = new Cliente(3, "Maria");
	}

	@Override
	public boolean hasNext() {
		if (index >= clientes.length || clientes[index] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		Cliente cliente = clientes[index];
		index++;
		return cliente;
	}
}