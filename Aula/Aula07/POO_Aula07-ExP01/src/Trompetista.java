public class Trompetista implements Musico{
    @Override
    public void tocar() {
        Audio.reproduzirAudio("trompete");
        System.out.println("Esse foi o solo do trompetista");
    }
}
