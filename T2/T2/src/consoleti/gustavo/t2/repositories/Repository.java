package consoleti.gustavo.t2.repositories;

import java.util.ArrayList;

import consoleti.gustavo.t2.models.Membros;

public class Repository {
    private ArrayList<Membros> listaMembros = new ArrayList<Membros>();

    /**
     * método para adicionar um novo membro.
     * 
     * @param membro
     */

    public void adicionarMembro(Membros membro) {
        this.listaMembros.add(membro);

    }

    /**
     * método para remover um membro
     * 
     * @param membro
     */
    public void removerMembro(Membros membro) {
        this.listaMembros.remove(membro);
    }

    /**
     * método para pegar a lista de membros.
     * 
     * @return a lista de membros
     */
    public ArrayList<Membros> getListaMembros() {
        return listaMembros;
    }

}
