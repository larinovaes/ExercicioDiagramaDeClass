package br.com.zup;

import java.util.Scanner;

public class SistemaRestaurante {

    private static Scanner dadosUsarios(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("------- BEM VINDO AO RESTAURANTE BELAVISTA -------");
        System.out.println("Digite [1] para adicionar um prato e seus ingredientes");
        System.out.println("Digite [2] para ver o cardápio");
        System.out.println("Digite [3] para sair do programa");
    }

    public static Prato criarPrato() {
        String nomeDoPrato = dadosUsarios("Qual nome do prato? ").nextLine();
        double valorDoPrato = dadosUsarios("Qual valor do prato? ").nextDouble();
        Prato prato = new Prato(nomeDoPrato, valorDoPrato);
        return prato;
    }

    public static Ingrediente adicionarIngrediente() {
        String nomeDoIngrediente = dadosUsarios("Digite o nome do ingrediente: ").nextLine();
        Ingrediente ingrediente = new Ingrediente(nomeDoIngrediente);
        return ingrediente;
    }

    public static void executarSistema() {
        boolean menu = true;
        Cardapio cardapio = new Cardapio();

        while (menu) {

            menu();
            int opcao = dadosUsarios("Qual a sua escolha?").nextInt();

            if (opcao == 1) {
                Prato prato = criarPrato();
                double qtdDeIndredientes = dadosUsarios("Quantos ingredientes deseja adicionar a esse prato?").nextDouble();
                for (double i = 0; i < qtdDeIndredientes; i++) {
                    Ingrediente ingrediente = adicionarIngrediente();
                    prato.adicionarIngredientes(ingrediente);
                }
                cardapio.adicionarPrato(prato);
            }
            else if (opcao == 2) {
                System.out.println(cardapio);
            } else {
                System.out.println("Voce saiu do programa!!");
                menu = false;
            }
        }

    }
}


