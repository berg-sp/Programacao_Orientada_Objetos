import java.util.ArrayList;
import java.util.List;

public class Banda {
    private List<Musico> musicos;

    public Banda() {
        this.musicos = new ArrayList<>();
    }

    public List<Musico> getMusicos() {
        return musicos;
    }

    public void adicionarMusico(Musico musico) {
        this.musicos.add(musico);
    }
    public void realizarSolos() throws InterruptedException{
        for(Musico musico : this.musicos){
            musico.tocar();
            Thread.sleep(10000);
        }
    }
}