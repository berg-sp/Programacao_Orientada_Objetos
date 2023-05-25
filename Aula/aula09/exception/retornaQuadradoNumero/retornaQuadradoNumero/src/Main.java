public class Main {
    public static int retornaNumero(int numero) {
        return numero;
    }

    public static int retornaQuadradoNumero(int numero){

        return numero * numero;
    }

    public static void main(String[] args) {

        int resultado = retornaQuadradoNumero(retornaNumero(2));
    }
}

//Murilo
// func2 --> retornaNumero
// func1 --> retornaQuadrado
// Main

//Paulo
// func2 --> retornaQuadrado
// func1 --> retornaNumero
// Main