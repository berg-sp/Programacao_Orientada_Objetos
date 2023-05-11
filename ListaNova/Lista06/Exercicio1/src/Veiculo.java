public abstract class Veiculo{
    private int id;
    private int velocidadeAtual;
    private int velocidadeMaxima;
    private int precisaoEmCurvas;
    private boolean estaComFarolLigado;


    public Veiculo() {
    }

    public Veiculo(int id, int velocidadeAtual, int velocidadeMaxima, int precisaoEmCurvas, boolean estaComFarolLigado) {
        this.id = id;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMaxima = velocidadeMaxima;
        this.precisaoEmCurvas = precisaoEmCurvas;
        this.estaComFarolLigado = estaComFarolLigado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getPrecisaoEmCurvas() {
        return precisaoEmCurvas;
    }

    public void setPrecisaoEmCurvas(int precisaoEmCurvas) {
        this.precisaoEmCurvas = precisaoEmCurvas;
    }

    public boolean isEstaComFarolLigado() {
        return estaComFarolLigado;
    }

    public void setEstaComFarolLigado(boolean estaComFarolLigado) {
        this.estaComFarolLigado = estaComFarolLigado;
    }

    public void acelerar(){

    }
    public void desacelerar(){

    }
    public void ligarFarol(){

    }
    public abstract void utilizarHabilidadeEspecial();

}