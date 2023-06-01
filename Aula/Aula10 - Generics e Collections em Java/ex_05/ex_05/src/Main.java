import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> dicionario = new HashMap<>();

        quests.put("encontrar 10 maçãs douradas", true);
        quests.put("derrote 3 goblins", false);

        if(quests.containsKey("derrote 3 goblins")) {
            quests.replace("derrote 3 goblins", true);
            System.out.println(quests.get("derrote 3 goblins"));
        }
    }
}