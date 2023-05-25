public class Main {
    public static void main(String[] args) {
        Grupo grupo = new Grupo();
        try {
            grupo.adicionarHeroi(new Heroi("Marcus", "LADINO"));
        } catch (CategoriaInvalidaException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Insira uma das quatro categorias:\nCAVALEIRO\nESPADACHIM\nARQUEIRO\nBARBARO");
        }
    }
}