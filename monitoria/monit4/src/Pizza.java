public class Pizza {
    private String sabor;
    private double preco;

    public Pizza(){}

    public Pizza(String sabor, double preco){
        this.sabor = sabor;
        this.preco = preco;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
