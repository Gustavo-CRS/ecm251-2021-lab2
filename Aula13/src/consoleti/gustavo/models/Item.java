package consoleti.gustavo.models;

public class Item {

    /**
     * Classe que representa um item armazenado no sistema
     */

    final public String nome;
    final public double preco;

    /**
     * Construtor do elemento item
     * 
     * @param nome
     * @param preco
     */
    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    /**
     * Método que representa o estado do objeto item
     * 
     * @return
     */
    @Override
    public String toString() {
        return "Item{" + "nome='" + nome + '\'' + ", preco=" + preco + '}';
    }

    /**
     * Método que cria um objeto item dada uma string de entrada
     * @param dados String com valores do nome e do preço do item
     * @return uma instância de item
     */
    public static Item pegaItem(String dados) {
        return new Item(dados.split(",")[0], Double.parseDouble(dados.split(",")[1]));
    }

}
