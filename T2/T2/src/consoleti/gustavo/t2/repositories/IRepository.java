package consoleti.gustavo.t2.repositories;

import consoleti.gustavo.t2.models.Membros;

public interface IRepository {
    Membros adicionarMembro(Membros membro);
    Membros removeMembros(Membros membro);
    Membros getMembros(Membros membro);


}
