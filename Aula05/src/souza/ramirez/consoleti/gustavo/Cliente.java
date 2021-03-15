package souza.ramirez.consoleti.gustavo;

public class Cliente {
    private String titular;
    private String cpf;
    private int idade;

    @Override
    public String toString() {
        return "Cliente{" + "titular='" + titular + '\'' + ", cpf='" + cpf + '\'' + '}';
    }
}
