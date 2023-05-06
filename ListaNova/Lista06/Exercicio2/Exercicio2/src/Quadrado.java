public class Quadrado implements FormaGeometrica{

    @Override
    public double calcularArea(double base, double altura){
        double area = base * altura;
        return area;
    }
}