package treinamentoParaOprojeto;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {

    private List<CafeDaManha> cafeDaManha = new ArrayList<>();
    private List<Almoco> almoco = new ArrayList<>();
    private List<LancheDaTarde> lancheDaTarde = new ArrayList<>();
    private List<Jantar> janta = new ArrayList<>();

    public Cardapio() {

    }

    public CafeDaManha adicionarAlimentoNoCafedaManha(CafeDaManha adicionarRefeicao1) {
        cafeDaManha.add(adicionarRefeicao1);
        return adicionarRefeicao1;
    }

    public CafeDaManha removerAlimentoDoCafeDaManha(CafeDaManha removerRefeicao1) {
        cafeDaManha.remove(removerRefeicao1);
        return removerRefeicao1;
    }

    public Almoco adicionarAlimentoNoAlmoco(Almoco adicionarRefeicao2) {
        almoco.add(adicionarRefeicao2);
        return adicionarRefeicao2;
    }

    public Almoco removerAlimentoDoAlmoco(Almoco removerRefeicao2) {
        almoco.remove(removerRefeicao2);
        return removerRefeicao2;
    }

    public Jantar adicionarAlimentoNoJantar(Jantar adicionarRefeicao3) {
        janta.add(adicionarRefeicao3);
        return adicionarRefeicao3;
    }

    public Jantar removerAlimentoDoJantar(Jantar removerRefeicao3) {
        janta.remove(removerRefeicao3);
        return removerRefeicao3;
    }

    public LancheDaTarde adicionarAlimentoNoLancheDaTarde(LancheDaTarde adicionarRefeicao4) {
        lancheDaTarde.add(adicionarRefeicao4);
        return adicionarRefeicao4;
    }

    private LancheDaTarde removerAlimentoNoLancheDaTarde(LancheDaTarde removerRefeicao4) {
        lancheDaTarde.remove(removerRefeicao4);
        return removerRefeicao4;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("\n Opções para o Café da manhã: " + cafeDaManha);
        dados.append("\n Opções para o almoco: " + almoco);
        dados.append("\n Opções para o lanche da tarde: " + lancheDaTarde);
        dados.append("\n Opções para o jantar: " + janta);
        return dados.toString();
    }
}
