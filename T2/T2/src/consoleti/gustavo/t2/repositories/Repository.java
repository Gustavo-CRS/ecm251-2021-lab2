package consoleti.gustavo.t2.repositories;

import java.util.ArrayList;

import consoleti.gustavo.t2.models.Membros;

public class Repository implements IRepository {
    private ArrayList<Membros> listaMembros = new ArrayList<Membros>();

    /**
     * método para pegar a lista de membros.
     * 
     * @return a lista de membros
     */
    public ArrayList<Membros> getListaMembros() {
        return listaMembros;
    }

    /**
     * método para adicionar novos membros.
     * 
     * @param membro
     */
    @Override
    public void adicionarMembro(Membros membro) {
        this.listaMembros.add(membro);

    }

    /**
     * método para remover membros.
     * 
     * @param membro
     */
    @Override
    public void removerMembros(Membros membro) {
        this.listaMembros.remove(membro);

    }

    /**
     * método para pegar a lista de membros.
     * 
     * @return a lista de membros
     */
    @Override
    public ArrayList<Membros> getMembros(Membros membro) {

        return listaMembros;
    }

}
