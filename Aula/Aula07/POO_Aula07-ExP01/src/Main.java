public class Main {
    public static void main(String[] args) {
        Banda banda = new Banda();
        banda.adicionarMusico(new Flautista());
        banda.adicionarMusico(new Violinista());
        banda.adicionarMusico(new Trompetista());

        banda.realizarSolos();
    }
}