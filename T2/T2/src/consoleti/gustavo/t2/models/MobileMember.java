package consoleti.gustavo.t2.models;

import consoleti.gustavo.t2.enums.Funcoes;
import consoleti.gustavo.t2.enums.Horarios;

public class MobileMember extends Membros {

    /**
     * Construtor da classe mãe.
     */
    public MobileMember(String email, String nome, Funcoes funcao) {
        super(email, nome, funcao);
    }
    
    /**
     * Implementação do método apresentar() para a classe dos Mobile Members.
     */
    @Override
    public void apresentar() {
        System.out.println(toString());
    }
    
    /**
     * Implementação do método mensagem() para a classe dos Mobile Members.
     * 
     * @param horario
     */
    @Override
    public void mensagem(Horarios horario) {
        switch (horario) {
            default:
                break;
            case NORMAL:
                System.out.println("HappyCoding!");
                break;
            case EXTRA:
                System.out.println("MAsK_S0c13ty");
                break;
        }
    }
}
