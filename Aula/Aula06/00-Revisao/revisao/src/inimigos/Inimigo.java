package inimigos;

public abstract class Inimigo {
    protected int id;
    protected int ataque;
    protected int defesa;
    protected int pontosDeVida;

    public Inimigo(){
    }

    public Inimigo(int id, int ataque, int defesa, int pontosDeVida) {
        this.id = id;
        this.ataque = ataque;
        this.defesa = defesa;
        this.pontosDeVida = pontosDeVida;
    }

    public abstract void atacar();
        //System.out.println("Inimigo atacou e causou " + this.ataque + " de dano");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
    this.id = id;
    }

    public int getAtaque() {
    return ataque;
    }

    public void setAtaque(int ataque) {
    this.ataque = ataque;
    }

    public int getDefesa() {
    return defesa;
    }

    public void setDefesa(int defesa) {
    this.defesa = defesa;
    }

    public int getPontosDeVida() {
    return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }
}