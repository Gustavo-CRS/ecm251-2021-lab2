import java.util.Random;

public class basico03 {
    public static void main(String[] args) {
        //teste
        int senha = 123456;
        //objeto que pega números aleatorios
        Random sorteador = new Random();
        int chute = sorteador.nextInt( 999999);
        int tentativas = 0;
        while (chute != senha){
            System.out.println("tentativa: "+tentativas);
            System.out.println("chute:" +chute);
            chute = sorteador.nextInt(999999);
            tentativas++;
        }
        System.out.println("Parabens nerdola");


    }
}
