package souza.de.ramirez.consoleti.gustavo;

public class Estudante extends Pessoa {
    private String ra;

    public Estudante(String nome, String cpf, String ra) {
        super(nome, cpf);
        this.ra = ra;
    }

    public Estudante(String nome, String cpf) {
        super(nome, cpf);
    }

    public String getRa() {
        return ra;
    }

    @Override
    public String toString() {
        return ("{ Nome: " + getNome() + "  RA: " + getRa() + "  CPF: " + getCpf() + "}");

    }

}
