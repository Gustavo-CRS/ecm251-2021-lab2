package souza.ramirez.consoleti.gustavo;

public class Aula03 {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Conta c1; // cria uma referência para um objeto Conta
        c1 = new Conta(); // instancia um objeto conta
        c1.cliente = new Cliente();

        // manipular atributos
        c1.cliente.titular = "Gustavo";
        c1.saldo = 378.85;
        c1.numero = 2778;

        c1.visualizarSaldo();

        Conta c2 = new Conta();
        c2.cliente = new Cliente();
        c2.saldo = 250;
        c2.cliente.titular = "Carlos";
        c2.numero = 2555;
        c2.visualizarSaldo();

        // c2.depositar(200);
        // c2.visualizarSaldo();
        // c2.sacar(300);
        // c2.visualizarSaldo();
        // c2.sacar(3500);
        // c2.visualizarSaldo();

        c1.transferirDinheiro(c2, 250);
        c1.visualizarSaldo();
        c2.visualizarSaldo();
        System.out.println("Nome do Cliente:"+c1.cliente.titular);
        System.out.println("Nome do Cliente:"+c2.cliente.titular);

        System.out.println("C1: "+ c1.toString());
        System.out.println("C2: "+ c2.toString());

        

    }
}
