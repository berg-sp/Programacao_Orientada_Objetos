public class Main {
    public static void main(String[] args) {
        Corrida corrida = new Corrida();
        corrida.adicionarVeiculos(new Carro());
        corrida.adicionarVeiculos(new Moto());
        corrida.adicionarVeiculos(new BiMotor());

        corrida.iniciarCorrida();
    }
}