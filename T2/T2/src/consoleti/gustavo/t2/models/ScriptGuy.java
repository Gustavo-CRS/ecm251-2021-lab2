package consoleti.gustavo.t2.models;

import consoleti.gustavo.t2.enums.Funcoes;
import consoleti.gustavo.t2.enums.Horarios;

public class ScriptGuy extends Membros {

    /**
     * Construtor da classe mãe.
     */
    public ScriptGuy(String email, String nome, Funcoes funcao) {
        super(email, nome, funcao);
    }

    /**
     * Implementação do método apresentar() para a classe dos Script Guys.
     */
    @Override
    public void apresentar() {
        System.out.println(toString());
    }

    /**
     * Implementação do método mensagem() para a classe dos Script Guys.
     * 
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
