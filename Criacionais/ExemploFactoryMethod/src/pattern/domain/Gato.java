package pattern.domain;

public class Gato implements Pet {
	
    private String nome;
    private String tipo = "Gato";     
    private boolean estaComFome;

    public Gato() {
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
