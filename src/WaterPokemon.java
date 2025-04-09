import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private static final String type = "water";
    private static final List<String> attacks = Arrays.asList("Surf", "HydroPump", "HydroCannon", "RainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    void surf(Pokemon name, Pokemon enemy);

    void hydroPump(Pokemon name, Pokemon enemy);

    void hydroCanon(Pokemon name, Pokemon enemy);

    void rainDance(Pokemon name, Pokemon enemy);

    List<String> getAttacks() {
        return attacks;
    }
}