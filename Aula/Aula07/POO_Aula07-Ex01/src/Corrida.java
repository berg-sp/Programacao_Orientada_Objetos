import java.util.ArrayList;
import java.util.List;

public class Corrida {
    private List<Veiculo> veiculos;

    public Corrida() {
        this.veiculos = new ArrayList<>();
    }

    public void adicionarVeiculos(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }

    public void iniciarCorrida() {
        for (Veiculo veiculo : this.veiculos){
            veiculo.acelerar();
        }
    }
}
