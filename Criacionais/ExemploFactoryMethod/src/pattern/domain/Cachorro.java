package pattern.domain;

public class Cachorro implements Pet {
	
    private String nome;
    private String tipo = "Cachorro";    
    private boolean estaComFome;

    public Cachorro() {
        super();
        this.estaComFome = true;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public boolean estaComFome() {
        return this.estaComFome;
    }

    @Override
    public void comer() {
        this.estaComFome = false;
    }
}
