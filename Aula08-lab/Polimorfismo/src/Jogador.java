public class Jogador {
    private String nome;
    private boolean ehHumano;

    public Jogador(String nome, boolean ehHumano){
        this.nome = nome;
        this.ehHumano = ehHumano;

    }

    public Jogador(String nome){
        this.nome = nome;
        this.ehHumano = false;

    }
    
}
