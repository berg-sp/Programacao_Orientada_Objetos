public class Luta {
    Lutador lutador1 = Lutador();
    Lutador lutador2 = Lutador();
    public void apresentar(){
        System.out.println("De um lado, pesando " + lutador1.peso) + "kg , temos" + lutador1.nome);
        System.out.println("do outro lado, pesando " + lutador2.peso) + "kg , temos" + lutador2.nome);
    }
    public void iniciarLuta(){
        System.out.println("Lutador 1', golpeou: ");
        lutador1.golpear();
        System.out.println("Lutador 2', golpeou: ");
        lutador2.golpear();
    }
}
