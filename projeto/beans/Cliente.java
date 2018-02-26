

package br.com.projeto.beans;

//Classe Cliente bean com os Atributos e os Métodos  Getters e Setters
public class Cliente {
    private int codigo;
    private String nome;
    private String fone;
    private String endereco;
    private String cidade;
    private String cpf;

    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCidade() {
        return cidade;
    }


    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getFone() {
        return fone;
    }


    public void setFone(String fone) {
        this.fone = fone;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
