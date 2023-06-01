import java.util.HashMap;
import java.util.Map;

public class Pokedex {
    private Map<String, Pokemon> pokemon;
    public Pokedex() {
        this.pokemon = new HashMap<>();
    }
    public Map<String, Pokemon> getPokemon() {
        return pokemon;
    }

    public void adicionarPokemon(Pokemon pokemon) {
        String codigoIdentificador = pokemon.getCodigoIdentificador();
        this.pokemon.put(codigoIdentificador, pokemon);
    }
}