import inimigos.Boss;
import inimigos.Inimigo;
import inimigos.InimigoComum;
import inimigos.SubBoss;

public class Main {
    public static void main(String[] args) {

        /*Inimigo inimigoComum = new InimigoComum(1, 10, 10, 100);
        inimigoComum.atacar();

        //Thread.sleep(2000);

        Inimigo subBoss = new SubBoss(2, 100,100,1000);
        subBoss.atacar();

        //Thread.sleep(3000);*/

        Boss boss = new Boss( 3, 1000, 1000, 10000);
        boss.atacar();
        boss.atacar();
        boss.atacar();
        boss.transformar();
    }
}