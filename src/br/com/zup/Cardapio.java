package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Cardapio{
    private List<Prato> pratosDoDia = new ArrayList<>();

    public Cardapio(){

    }

    public List<Prato> getPratosDoDia() {
        return pratosDoDia;
    }

   public void adicionarPrato(Prato prato){
        pratosDoDia.add(prato);
    }

    @Override
    public String toString() {
        StringBuilder dadosDoCardapio = new StringBuilder();
        dadosDoCardapio.append("---- CARDAPIO -----");
        dadosDoCardapio.append("\nPratos:  " + pratosDoDia);
        return dadosDoCardapio.toString();
    }
}
