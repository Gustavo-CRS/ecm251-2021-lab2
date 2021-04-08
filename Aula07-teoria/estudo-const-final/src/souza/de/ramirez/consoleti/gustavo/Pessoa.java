package souza.de.ramirez.consoleti.gustavo;

public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // public void mudaTudo(){
    // nome = "Eren";
    // cpf = "4444466666";
    // }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return ("{ Nome: " + getNome() + "  CPF: " + getCpf() + "}");

    }
}
