package br.com.zup;

public class Ingredientes {
    private String nome;
    private double quantidade;

    public Ingredientes(String nome,double quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("Nome: " +nome);
        dados.append("Quantidade: " + quantidade);
        return dados.toString();
    }
}
