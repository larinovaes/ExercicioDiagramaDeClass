package br.com.zup;

import java.util.Scanner;


public class SistemaRestaurante {

    private static Scanner dadosUsarios(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("------- BEM VINDO AO RESTAURANTE BELAVISTA -------");
        System.out.println("Digite [1] para adicionar prato");
        System.out.println("Digite [2] para para adicionar ingredientes");
        System.out.println("Digite [3] para ver o cardápio");
        System.out.println("Digite [4] para sair do programa");
    }

    public static Pratos adicionarPratos() {
        String nomeDoPrato = dadosUsarios("Qual nome deseja da ao seu prato?").nextLine();
        double valorDoPrato = dadosUsarios("Qual valor do prato: ").nextDouble();
        Pratos pratos = new Pratos(nomeDoPrato, valorDoPrato);
        Cardapio cardapio = new Cardapio();
        cardapio.adicionandoPratosAoCardapio(pratos);

        return pratos;
    }

    public static Ingredientes adicionarIngredientes() {
        String nomeDoIngrediente = dadosUsarios("Digite o nome do ingredientes: ").nextLine();
       Ingredientes ingredientes = new Ingredientes(nomeDoIngrediente);
        return ingredientes;
    }

    public static void executarSistema() {
        boolean menu = true;
        Cardapio cardapio = new Cardapio();
        while (menu) {

            menu();
            int opcao = dadosUsarios("Qual a sua escolha?").nextInt();

            if (opcao == 1) {
                cardapio.adicionandoPratosAoCardapio(adicionarPratos());
            }
            else if(opcao == 2){

            }
            else if (opcao == 3){
                for (Pratos novosPratos: cardapio.getPratosDoDia()) {
                    System.out.println(cardapio);
                }
            } else {
                System.out.println("Voce saiu do programa!!");
                menu = false;
            }
        }

    }
}


