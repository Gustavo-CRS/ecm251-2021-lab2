package souza.gustavo;



public class Tesoura extends Jogada{
    @Override
    public Resultado verificarResultado(Jogada jogada){
        if (jogada instanceof Papel){
            return Resultado.GANHEI;
        } else if(jogada instanceof Pedra){
            return Resultado.PERDI;
        }
        else{
            return Resultado.EMPATEI;
        }
    }
    
}
