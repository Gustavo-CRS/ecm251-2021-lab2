package models;

/**
 * Modelo utilizado para criar pessoas com nome e cpf
 */
public class Pessoas {
    final public String nome;
    final public String cpf;

    /**
     * construtor com os parâmetros de nome e cpf
     * 
     * @param nome
     * @param cpf
     */
    public Pessoas(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * Devolve os valores de nome e cpf
     * 
     * @return
     */
    @Override
    public String toString() {
        return "Pesosas [cpf=" + cpf + ", nome=" + nome + "]";
    }

}
