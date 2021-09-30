package treinamentoParaOprojeto;

public class Jantar extends RefeicoesDiarias{
    public Jantar(String nomeDoAlimento, double qtdDeCaloria) {
        super(nomeDoAlimento, qtdDeCaloria);
    }

    public Jantar() {
        super();
    }

    @Override
    public String getNomeDoAlimento() {
        return super.getNomeDoAlimento();
    }

    @Override
    public void setNomeDoAlimento(String nomeDoAlimento) {
        super.setNomeDoAlimento(nomeDoAlimento);
    }

    @Override
    public double getQtdDeCaloria() {
        return super.getQtdDeCaloria();
    }

    @Override
    public void setQtdDeCaloria(double qtdDeCaloria) {
        super.setQtdDeCaloria(qtdDeCaloria);
    }
}
