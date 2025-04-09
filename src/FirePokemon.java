import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private static final String type = "fire";
    private static final List<String> attacks = Arrays.asList("FireLash", "FlameThrower", "PyroBall", "Inferno");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Fire Lash on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass":
                System.out.println(enemy.getName() + "loses 40 HP");
                enemy.setHp(enemy.getHp() - 40);
                break;

            case "water":
                System.out.println(enemy.getName() + " loses 30 HP");
                enemy.setHp(enemy.getHp() - 30);
                break;

            case "electric":
                System.out.println(enemy.getName() + " loses 20 HP");
                enemy.setHp(enemy.getHp() - 20);
                break;

            default:
                System.out.println(enemy.getName() + " loses 10 HP");
                enemy.setHp(enemy.getHp() - 10);

        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left.");
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Fire Lash on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass":
                System.out.println(enemy.getName() + "loses 50 HP");
                enemy.setHp(enemy.getHp() - 50);
                break;

            case "water":
                System.out.println(enemy.getName() + " loses 35 HP");
                enemy.setHp(enemy.getHp() - 35);
                break;

            case "electric":
                System.out.println(enemy.getName() + " loses 20 HP");
                enemy.setHp(enemy.getHp() - 20);
                break;

            default:
                System.out.println(enemy.getName() + " loses 5 HP");
                enemy.setHp(enemy.getHp() - 5);

        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left.");
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Fire Lash on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass":
                System.out.println(enemy.getName() + "loses 25 HP");
                enemy.setHp(enemy.getHp() - 25);
                break;

            case "water":
                System.out.println(enemy.getName() + " loses 20 HP");
                enemy.setHp(enemy.getHp() - 20);
                break;

            case "electric":
                System.out.println(enemy.getName() + " loses 15 HP");
                enemy.setHp(enemy.getHp() - 15);
                break;

            default:
                System.out.println(enemy.getName() + " loses 10 HP");
                enemy.setHp(enemy.getHp() - 10);

        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left.");
    }

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Inferno on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass":
                System.out.println(enemy.getName() + "loses 60 HP");
                enemy.setHp(enemy.getHp() - 60);
                break;

            case "water":
                System.out.println(enemy.getName() + " loses 40 HP");
                enemy.setHp(enemy.getHp() - 40);
                break;

            case "electric":
                System.out.println(enemy.getName() + " loses 20 HP");
                enemy.setHp(enemy.getHp() - 20);
                break;

            default:
                System.out.println(enemy.getName() + " loses no HP");
                enemy.setHp(enemy.getHp() - 0);

        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left.");
    }

    List<String> getAttacks() {
        return attacks;
    }
}