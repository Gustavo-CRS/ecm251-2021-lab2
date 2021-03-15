package souza.ramirez.consoleti.gustavo;

public class Cliente {
    private String titular;
    private String cpf;
    // private int idade;

    public Cliente(String titular){
       this.titular = titular;
   }

    @Override
    public String toString() {
        return "Cliente{" + "titular='" + titular + '\'' + ", cpf='" + cpf + '\'' + '}';
    }
}
