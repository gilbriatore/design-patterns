package pattern.domain;

public class Instagram extends RedeSocial {

	public Instagram(String login, String senha) {
		super(login, senha);
	}
	
	@Override
	boolean login(String login, String senha) {
		System.out.println("Autenticando usuário...");
		System.out.println("Login: " + login);
		System.out.print("Senha: ");
		for (int i = 0; i < senha.length(); i++) {
			System.out.print("*");
		}
		System.out.println("\nLogin efetuado com sucesso no Instagram!");
		return true;
	}

	@Override
	boolean enviarDados(byte[] dados) {
		boolean postado = true;
		if (postado) {
			System.out.println("Mensagem '" + new String(dados) + "' foi postada no Instagram!");
			return true;
		} else {
			return false;
		}
	}

	@Override
	void logout() {
		System.out.println("Login '" + login + "' foi desconectado do Instagram!\n\n");
	}
}