package pattern.singleton;

import java.util.ArrayList;
import java.util.List;

import pattern.domain.Usuario;

public class GerenciadorSingleton {
	
	private static GerenciadorSingleton instancia;
	
	private List<Usuario> usuarios;
	
	private GerenciadorSingleton() {
		// Construtor privado, não permite ser 
		// instanciado de fora da classe.
		
		// Cria uma lista de usuários.
		usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario("MeuLogin", "secreta"));
		usuarios.add(new Usuario("OutroLogin", "supersecreta"));
	}

	public static GerenciadorSingleton getInstancia() {
		if (instancia == null) {
			synchronized (GerenciadorSingleton.class) {
				if (instancia == null) {
					instancia = new GerenciadorSingleton();
				}
			}	
		}
		return instancia;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
