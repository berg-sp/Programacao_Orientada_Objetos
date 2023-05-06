public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto(1, 40, 200, 5, true);
        Carro carro = new Carro(1, 50, 210, 4, true);

        moto.utilizarHabilidadeEspecial();
        carro.utilizarHabilidadeEspecial();
    }
 }