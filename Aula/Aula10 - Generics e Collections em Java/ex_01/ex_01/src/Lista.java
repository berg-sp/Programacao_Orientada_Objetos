public class Lista {
    private Object[] elementos;
    public Lista() {
        elementos = new Object[0];
    }
    public void adicionarElemento(Object elemento) {
        int tamanhoLista = elementos.length;
        Object[] novoArray = new Object[tamanhoLista + 1];
        for (int i = 0; i < elementos.length; i++) {
            novoArray[i] = elementos[i];
        }
        elementos = novoArray;
        elementos[tamanhoLista] = elemento;
    }
    public Object[] getElementos() {
        return elementos;
    }
}