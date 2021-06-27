package consoleti.gustavo.t2.menu;

import consoleti.gustavo.t2.enums.Horarios;

public class Menus {

    /** 
     * Método responsável por exibir o menu do sistema (informações sobre 
     * a jornada de trabalho atual e recursos implementados).
     * 
     * @param jornadaTrabalho
     */
    public void exibirMenuSistema(Horarios jornadaTrabalho){
        System.out.println(
            "\nMENU DO SISTEMA:" +
            "\n" +
            "Jornada de trabalho atual: " + jornadaTrabalho +
            "\nPressione:\n" +
            "1 - Cadastrar novo membro\n" + 
            "2 - Apresentar membros cadastrados\n" + 
            "3 - Remover membro\n" + 
            "4 - Trocar jornada de trabalho\n" + 
            "5 - Postar mensagens\n" + 
            "9 - Sair\n" 
            );
    }

    /**
     * Método responsável por exibir o menu de cadastro de novos membros.
     * 
     */
    public void exibirMenuCadastro(){
        System.out.println(

            "MENU DE CADASTRO:" + 
            "\n" +
            "1 - Mobile Member\n" + 
            "2 - Heavy Lifter\n" + 
            "3 - Script Guy\n" + 
            "4 - Big Brother\n" +
            "9 - Sair"
        );
    }
}
