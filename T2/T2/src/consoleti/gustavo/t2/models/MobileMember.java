package consoleti.gustavo.t2.models;

import consoleti.gustavo.t2.enums.Funcoes;
import consoleti.gustavo.t2.enums.Horarios;

public class MobileMember extends Membros {

    public MobileMember(String email, String nome, Funcoes funcao) {
        super(email, nome, funcao);
        
    }

    @Override
    public void apresentar() {
        System.out.println(toString());
        
    }

    
    /** 
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
