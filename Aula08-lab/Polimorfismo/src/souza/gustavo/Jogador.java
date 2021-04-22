package souza.gustavo;

public class Jogador {
    private String nome;
    private boolean ehHumano;
    private Jogada jogada;

    public Jogador(String nome, boolean ehHumano) {
        this.nome = nome;
        this.ehHumano = ehHumano;

    }

    public Jogador(String nome) {
        this.nome = nome;
        this.ehHumano = false;

    }

    public Jogada getJogada() {
        return jogada;
    }

    public String getNome() {
        return nome;
    }

    public boolean isehHumano() {
        return ehHumano;
    }

    public void setJogada(Jogada jogada) {
        this.jogada = jogada;
    }

    public void setEhHumano(boolean ehHumano) {
        this.ehHumano = ehHumano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return getNome();
       
    }

}
