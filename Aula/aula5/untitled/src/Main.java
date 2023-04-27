import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog (parentComponent: null, message: "Bem vindo(a) ao nosso restaurante");
        Cliente cliente = new Cliente(id: 1, nome);

        cliente.adicionarPedidos();

    }

}
