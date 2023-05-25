import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        int idade;
        try {
            idade = scanner.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Insira uma idade do tipo numerico");
        }
    }
}