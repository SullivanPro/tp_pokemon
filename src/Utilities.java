import java.util.ArrayList;
import java.util.Random;

public class Utilities {
    /**
     * Return a random pokemon
     * @param Arraylist(Pokemon) the list of pokemons
     */
    public static Pokemon getRandom(ArrayList<Pokemon> list) {
        int index = new Random().nextInt(list.size());
        return list.get(index);
    }
}
