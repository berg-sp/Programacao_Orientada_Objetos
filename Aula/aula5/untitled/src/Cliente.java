import javax.swing.*;
import java.util.ArrayList;

public class Cliente {
    private int id;
    private String nome;
    private ArrayList<Pedido> pedidos;

    public Cliente() {
        this.pedidos = new ArrayList<>();
    }

    public CLiente(int id, String nome, ArrayList<Pedido> pedidos) {
        this.id new ArrayList<>();
        this.nome = nome;
        this.pedidos = pedidos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static ArrayList<Pedido> getPedidos(){
        return pedidos;
    }

    public void adicionarPedidos(){
        pedidos.add(new Pedido())
        String cardapio = Restaurante.retornarPratosNoCardapio();
        String resposta = JOptionPane.showInputDialog("Escolha o numero do prato que quer adicionar ao seu pedido:\n\n" + cardapio);
        int pratoEscolhido = Interger.parseInt(resposta);
        Prato prato = Restaurante.getCardapio().get(pratoEscolhido - 1);
    }

}