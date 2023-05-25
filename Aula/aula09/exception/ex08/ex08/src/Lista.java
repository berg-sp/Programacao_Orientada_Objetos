public class Lista {
    Object[] elementos;
    public Lista(){
        this.elementos = new Object[10];
    }
    public void adicionarElemento(Object elemento) {
        if(elementos.length % 10 == 0) {
            int quociente = (elementos.length / 10) + 1;

            Object[] novaArray = new Object[elementos.length * 10];
            int i;
            for (i = 0; i < elementos.length; i++) {
                novaArray[i] = elementos[i];
            }
            novaArray[i] = elemento;
            this.elementos = novaArray;
        }
    }
}
