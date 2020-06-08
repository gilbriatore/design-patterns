package pattern;

import pattern.domain.Usuario;
import pattern.singleton.GerenciadorSingleton;

public class GerenciadorApp {

	public static void main(String[] args) {
		
		
		// Pega a instância do gerenciador.
		GerenciadorSingleton gerenciador = GerenciadorSingleton.getInstancia();
		
		for (Usuario usuario : gerenciador.getUsuarios()) {
			System.out.println("Login: " + usuario.getLogin());
			System.out.println("Senha: " + usuario.getSenha());
			
			//Altera o login para letra do tipo caixa alta.
			usuario.setLogin(usuario.getLogin().toUpperCase());
		}
		
		// Pega a mesma instancia do gerenciador.
		GerenciadorSingleton gerenciador2 = GerenciadorSingleton.getInstancia();
		
		for (Usuario usuario : gerenciador2.getUsuarios()) {
			System.out.println("Login: " + usuario.getLogin());
			System.out.println("Senha: " + usuario.getSenha());
		}
	}
}