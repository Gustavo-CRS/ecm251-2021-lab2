package consoleti.gustavo.t2.models;

import consoleti.gustavo.t2.enums.*;

public class BigBrother extends Membros {

    
    public BigBrother(String email, String nome, Funcoes funcao) {
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
                System.out.println("Sempre ajudando as pessoas membros ou não S2!");
                break;
            case EXTRA:
                System.out.println("...");
                break;
        }
        
    }

    
   

    
}
