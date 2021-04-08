package souza.de.ramirez.consoleti.gustavo;

public class App {
    public static void main(String[] args) throws Exception {
        final Pessoa pessoa = new Pessoa("Mikasa", "321");
        System.out.println(pessoa);

        Estudante estudante1 = new Estudante("John", "321", "03");
        Estudante estudante2 = new Estudante("Micael", "321");
        Object objeto3 = new Estudante("Nathaniel", "321");

        System.out.println(estudante1);
        System.out.println(estudante2);
        System.out.println(objeto3);
    }
}
