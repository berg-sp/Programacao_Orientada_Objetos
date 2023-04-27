import java.util.ArrayList;

public class Grupo {
    private ArrayList<Heroi> herois;

    private int totalMoedasDeOuro;

    public void adicionarHeroi(Heroi heroi) {
        // verificar se heroi já existe
        for (int i = 0; i < this.herois.size(); i++) {
            Heroi item = this.herois.get(i);
            if (item.getId() == heroi.getId()) {
                System.out.println("O herói já está no grupo");
                return;
            }
        }

        this.herois.add(heroi); // adiciona o herói na lista
        this.totalMoedasDeOuro = this.totalMoedasDeOuro + heroi.getQuantidadeDeMoedaDeOuro(); // atualiza o total de moedas

        System.out.println("O heroi " + this.totalMoedasDeOuro + " foi adicionado ao grupo!");
    }

    public Grupo(){
        this.herois = new ArrayList<>();
    }

    public ArrayList<Heroi> getHerois() {
        return herois;
    }

    public void setHerois(ArrayList<Heroi> herois) {
        this.herois = herois;
    }

    public int getTotalMoedasDeOuro() {
        return totalMoedasDeOuro;
    }

    public void setTotalMoedasDeOuro(int totalMoedasDeOuro) {
        this.totalMoedasDeOuro = totalMoedasDeOuro;
    }

    public void removerHeroi(int id) {
    }
}