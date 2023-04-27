package Jogo.mapas;

import Jogo.Monstro;

import java.util.ArrayList;
import java.util.Random;

public class Masmorra {
    int quantidadeSalas;

    ArrayList<Monstro> monstros = new ArrayList<>();

    private int quantidadeArmadilhas;

    public Masmorra(int quantidadeSalas, ArrayList<Monstro> monstros){
        this.monstros = monstros;
        this.quantidadeSalas = quantidadeSalas;

        Random random = new Random();

        this.quantidadeArmadilhas = random.nextInt(10);
    }
}
