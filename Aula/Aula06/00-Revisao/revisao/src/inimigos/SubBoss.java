package inimigos;

public class SubBoss extends Inimigo{

    public SubBoss(int id, int ataque, int defesa, int pontosDeVida){

        super(id, ataque, defesa, pontosDeVida);
    }

    @Override
    public void atacar() {
        //Audio.reproduzirAudio(nomeArquivo: "risada");
        System.out.println("O sub boss atacou e causou " + ataque + " de dano");
    }
}
