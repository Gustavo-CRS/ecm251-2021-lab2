package consoleti.gustavo.t2.models;

import consoleti.gustavo.t2.enums.*;

public class BigBrother extends Membros {
    
    /**
     * Construtor da classe mãe.
     */
    public BigBrother(String email, String nome, Funcoes funcao) {
        super(email, nome, funcao);
    }

    /**
     * Implementação do método apresentar() para a classe dos Big Brothers.
     */
    @Override
    public void apresentar() {
        System.out.println(toString());
    }
    
    /**
     * Implementação do método mensagem() para a classe dos Big Brothers.
     * 
     * @param horario
     */
    @Override
    public void mensagem(Horarios horario) {
        switch (horario) {
            default:
                break;
            case NORMAL:
                System.out.println("Sempre ajudando as pessoas membros ou não S2!");
                break;
            case EXTRA:
                System.out.println("...");
                break;
        }
    }
}
