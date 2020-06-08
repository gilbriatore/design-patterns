package pattern.domain;

public abstract class RedeSocial {
	
	protected String login;
	protected String senha;


    public RedeSocial(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public boolean post(String mensagem) {
        if (login(this.login, this.senha)) {
            boolean result =  enviarDados(mensagem.getBytes());
            logout();
            return result;
        }
        return false;
    }
    
    abstract boolean login(String login, String senha);
    abstract boolean enviarDados(byte[] dados);
    abstract void logout();
}
