public class Jogo {
    private String nome;
    private MesesDoAno mesLancamento;

    public Jogo(String nome, MesesDoAno mesLancamento) {
        this.nome = nome;
        this.mesLancamento = mesLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public MesesDoAno getMesLancamento() {
        return mesLancamento;
    }

    public void setMesLancamento(MesesDoAno mesLancamento) {
        this.mesLancamento = mesLancamento;
    }
}