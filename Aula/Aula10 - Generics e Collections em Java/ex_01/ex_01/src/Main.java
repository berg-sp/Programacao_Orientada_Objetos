public class Main {
    public static void main(String[] args) {
        Caixa<BomBom> caixa = new Caixa<>();
        //Caixa<Sorvete> caixa = new Caixa<>();
        caixa.setElemento(new BomBom());
        //caixa.setElemento(new Sorvete());
        caixa.imprimePeso();
        /*
        ListaCircular<String> listaCircular = new ListaCircular<>();
        listaCircular.adicionarElemento("Pavi");
        listaCircular.adicionarElemento("Ramos");
        listaCircular.adicionarElemento("Jose");
        listaCircular.adicionarElemento("Maria");
        listaCircular.adicionarElemento("Clara");

        listaCircular.imprimirLista();

        Pote<Sorvete> pote = new Pot  e<>();
        pote.setElemento(new Feijao());

        Caixa<Sapato> caixa = new Caixa<>();
        caixa.setElemento(new Sapato());

        Lista lista = new Lista();
        lista.adicionarElemento("Berg");
        lista.adicionarElemento(42);
        lista.adicionarElemento(1.76);
        lista.adicionarElemento(true);

        for (int i = 0; i < lista.getElementos().length; i++) {
            if(lista.getElementos()[i] instanceof String) {
                System.out.println((String) ((String) lista.getElementos()[i]).toUpperCase());
            }
        }*/
    }
}