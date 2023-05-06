public class Violinista implements Musico {
    @Override
    public void tocar() {
        Audio.reproduzirAudio("violino");
        System.out.println("Esse foi o solo do violinista");
    }
}
