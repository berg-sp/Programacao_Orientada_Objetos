import Jogo.personagens.Heroi;

public class Main {
    public static void main(String[] args) {
        Heroi berg = new Heroi("Ladino",  10, 7, 5);

        System.out.println("Berg\n" +
                "Categoria" + berg.categoria +
                "Pontos de vida: " + berg.pontosDeVida +
                "Força: " + berg.forca +
                "Quantidade Habilidades " + berg.quantidadeHabilidades
        );

        Heroi monica = new Heroi("Super Humano", 20);
    }
}