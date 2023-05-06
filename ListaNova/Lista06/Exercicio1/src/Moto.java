public class Moto extends Veiculo{
    public Moto(int i, int i1, int i2) {
    }

    public Moto(int id, int velocidadeAtual, int velocidadeMaxima, int precisaoEmCurvas, boolean estaComFarolLigado) {
        super(id, velocidadeAtual, velocidadeMaxima, precisaoEmCurvas, estaComFarolLigado);
    }

    @Override
    public void utilizarHabilidadeEspecial() {

        System.out.println("Moto ultrapassou o adversário à frente");
    }
}