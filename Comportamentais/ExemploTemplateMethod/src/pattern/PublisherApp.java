package pattern;

import pattern.domain.Facebook;
import pattern.domain.Instagram;
import pattern.domain.RedeSocial;
import pattern.domain.Twitter;

public class PublisherApp {

	public static void main(String[] args) {

		RedeSocial rede = null;
		String login = "geucimar@up.edu.br";
		String senha = "supersecreta";
		String mensagem = "Padrão Template Method";

		rede = new Facebook(login, senha);
		rede.post(mensagem);

		rede = new Twitter(login, senha);
		rede.post(mensagem);
		
		rede = new Instagram(login, senha);
		rede.post(mensagem);
	}
}
