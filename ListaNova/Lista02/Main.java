import java.util.Scanner;

public class Main {
    static String verificaCategoriaNadador(int idade) {
        if (idade >= 5 && idade <= 7) {
            return "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            return "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            return "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            return "Juvenil B";
        } else if (idade >= 18) {
            return "Adulto";
            }
        return "Idade inválida, digite novamente.";
    }
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();

        String categoria = verificaCategoriaNadador(idade);
        System.out.println("Categoria: " + categoria);
    }
}