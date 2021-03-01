public class basico02 {
    public static void main(String[] args) {
        
        int ano = 2020;
        if (ano % 2 == 0){
            System.out.println("O ano e par");
        }
        else{
            System.out.println("O ano e impar");
        }
        switch(ano){
            case 2005:
            System.out.println("Vixi!");
            break;

            case 1996:
            System.out.println("Voce e velho");
            break;

            case 2020:
            System.out.println("Deu tudo certo");
            break;
        }


    }
    
}
