  
/**
 * 
 *  @author Guilherme Samuel de Souza Barbosa 19.00012-0 <gui.samuel10@gmail.com>
 *  @author Gustavo Consoleti Ramirez de Souza 19.00715-9 <gugacon@hotmail.com>
 * 
 */


import java.util.Random;

public class Transacoes {  

    // Métodos
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
        
    public static String pegarQRcode(int idConta, String nome, double valor) {
        String qrCode = (idConta + ";" + nome + ";" + valor + ";" + getRandomNumberInRange(1000, 9999));
        return qrCode;
    }


    public static boolean pagarRequisicao(Usuario pagador, Usuario recebedor, double valor) {
        if (pagador.getConta().getSaldo() >= valor) {
            Conta.pagar(pagador.getConta(), valor);
            Conta.receber(recebedor.getConta(), valor);
            return true;
        } 
        return false;
    }
}