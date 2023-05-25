import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/names.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException exception) {
            System.setProperty("java.util.logging.config.file", "src/logging.properties");
            Logger LOGGER = Logger.getLogger(Main.class.getName());
            LOGGER.log(Level.SEVERE, "O arquivo não pôde ser aberto", exception);
        }
    }
}