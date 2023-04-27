import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Carro fusca = new Carro();
        fusca.combustivel = 50;
        fusca.velocidade = 30;

        System.out.println("Combustivel: " + fusca.combustivel + ", Velocidade: " + fusca.velocidade);

        fusca.combustivel = 100;
        fusca.velocidade = 60;
        fusca.combustivel = 0;

        System.out.println("Combustivel: + fusca.combustivel + " + fusca.velocidade);
    }
}