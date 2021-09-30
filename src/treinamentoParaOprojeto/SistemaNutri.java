package treinamentoParaOprojeto;

import java.util.Scanner;

public class SistemaNutri {

    public static Scanner dadosDeUsuario(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    //menu inicial
    public static void menu() {
        System.out.println("------------- BEM VINDOS AO DIETA SAUDAVEL -------------");
        System.out.println("Digite [1] se deseja adicionar as refeiçoes do dia");
        System.out.println("Digite [2] para ver cardapio");
        System.out.println("Digite [3] se deseja sair do Programa");
    }

    public static CafeDaManha crirRefeicao() {
        String nomeDoAlimento = dadosDeUsuario("Qual nome do alimento para add na refeião? ").nextLine();
        double qtdDeCaloria = dadosDeUsuario("Quantas calorias tem? ").nextDouble();
        CafeDaManha cafeDaManha = new CafeDaManha(nomeDoAlimento, qtdDeCaloria);
        return cafeDaManha;
    }

    public static Almoco crirRefeicao2() {
        String nomeDoAlimento = dadosDeUsuario("Qual nome do alimento para add na refeião? ").nextLine();
        double qtdDeCaloria = dadosDeUsuario("Quantas calorias tem? ").nextDouble();
        Almoco almoco = new Almoco(nomeDoAlimento, qtdDeCaloria);
        return almoco;
    }

    public static LancheDaTarde crirRefeicao3() {
        String nomeDoAlimento = dadosDeUsuario("Qual nome do alimento para add na refeião? ").nextLine();
        double qtdDeCaloria = dadosDeUsuario("Quantas calorias tem? ").nextDouble();
        LancheDaTarde lancheDaTarde = new LancheDaTarde(nomeDoAlimento, qtdDeCaloria);
        return lancheDaTarde;
    }

    public static Jantar crirRefeicao4() {
        String nomeDoAlimento = dadosDeUsuario("Qual nome do alimento para add na refeião? ").nextLine();
        double qtdDeCaloria = dadosDeUsuario("Quantas calorias tem? ").nextDouble();
        Jantar jantar = new Jantar(nomeDoAlimento, qtdDeCaloria);
        return jantar;
    }
    //menu segundario
    public static void menu2() {
        System.out.println("\n\tEm qual refeição deseja colocar esses alimentos");
        System.out.println("[1] Cafe da manha");
        System.out.println("[2] Almoco");
        System.out.println("[3] Lanche da tarde");
        System.out.println("[4] Jantar");
        System.out.println("[5] Para voltar o menu inicial!");
    }

    public static void executarSistema() {
        boolean menu = true;
        Cardapio cardapio = new Cardapio();
        while (menu) {

            menu();
            int opcoes = dadosDeUsuario("").nextInt();

            if (opcoes == 1) {
                boolean menu2 = true;
                while (menu2) {
                    menu2();
                    int opcoesDeUsuario = dadosDeUsuario("Qual sua escolha de refeição?").nextInt();

                    if (opcoesDeUsuario == 1) {
                        int qtdDeRepeticao = dadosDeUsuario("Quantos alimtenos deseja para esse refeiçao?").nextInt();
                        for (int i = 0; i < qtdDeRepeticao; i++) {
                            CafeDaManha cafeDaManha = crirRefeicao();
                            cardapio.adicionarAlimentoNoCafedaManha(cafeDaManha);
                        }
                    }
                    else if (opcoesDeUsuario == 2) {
                        int qtdDeRepeticao = dadosDeUsuario("Quantos alimtenos deseja para esse refeiçao?").nextInt();
                        for (int i = 0; i < qtdDeRepeticao; i++) {
                            Almoco almoco = crirRefeicao2();
                            cardapio.adicionarAlimentoNoAlmoco(almoco);
                        }
                    }
                    else if (opcoesDeUsuario == 3) {
                        int qtdDeRepeticao = dadosDeUsuario("Quantos alimtenos deseja para esse refeiçao?").nextInt();
                        for (int i = 0; i < qtdDeRepeticao; i++) {
                            LancheDaTarde lancheDaTarde = crirRefeicao3();
                            cardapio.adicionarAlimentoNoLancheDaTarde(lancheDaTarde);
                        }
                    }
                    else if (opcoesDeUsuario == 4) {
                        int qtdDeRepeticao = dadosDeUsuario("Quantos alimtenos deseja para esse refeiçao?").nextInt();
                        for (int i = 0; i < qtdDeRepeticao; i++) {
                            Jantar jantar = crirRefeicao4();
                            cardapio.adicionarAlimentoNoJantar(jantar);
                        }
                    }
                    else if (opcoesDeUsuario == 5) {
                        menu2 = false;
                    } else {
                        System.out.println("Digite um valor válido!");
                    }
                }
            }
            else if (opcoes == 2) {
                System.out.println(cardapio);
            }
            else if (opcoes == 3) {
                System.out.println("Voce saiu do programa!!");
                menu = false;
            } else {
                System.out.println("Digite um valor válido!");
            }
        }
    }
}
