import java.util.ArrayList;

/**
 1 - Incluir 4 heróis, sendo um dele repetido
 2 - remover o primeiro herói
 3 - apresentar o total ed moedas de ouro do time
 */
public class Main {
    public static void main(String[] args) {
        // 1- incluir 4 heróis, sendo um deles repetido
        Heroi homemFerro = new Heroi( 1, "Homem-de-Ferro", 10);
        Heroi capitaoAmerica = new Heroi( 2, "Capitão-América", 10);
        Heroi spiderMan = new Heroi( 3, "Spider-Man", 10);
        Heroi gaviaoArqueiro = new Heroi( 4, "Gavião-Arqueiro", 10);

        Grupo vingadores = new Grupo();
        vingadores.adicionarHeroi(homemFerro);
        vingadores.adicionarHeroi(capitaoAmerica);
        vingadores.adicionarHeroi(spiderMan);
        vingadores.adicionarHeroi(gaviaoArqueiro);

        // 2 - remover o primeiro herói
        vingadores.removerHeroi(homemFerro.getId());

        // 3 - apresentar o total de moedas do time
        System.out.println("O total de moedas do grupo é :" + vingadores.getTotalMoedasDeOuro());
    }
}