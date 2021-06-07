package consoleti.gustavo.t2.models;

import consoleti.gustavo.t2.enums.Funcoes;
import consoleti.gustavo.t2.enums.Horarios;

public class ScriptGuy extends Membros {

    public ScriptGuy(String email, String nome, Funcoes funcao) {
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
                System.out.println("Prazer em ajudar novos amigos de código!");
                break;
            case EXTRA:
                System.out.println("QU3Ro_S3us_r3curs0s.py");
                break;
        }
        
    }
    
}
