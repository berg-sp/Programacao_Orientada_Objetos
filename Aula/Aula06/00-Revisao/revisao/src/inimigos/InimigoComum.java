package inimigos;
public class InimigoComum extends Inimigo{
    public InimigoComum(int id, int ataque, int defesa, int pontosDeVida){
        super(id, ataque, defesa, pontosDeVida);
    }

    @Override
    public void atacar() {
        System.out.println("Inimigo comum atacou e causou " + ataque + " de dano");
    }
}