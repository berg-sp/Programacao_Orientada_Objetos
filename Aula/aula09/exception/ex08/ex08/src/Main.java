public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.adicionarElemento(new Aluno("Fulano"));
        lista.adicionarElemento(new Aluno("Beltrano"));
        lista.adicionarElemento(new Aluno("Ciclano"));
        lista.adicionarElemento(new Aluno("Dicano"));

        for (int i = 0; i < lista.elementos.length; i++) {
            System.out.println(lista.elementos[i]);
        }
    }
}