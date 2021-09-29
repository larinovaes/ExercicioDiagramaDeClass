package br.com.zup;

public class Ingredientes {
    private String nome;

    public Ingredientes(String nome) {
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
        dados.append("\nNome do ingrediente: " +nome);
        return dados.toString();
    }
}
