package models;

abstract public class Pessoa {
    String cpf;
    String nome;
    
    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    

    public Pessoa(String cpf) {
        this.nome = "";
        this.cpf = cpf;
    }


    
    /** 
     * @return o cpf da pessoa
     */
    public String getCpf() {
        return cpf;
    }


    
    /** 
     * @return o nome da pessoa
     */
    public String getNome() {
        return nome;
    }


    


    
}
