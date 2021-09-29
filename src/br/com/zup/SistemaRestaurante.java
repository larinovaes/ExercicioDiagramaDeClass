package br.com.zup;

import java.util.Scanner;


public class SistemaRestaurante {

    private static Scanner dadosUsarios(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("------- BEM VINDO AO RESTAURANTE BELAVISTA -------");
        System.out.println("Digite 1 para adicionar prato e seus Ingredientes ao cardápio");
        System.out.println("Digite 2 para ver o cardápio");
        System.out.println("Digite 3 para sair do programa");
    }

    public static Pratos adicionarPratos() {
        String nomeDoPrato = dadosUsarios("Qual nome deseja da ao seu prato?").nextLine();
        double valorDoPrato = dadosUsarios("Qual valor do prato: ").nextDouble();
        Pratos pratos = new Pratos(nomeDoPrato, valorDoPrato);

        return pratos;
    }

    public static Ingredientes adicionarIngredientes() {
        String nomeDoIngrediente = dadosUsarios("Digite o nome do ingredientes: ").nextLine();


        Ingredientes ingredientes = new Ingredientes(nomeDoIngrediente);
        return ingredientes;
    }

    public static Cardapio adicionandoPratoEingredientes() {
        Pratos pratos = adicionarPratos();
        Ingredientes ingredientes = adicionarIngredientes();
        Cardapio cardapio = new Cardapio();
        cardapio.adicionandoPratosAoCardapio(pratos);
        pratos.adicionarIngredientes(ingredientes);
        return cardapio;
    }

    public static void executarSistema() {
        boolean menu = true;
        while (menu) {

            menu();
            int opcao = dadosUsarios("Qual a sua escolha?").nextInt();

            if (opcao == 1){
                Cardapio cardapio = adicionandoPratoEingredientes();
            }

           else if(opcao == 2){

            } else{
                System.out.println("Voce saiu do Programa");
                menu = false;
            }
        }
    }
}


