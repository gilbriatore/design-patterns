package pattern.domain;

public interface Pet {
	
    void setNome(String nome);
    String getNome();
    String getTipo();
    boolean estaComFome();
    void comer();
    
}