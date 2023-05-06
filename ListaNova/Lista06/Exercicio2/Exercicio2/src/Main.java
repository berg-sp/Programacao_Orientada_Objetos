public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();

        double areaQuadrado = quadrado.calcularArea(2, 3);
        System.out.println("Área quadrado: " + areaQuadrado);
        double areaTriangulo = triangulo.calcularArea(2, 3);
        System.out.println("Área triangulo: " + areaTriangulo);
    }
}