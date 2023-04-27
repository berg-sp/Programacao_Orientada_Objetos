package Jogo.personagens;

import Jogo.objetos.Arma;

public class Heroi {
    int quantidadeHabilidades;
    ArrayList<Arma> armas;
    int pontosDeVida;
    int forca;
    String categoria;

    public Heroi(String categoria, int pontosDeVida, int forca, int quantidadeHabilidades){
        this.categoria = categoria;
        this.forca = forca;
        this.pontosDeVida = pontosDeVida;
        this.quantidadeHabilidades = quantidadeHabilidades;
    }
    public Heroi(String categoria, int pontosDeVida){
        this.categoria = categoria;
        this.pontosDeVida = pontosDeVida;

    }
}
