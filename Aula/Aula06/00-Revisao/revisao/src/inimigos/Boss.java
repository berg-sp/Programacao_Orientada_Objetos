package inimigos;

import java.util.Random;

public class Boss extends Inimigo{

    public Boss(int id, int ataque, int defesa, int pontosDeVida)  {

        super(id, ataque, defesa, pontosDeVida);
    }

    @Override
    public void atacar() {
        Random random = new Random();
        int numeroSorteado = random.nextInt(10);

        if(numeroSorteado < 5){
            //Audio.reproduzirAudio(nomeArquivo: "fool");
            System.out.println("O Boss atacou e causou " + ataque + " de dano");
        }else if(numeroSorteado >= 4 && numeroSorteado <= 6){
            System.out.println("Boss usou um ataque especial!");
            //Audio.reproduzirAudio(nomeArquivo: "especial");
            System.out.println("O Boss atacou e causou " + ataque * 2 + " de dano");
        }else{
            System.out.println("BOSS USOU UM ATAQUE ULTRA ESPECIAL!!!");
            //Audio.reproduzirAudio(nomeArquivo: "especial_1");
            System.out.println("O Boss atacou e causou " + ataque * 3 + " de dano");
        }
    }

    public void transformar(){
        this.ataque = 1200;
        this.defesa = 1200;
        this.pontosDeVida = 12000;
        System.out.println("Boss sofreu uma transformação!!!");
    }
    public void transformar(int pontosNerfados){
        this.ataque = 1200 - pontosNerfados;
        this.defesa = 1200 - pontosNerfados;
        this.pontosDeVida = 12000 - pontosNerfados;
        System.out.println("Boss sofreu uma transformação!!!");

        try {
            Thread.sleep(200);
            System.out.println("Mas teve " + pontosNerfados + "pontos nerfados");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
