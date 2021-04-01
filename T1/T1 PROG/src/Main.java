/**
 * 
 *  @author Guilherme Samuel de Souza Barbosa 19.00012-0 <gui.samuel10@gmail.com>
 *  @author Gustavo Consoleti Ramirez de Souza 19.00715-9 <gugacon@hotmail.com>
 * 
 */

// package souza.de.ramirez.consoleti.gustavo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Atributos
        Scanner scanner = new Scanner(System.in);

        // Criar usuários de teste
        Usuario user1 = new Usuario("All Might", "123", "allmight@maua.br");
        Usuario user2 = new Usuario("One For All", "456", "oneforall@maua.br");
        Usuario user3 = new Usuario("Bakugo", "789", "bakugo@maua.br");

        user1.abrirConta(1000.0);
        user2.abrirConta(250.0);
        user3.abrirConta(3000.0);

        // Estado Inicial
        System.out.println("\n\n\nEstado Inicial: ");
        System.out.println("Nome Usuário: " + user1.getNome() + " - Saldo: " + user1.getConta().getSaldo());
        System.out.println("Nome Usuário: " + user2.getNome() + " - Saldo: " + user2.getConta().getSaldo());
        System.out.println("Nome Usuário: " + user3.getNome() + " - Saldo: " + user3.getConta().getSaldo() + "\n");

        // Operações de teste
        user1.gerarRequisicao(250.0);
        user2.pagarUsuario(user1);
        user3.pagarUsuario(user1);
        user2.pagarUsuario(user1);

        user2.gerarRequisicao(1000);
        user3.pagarUsuario(user2);

        // Estado Final
        System.out.println("\nEstado Final: ");
        System.out.println("Nome Usuário: " + user1.getNome() + " - Saldo: " + user1.getConta().getSaldo());
        System.out.println("Nome Usuário: " + user2.getNome() + " - Saldo: " + user2.getConta().getSaldo());
        System.out.println("Nome Usuário: " + user3.getNome() + " - Saldo: " + user3.getConta().getSaldo());

        scanner.close();

    }

}