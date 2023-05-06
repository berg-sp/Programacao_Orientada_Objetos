import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;

public class Audio {
    public static void reproduzirAudio(String nomeArquivo) {
        try{
            File caminhoMusica = new File("C:\\Users\\bergb\\Downloads\\");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(caminhoMusica);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            SwingUtilities.invokeLater(new Runnable()) {
                public void run() {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        } catch (Exception e) {
            System.exit(0);
        }
    }
}
