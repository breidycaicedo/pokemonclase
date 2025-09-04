import java.util.Scanner;

public class Bichos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pokedex pokedex = new Pokedex();

        pokedex.agregarPokemon(new Pokemon("Pikachu", "Eléctrico", "Impactrueno"));
        pokedex.agregarPokemon(new Pokemon("Charmander", "Fuego", "Llamarada"));

        System.out.println("¿Cuántos Pokémon quieres registrar?");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < cantidad; i++) {
            System.out.println("Ingresa el nombre del Pokémon:");
            String nombre = sc.nextLine();

            System.out.println("Ingresa el tipo del Pokémon:");
            String tipo = sc.nextLine();

            System.out.println("Ingresa la habilidad del Pokémon:");
            String habilidad = sc.nextLine();

            Pokemon nuevo = new Pokemon(nombre, tipo, habilidad);
            pokedex.agregarPokemon(nuevo);
        }

        System.out.println("\nPokémon registrados:");
        pokedex.mostrarPokemon();

        sc.close();
    }
}
