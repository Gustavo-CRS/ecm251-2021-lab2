package consoleti.gustavo.t2.models;

import consoleti.gustavo.t2.enums.Funcoes;
import consoleti.gustavo.t2.enums.Horarios;

public class HeavyLift extends Membros{

    public HeavyLift(String email, String nome, Funcoes funcao) {
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
                System.out.println("Podem contar conosco!");
                break;
            case EXTRA:
                System.out.println("N00b_qu3_n_Se_r3pita.bat");
                break;
        }
       
        
    }
    
}
