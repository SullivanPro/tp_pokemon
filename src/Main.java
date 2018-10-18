import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();

        Pokemon pikachu = new Pokemon("Pikachu", 120.0, 80.0);
        pokemons.add(pikachu);
        Pokemon bulbizarre = new Pokemon("Bulbizarre", 120.0, 50.0);
        pokemons.add(bulbizarre);
        Pokemon dracolosse = new Pokemon("Dracolosse", 90.0, 40.0);
        pokemons.add(dracolosse);
        Pokemon machoc = new Pokemon("Machoc", 150.0, 30.0);
        pokemons.add(machoc);

        Tournoi tournoi = new Tournoi();
        tournoi.setPokemons(pokemons);

        tournoi.startTournament();
    }




}

