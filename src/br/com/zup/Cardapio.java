package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Cardapio{
    private List<Pratos> pratosDoDia = new ArrayList<>();

    public Cardapio(){

    }

    public List<Pratos> getPratosDoDia() {
        return pratosDoDia;
    }

   public void adicionandoPratosAoCardapio(Pratos pratos){
        pratosDoDia.add(pratos);
    }

    @Override
    public String toString() {
        StringBuilder dadosDoCardapio = new StringBuilder();
        dadosDoCardapio.append("---- CARDAPIO -----");
        dadosDoCardapio.append(pratosDoDia.toString());
        return dadosDoCardapio.toString();
    }
}
