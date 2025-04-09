import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private static final String type = "water";
    private static final List<String> attacks = Arrays.asList("Surf", "HydroPump", "HydroCannon", "RainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Surf on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + " loses 30 HP");
                enemy.setHp(enemy.getHp() - 30);
                break;

            case "electric":
                System.out.println(enemy.getName() + " loses 20 HP");
                enemy.setHp(enemy.getHp() - 20);
                break;

            case "grass":
                System.out.println(enemy.getName() + " loses 15 HP");
                enemy.setHp(enemy.getHp() - 15);
                break;

            default:
                System.out.println(enemy.getName() + " loses 10 HP");
                enemy.setHp(enemy.getHp() - 10);

        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Hydro Pump on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + "loses 60 HP");
                enemy.setHp(enemy.getHp() - 60);
                break;

            case "electric":
                System.out.println(enemy.getName() + " loses 45 HP");
                enemy.setHp(enemy.getHp() - 45);
                break;

            case "grass":
                System.out.println(enemy.getName() + " loses 30 HP");
                enemy.setHp(enemy.getHp() - 30);
                break;

            default:
                System.out.println(enemy.getName() + " loses 15 HP");
                enemy.setHp(enemy.getHp() - 15);

        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Hydro Cannon on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + "loses 40 HP");
                enemy.setHp(enemy.getHp() - 40);
                break;

            case "electric":
                System.out.println(enemy.getName() + " loses 20 HP");
                enemy.setHp(enemy.getHp() - 20);
                break;

            case "grass":
                System.out.println(enemy.getName() + " loses 10 HP");
                enemy.setHp(enemy.getHp() - 10);
                break;

            default:
                System.out.println(enemy.getName() + " loses 5 HP");
                enemy.setHp(enemy.getHp() - 5);

        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Surf on " + enemy.getName());
        switch (enemy.getType()) {
            case "fire":
                System.out.println(enemy.getName() + "loses 25 HP");
                enemy.setHp(enemy.getHp() - 25);
                break;

            case "electric":
                System.out.println("Rain dance has no effect on " + enemy.getName());
                enemy.setHp(enemy.getHp());
                break;

            case "grass":
                System.out.println(enemy.getName() + " gained 15 HP");
                enemy.setHp(enemy.getHp() + 15);
                break;

            default:
                System.out.println(enemy.getName() + " loses 10 HP");
                enemy.setHp(enemy.getHp() - 10);

        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " left.");
    }

    List<String> getAttacks() {
        return attacks;
    }
}