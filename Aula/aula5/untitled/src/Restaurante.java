public class Restaurante {
    private ArrayList<Prato> cardapio;

    public Restaurante() {
        inicializaCardapio();
    }
    private static void inicializaCardapio(){
        cardapio = new ArrayList<>();
        cardapio.add(new Prato(1, nome: "Feijoada", preco: 45.00));
        cardapio.add(new Prato(2, nome: "Baião de dois", preco: 32.00));
        cardapio.add(new Prato(3, nome: "Strogonoff", preco: 42.00));
    }

    public static String retonarPratosNoCardapio(){
        inicializaCardapio();
        StringBuilder pratos = new StringBuilder();
        for (int i = 0; i < cardapio.size(); i++) {
            pratos.append(i+1)
                    .append(". ")
                    .append(cardapio.get(i).getNome())
                    .append(" - ")
                    .append(cardapio.get(i).getPreco())
                    .append("R$\n");
        }
        return pratos.toString();
    }

    public ArrayList<Prato> getCardapio() {
        return cardapio;
    }

    public void setCardapio(ArrayList<Prato> cardapio) {
        this.cardapio = cardapio;
    }

    public void adicionarNoCardapio(Prato prato){
        this.cardapio.add(prato);
    }
}
