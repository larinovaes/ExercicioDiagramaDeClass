package br.com.zup;

public class Main {


    public static void main(String[] args) {

        Pratos pratos = new Pratos("Frango",32);
        Ingredientes ingredientes = new Ingredientes("Frango",500);

        pratos.adicionarIngredientes(ingredientes);
        Cardapio cardapio = new Cardapio();
        cardapio.adicionandoPratosAoCardapio(pratos);
        System.out.println(cardapio.toString());


    }
}
