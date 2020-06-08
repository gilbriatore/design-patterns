package pattern.service;

import pattern.domain.Produto;

public class EstoqueService {
	
	public static boolean isDisponivel(Produto product) {
		/* Verifica no banco de dados a disponibilidade do produto */
		return true;
	}
}