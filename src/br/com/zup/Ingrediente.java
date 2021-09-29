package br.com.zup;

public class Ingrediente {
    private String nome;

    public Ingrediente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("\nIgrediente: " +nome);
        return dados.toString();
    }
}
