package souza.gustavo;


public class Papel extends Jogada{
    @Override
    public Resultado verificarResultado(Jogada jogada){
        if (jogada instanceof Pedra){
            return Resultado.GANHEI;
        } else if(jogada instanceof Tesoura){
            return Resultado.PERDI;
        }
        else{
            return Resultado.EMPATEI;
        }
    }
    
}
