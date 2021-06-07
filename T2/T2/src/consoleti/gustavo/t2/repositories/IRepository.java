package consoleti.gustavo.t2.repositories;

import java.util.ArrayList;

import consoleti.gustavo.t2.models.Membros;

public interface IRepository {
    void adicionarMembro(Membros membro);
    void removerMembros(Membros membro);
    ArrayList<Membros> getMembros();


}
