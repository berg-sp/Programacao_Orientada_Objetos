public class Main {
    public static void main(String[] args) {
        Carro fusca = new Carro();
        Carro civic = new Carro();

        fudca.marca = "Volkswagen";
        fusca.ano = 2000;
        fusca.abastecer(qtde:30);

        fusca.acelerar();
        System.out.println("Velocidade: " + fusca.getVelocidade() + ", combustivel: " + fusca.getCombustível());

        fusca.acelerar();
        fusca.acelerar();
        System.out.println("Velocidade: " + fusca.getVelocidade() + ", combustivel: " + fusca.getCombustível());

        fusca.velocidade = 100;
        System.out.println("Velocidade: " + fusca.getVelocidade() + ", combustivel: " + fusca.getCombustível());

        fusca.combustivel = 0;
    }
}