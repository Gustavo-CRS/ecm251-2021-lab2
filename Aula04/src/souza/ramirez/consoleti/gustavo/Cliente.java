package souza.ramirez.consoleti.gustavo;

public class Cliente {
    public Cliente(String nome){
        this.titular = nome;
    }
    private String titular;
    private String cpf;
    private int idade;

    @Override
    public String toString() {
        return "Cliente{" + "titular='" + titular + '\'' + ", cpf='" + cpf + '\'' + '}';
    }
}
