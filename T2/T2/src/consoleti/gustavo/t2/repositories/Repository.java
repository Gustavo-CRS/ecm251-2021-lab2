package consoleti.gustavo.t2.repositories;

import java.util.ArrayList;

import consoleti.gustavo.t2.models.Membros;

public class Repository implements IRepository {

    private ArrayList<Membros> listaMembros = new ArrayList<Membros>();

    /**
     * método responsável por adicionar novos membros.
     * 
     * @param membro
     */
    @Override
    public void adicionarMembro(Membros membro) {
        this.listaMembros.add(membro);

    }

    /**
     * Método responsável por remover membros.
     * 
     * @param membro
     */
    @Override
    public void removerMembros(Membros membro) {
        this.listaMembros.remove(membro);

    }

    /**
     * Método que retorna a lista de membros.
     * 
     * @return a lista de membros
     */
    @Override
    public ArrayList<Membros> getMembros() {

        return listaMembros;
    }
}
