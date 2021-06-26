package consoleti.gustavo.t2.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import consoleti.gustavo.t2.enums.*;
import consoleti.gustavo.t2.menu.*;
import consoleti.gustavo.t2.models.*;
import consoleti.gustavo.t2.repositories.*;

public class Sistema {
    
    final private static Menus menu = new Menus();
    final protected static IRepository repository = new Repository();
    final private static Scanner scanner = new Scanner(System.in);
    private static Horarios jornadaTrabalho = Horarios.NORMAL;

    /**
     * @throws IOException
     */
    public static void run() throws IOException {

        boolean rodar = true;
        
        System.out.println("\f\f\f\f\f\f\f\f\f\f\f\f");// limpa o console

        String nomeCSV = "arquivo_super_Secreto_nao_abrir.csv";
        
       FileWriter file = FileService.criarCSV(nomeCSV);
        System.out.println("Bem Vindo ao sistema da MAsK_S0c13ty");

        while (rodar) {
            menu.exibirMenuSistema(jornadaTrabalho);
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    Membros membro = cadastroMembro();
                    if (membro != null) {
                        repository.adicionarMembro(membro);
                        file.modificarCSV(repository.getMembros(),file );
                    }
                    break;

                case 2:
                    for (Membros membros : repository.getMembros()) {
                        membros.apresentar();
                    }
                    break;

                case 3:
                    for (int i = 0; i < repository.getMembros().size(); i++) {
                        System.out.print("[" + (i + 1) + "]" + " ");
                        repository.getMembros().get(i).apresentar();
                        file.modificarCSV(repository.getMembros(),file);
                    }
                    System.out.println("Digite o índice do membro a ser removido do sistema.");
                    int indice = scanner.nextInt();
                    repository.removerMembros(repository.getMembros().get(indice - 1));
                    break;

                case 4:
                    switch (jornadaTrabalho) {
                        case NORMAL:
                            jornadaTrabalho = Horarios.EXTRA;
                            break;

                        case EXTRA:
                            jornadaTrabalho = Horarios.NORMAL;
                            break;
                        default:
                            break;

                    }
                    break;

                case 5:
                    for (Membros membros : repository.getMembros()) {
                        membros.mensagem(jornadaTrabalho);
                    }
                    break;

                case 9:
                    System.out.println("\nVocê está saindo do sistema.");
                    rodar = false;
                    break;

                default:
                    break;
            }
        }
    }

    /**
     * método para cadastrar membros
     * 
     * @return Membros
     */
    private static Membros cadastroMembro() {
        menu.exibirMenuCadastro();

        int opcaoMembro = scanner.nextInt();
        System.out.println("Digite o nome do membro: ");
        String nome = scanner.next();

        System.out.println("Digite o email do membro: ");
        String email = scanner.next();
        switch (opcaoMembro) {

            case 1:
                return new MobileMember(email, nome, Funcoes.MobileMembers);

            case 2:
                return new HeavyLift(email, nome, Funcoes.HeavyLifters);

            case 3:
                return new ScriptGuy(email, nome, Funcoes.ScriptGuys);

            case 4:
                return new BigBrother(email, nome, Funcoes.BigBrothers);

            case 9:
                return null;

            default:
                System.out.println("Opção inválida! Digite um valor válido.");
                return null;
        }
    }
}
