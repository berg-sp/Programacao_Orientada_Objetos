package Jogo.objetos;
public class Arma {
    String tipo;
    int bonusDano;
    boolean ehLongoAlcance;

    public Arma(String tipo, int bonusDano, boolean ehLongoAlcance){
        this.tipo = tipo;
        this.bonusDano = bonusDano;
        this.ehLongoAlcance = ehLongoAlcance;
    }
}
