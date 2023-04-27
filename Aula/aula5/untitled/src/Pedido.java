import java.util.ArrayList;

public class Pedido {
    private int id;
    private int idCliente;
    private ArrayList<Prato> pratos;

    public Pedido() {
        this.pratos =new ArrayList<>();
    }

    public Pedido(int id, int idCliente){
        this.id = id;
        this.idCliente = idCliente;
        this.pratos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getIdCliente() {
        return id;
    }

    public void setIdCliente(int idCliente) {
        this.id = idCliente;
    }
    public ArrayList<Prato> getPratos() {
        return pratos;
    }

    public void adicionarPrato(Prato prato) {
        this.pratos.add(prato);
    }
}
