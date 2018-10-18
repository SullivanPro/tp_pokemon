import java.util.ArrayList;

public class Tournoi {

    private ArrayList<Pokemon> pokemons;

    public Tournoi() {
        this.pokemons = new ArrayList<>();
    }

    /**
     * @return the list of pokemons
     */
    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    /**
     * @param Arraylist(Pokemon) the list of pokemons
     */
    public void setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    /**
     * Start the tournament
     */
    public void startTournament() {
        Pokemon pokemon1 = null;
        Pokemon pokemon2 = null;

        while (this.getPokemons().size() > 1) {
            Tournoi obj = new Tournoi();
            pokemon1 = Utilities.getRandom(this.getPokemons());
            pokemon2 = Utilities.getRandom(this.getPokemons());
            while(pokemon1 == pokemon2)
                pokemon2 = Utilities.getRandom(this.getPokemons());

            fightTwoPokemons(pokemon1, pokemon2);
        }
    }

    /**
     * Fight between two pokemons
     * @param pokemon1(Pokemon) the first fighter
     * @param pokemon1(Pokemon) the second fighter
     */
    public void fightTwoPokemons(Pokemon pokemon1, Pokemon pokemon2) {
        System.out.println("---------------------------------");
        System.out.println("Deux pokémons ont été choisis :");
        System.out.println(pokemon1.fightCry());
        System.out.println(pokemon2.fightCry());
        System.out.println("---------------------------------");
        do{
            if(pokemon1.getLvlLife() >= 1) {
                System.out.println(pokemon1.getName() + "(" + pokemon1.getLvlLife() + "pv) attaque " + pokemon2.getName() + "(" +pokemon2.getLvlLife()+ "pv), il perd " + pokemon1.getLvlPower() + " de vie");
                pokemon2.setLvlLife(pokemon2.getLvlLife() - pokemon1.getLvlPower());
            }

            if(pokemon2.getLvlLife() >= 1) {
                System.out.println(pokemon2.getName() + "(" + pokemon2.getLvlLife() + "pv) attaque " + pokemon1.getName() + "(" +pokemon1.getLvlLife()+ "pv), il perd " + pokemon2.getLvlPower() + " de vie");
                pokemon1.setLvlLife(pokemon1.getLvlLife() - pokemon2.getLvlPower());
            }
        }
        while(pokemon1.getLvlLife() >= 1 && pokemon2.getLvlLife() >= 1);
        if(pokemon1.getLvlLife() < 1) {
            System.out.println(pokemon1.defeatCry());
            pokemons.remove(pokemon1);
            System.out.println(pokemon2.victoryCry());
        } else {
            System.out.println(pokemon2.defeatCry());
            pokemons.remove(pokemon2);
            System.out.println(pokemon1.victoryCry());
        }
    }
}
