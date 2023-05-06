public class Triangulo implements FormaGeometrica{

    @Override
    public double calcularArea(double base, double altura){
        double area = (base * altura) / 2;
        return area;
    }
}

/*Para calcular a area de um triangulo utilize a seguinte formula:
area = (base * altura) / 2*/