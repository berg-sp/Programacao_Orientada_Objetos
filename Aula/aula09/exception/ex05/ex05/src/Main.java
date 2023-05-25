import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();

        if(nome.equalsIgnoreCase("João")) {
            throw new Exception("João, não");
        }
    }
}