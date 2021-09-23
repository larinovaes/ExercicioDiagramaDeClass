package br.com.zup;

public class Main {

    public static void main(String[] args) {
     Guerreiros guerreiro = new Guerreiros("Sky",5,100);
     Magos fadinhaBoa = new Magos("Flora",10,400);
     Rasteiros rasteiros = new Rasteiros("Tritannus",6,200);
     Voadores fadinhaMalfada = new Voadores("Darcy",10,300);

        System.out.println("Nome: " + fadinhaMalfada.getNome());
        System.out.println("Número de vidas: " + fadinhaMalfada.exibirVida());
        System.out.println("Danos: " + fadinhaMalfada.aplicarDano());
        fadinhaMalfada.trocarNome("kasdh");
        System.out.println("Nome: " + fadinhaMalfada.getNome());
        System.out.println("Número de vidas: " + fadinhaMalfada.exibirVida());
        System.out.println("Danos: " + fadinhaMalfada.aplicarDano());



    }
}
