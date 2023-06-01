import java.util.HashMap;
import java.util.Map;

public class Heroi {
    private int id;
    private String nome;
    private Map<String, Quest> quests = new HashMap<>();

    public Heroi(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
}
