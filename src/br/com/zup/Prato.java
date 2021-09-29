package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Prato {
    private String nome;
    private double valor;
    private List<Ingrediente> ingredientes = new ArrayList<>();

    public Prato(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void adicionarIngredientes(Ingrediente novoIngrediente){
        this.ingredientes.add(novoIngrediente);
    }

    @Override
    public String toString() {
        StringBuilder dadosDoPrato = new StringBuilder();
        dadosDoPrato.append("\nNome do Prato: " + nome);
        dadosDoPrato.append("\nValor R$: " + valor);
        dadosDoPrato.append("\t\n----- Ingredientes -----" + ingredientes.toString());

        return dadosDoPrato.toString();
    }
}
