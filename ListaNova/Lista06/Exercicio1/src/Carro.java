public class Carro extends Veiculo {
    public Carro(int i, int i1, int i2) {
    }

    public Carro(int id, int velocidadeAtual, int velocidadeMaxima, int precisaoEmCurvas, boolean estaComFarolLigado) {
        super(id, velocidadeAtual, velocidadeMaxima, precisaoEmCurvas, estaComFarolLigado);
    }

    @Override
    public void utilizarHabilidadeEspecial() {

        System.out.println("Carro fechou o adversário de trás");
    }
}