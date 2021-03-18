package souza.ramirez.consoleti.gustavo;

public class Conta {
    // atributos
    private Cliente cliente;
    private int numero;
    private double saldo;
    

    // métodos
    public Conta(String cliente, int numero, double saldo) {
        this.cliente = new Cliente(cliente);
        this.numero = numero;
        this.saldo = saldo; 
        
    }


    public double getSaldo() {
        return this.saldo;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;

        } else {
            return false;

        }
    }

    public void depositar(double valor) {
        // this.saldo = this.saldo + valor;
        this.saldo += valor; // mesma coisa do de cima
    }

    public boolean transferirDinheiro(Conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            
        }
        return false;

    }
    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente.toString() +
                ", saldo=" + saldo +
                ", numero=" + numero +
                '}';
    }

}
