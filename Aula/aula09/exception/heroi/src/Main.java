import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Heroi heroi = new Heroi();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("nomes.txt"));

            String nome = reader.readLine();
            System.out.println(nome);
        } catch (IOException exception) {
            System.out.println("O arquivo não existe...");
        }
    }
}