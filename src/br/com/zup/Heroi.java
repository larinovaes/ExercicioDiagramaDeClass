package br.com.zup;

public class Heroi {
    private String nome;
    private double vida;

    public Heroi(String nome,double vida) {
        this.nome = nome;
        this.vida = vida;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
    public void trocarNome( String novoNome){
      nome  = novoNome;
    }
    public void receberDano(double dano){
      vida = vida - dano;
    }
    public double exibirVida(){
       return vida;
    }
}
