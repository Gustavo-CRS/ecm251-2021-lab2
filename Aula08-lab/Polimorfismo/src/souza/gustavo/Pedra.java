package souza.gustavo;

public class Pedra extends Jogada{
    @Override
    public Resultado verificarResultado(Jogada jogada){
        if (jogada instanceof Tesoura){
            return Resultado.GANHEI;
        } else if(jogada instanceof Papel){
            return Resultado.PERDI;
        }
        else{
            return Resultado.EMPATEI;
        }
    }

}