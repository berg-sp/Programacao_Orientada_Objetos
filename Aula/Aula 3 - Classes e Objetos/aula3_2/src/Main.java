public class Main {
    public static void main(String[] args) {
        Artista artista1 = new Artista();
        artista1.nome = "Confraria da Costa";

        Artista artista2 = new Artista();
        artista2.nome = "Orquestra brasileira de musica Jamaicana";

        Show show = new Show();
        show.nome = "Meu show";
        show.artistas.add(artista1);
        show.artistas.add(artista2);

        for (int i = 0; i < show.artistas.size(); i++) {
            System.out.println(show.artistas.get(i).nome);
        }
    }

}