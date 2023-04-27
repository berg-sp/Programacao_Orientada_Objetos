public class Main {
    public static void main(String[] args) throws InterruptedException {
        Luta luta = new Luta();
        luta.lutador1.nome = "Anderson Silva";
        luta.lutador1.nome = "Mike Tyson";

        luta.apresentar();
        Thread.sleep(3000);
        luta.iniciarLuta();

    }
}