
/**
 * 
 * @author Guilherme Samuel de Souza Barbosa 19.00012-0 <gui.samuel10@gmail.com>
 * @author Gustavo Consoleti Ramirez de Souza 19.00715-9 <gugacon@hotmail.com>
 * 
 */

public class Usuario {
    // Atributos
    private String nome;
    private String senha;
    private String email;
    private Conta conta;

    // Construtor
    public Usuario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    // Getters
    public String getNome() {
        return this.nome;
    }

    public String getSenha() {
        return this.senha;
    }

    public String getEmail() {
        return this.email;
    }

    public Conta getConta() {
        return this.conta;
    }

    public String gerarRequisicao(double valor) { // Retorna: 1;All Might;250.0;9665
        this.conta.gerarQRCode(this.nome, valor);
        String qrCodeUser = Transacoes.pegarQRcode(this.conta.getIdConta(), this.nome, valor);
        return qrCodeUser;
    }

    public void pagarUsuario(Usuario user) {
        String[] dados = user.conta.getQrCode().split(";");
        double valorDaConta = Double.parseDouble(dados[2]);

        if (Transacoes.pagarRequisicao(this, user, valorDaConta)) {
            System.out.println("Transação realizada com sucesso!");

        } else {
            System.out.println("Saldo insuficiente! Transação foi cancelada.");
        }
    }

    public void abrirConta(double saldo) {
        this.conta = new Conta(saldo);
    }

}