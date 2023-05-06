public class Flautista implements Musico{
    @Override
    public void tocar() {
        Audio.reproduzirAudio("flauta");
        System.out.println("Esse foi o solo do flautista");
    }
}
