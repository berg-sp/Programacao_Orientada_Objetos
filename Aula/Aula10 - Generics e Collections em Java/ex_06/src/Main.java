public class Main {
    public static void main(String[] args) {
        Heroi heroi = new Heroi(1, "Lyn");
        heroi.adicionarQuest(1, new Quest("colinas", 100));
        heroi.adicionarQuest(2, new Quest("masmorras", 1000));
        heroi.adicionarQuest(3, new Quest("castelo", 2000));
    }
}