import java.util.ArrayList;

public class PokemonController {
    private ArrayList<Pokemon> lista;

    public PokemonController() {
        lista = new ArrayList<>();
    }

    public void agregarPokemon(String nombre, String tipo, String habilidad) {
        Pokemon nuevo = new Pokemon(nombre, tipo, habilidad);
        lista.add(nuevo);
    }

    public void mostrarPokemon() {
        for(Pokemon p : lista) {
            System.out.println(p.toString());
        }
    }

    public void datosQuemados() {
        agregarPokemon("Pikachu", "Eléctrico", "Impactrueno");
        agregarPokemon("Charmander", "Fuego", "Llamarada");
    }
}
