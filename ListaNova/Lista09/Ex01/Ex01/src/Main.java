public class Main {
    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
        pokedex.adicionarPokemon(new Pokemon("#0001", "Bulbasaur", "grass"));
        pokedex.adicionarPokemon(new Pokemon("#0002", "Ivysaur", "grass"));
        pokedex.adicionarPokemon(new Pokemon("#0003", "Venusaur", "grass"));
        pokedex.adicionarPokemon(new Pokemon("#0004", "Charmander", "fire"));
        pokedex.adicionarPokemon(new Pokemon("#0005", "Charmeleon", "fire"));
        pokedex.adicionarPokemon(new Pokemon("#0006", "Charizard", "fire"));
        pokedex.adicionarPokemon(new Pokemon("#0007", "Squirtle", "water"));
        pokedex.adicionarPokemon(new Pokemon("#0008", "Wartotle", "water"));
        pokedex.adicionarPokemon(new Pokemon("#0009", "Blastoise", "water"));
        pokedex.adicionarPokemon(new Pokemon("#0010", "Caterpie", "bug"));
    }
}