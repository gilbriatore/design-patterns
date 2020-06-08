package pattern;

import pattern.domain.Cliente;
import pattern.iterator.ClienteIterator;
import pattern.iterator.Iterator;

public class ListarClientesApp {

	public static void main(String[] args) {
		
		Iterator iterator = new ClienteIterator();
		
		while(iterator.hasNext()) {
			Cliente cliente = (Cliente) iterator.next();
			System.out.println(cliente);
		}
	}
}
