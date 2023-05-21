public class Main {
    public static void funcaoInterna() {
        System.out.println("Eu sou uma função interna");
    }

    public static void funcaoExterna() {
        System.out.println("Eu sou uma função externa");
    }

    public static void main(string[] args) {
        funcaoExterna();
    }
}