import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("Fipha", MesesDoAno.FEVEREIRO);
        Jogo jogo2 = new Jogo("Pez", MesesDoAno.JUNHO);

        System.out.println(jogo.getMesLancamento());
    }
}