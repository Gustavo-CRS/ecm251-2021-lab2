package souza.ramirez.consoleti.gustavo;

public class Main {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Conta c1; // cria uma referência para um objeto Conta
        c1 = new Conta(); // instancia um objeto conta
        

        c1.depositar(300);
        c1.sacar(250);
        c1.visualizarSaldo();

        

    }
}
