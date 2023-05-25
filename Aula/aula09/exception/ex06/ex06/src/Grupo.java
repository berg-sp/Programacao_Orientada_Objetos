import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private List<Heroi> herois;

    public Grupo(){
        this.herois = new ArrayList<>();
    }
    public void adicionarHeroi(Heroi heroi) throws CategoriaInvalidaException {
        String categoria = heroi.getCategoria();
        switch (categoria){
            case "ARQUEIRO":
                heroi.setArma(Arma.ARCO);
                break;
            case "BARBARO":
                heroi.setArma(Arma.MACHADO);
                break;
            case "CAVALEIRO":
                heroi.setArma(Arma.LANCA);
                break;
            case "ESPADACHIM":
                heroi.setArma(Arma.ESPADA);
                break;
            default:
                throw new CategoriaInvalidaException("Categoria inválida!");
        }

        this.herois.add(heroi);
    }
}