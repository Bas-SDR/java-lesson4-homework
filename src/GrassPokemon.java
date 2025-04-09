import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private static final String type = "grass";
    private static final List<String> attacks = Arrays.asList("LeafStorm", "SolarBeam", "LeechSeed", "LeafBlade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Leaf Storm on " + enemy.getName());
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + "loses 25 HP");
                enemy.setHp(enemy.getHp() - 25);
                break;

            case "fire":
                System.out.println(enemy.getName() + " loses 20 HP");
                enemy.setHp(enemy.getHp() - 20);
                break;

            case "water":
                System.out.println(enemy.getName() + " loses 15 HP");
                enemy.setHp(enemy.getHp() - 15);
                break;

            default:
                System.out.println(enemy.getName() + " loses 10 HP");
                enemy.setHp(enemy.getHp() - 10);

        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left.");
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Solar Beam on " + enemy.getName());
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + "loses 40 HP");
                enemy.setHp(enemy.getHp() - 40);
                break;

            case "fire":
                System.out.println(enemy.getName() + " loses 30 HP");
                enemy.setHp(enemy.getHp() - 30);
                break;

            case "water":
                System.out.println(enemy.getName() + " loses 15 HP");
                enemy.setHp(enemy.getHp() - 15);
                break;

            default:
                System.out.println(enemy.getName() + " loses 5 HP");
                enemy.setHp(enemy.getHp() - 5);

        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left.");
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Leech Seed on " + enemy.getName());
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + "loses 20 HP and " + name.getName() + " gained 20 HP");
                enemy.setHp(enemy.getHp() - 20);
                name.setHp(name.getHp() + 20);
                break;

            case "fire":
                System.out.println(enemy.getName() + " loses 15 HP and " + name.getName() + " gained 15 HP");
                enemy.setHp(enemy.getHp() - 15);
                name.setHp(name.getHp() + 15);
                break;

            case "water":
                System.out.println(enemy.getName() + " loses 10 HP and " + name.getName() + " gained 10 HP");
                enemy.setHp(enemy.getHp() - 10);
                name.setHp(name.getHp() + 10);
                break;

            default:
                System.out.println(enemy.getName() + " loses 5 HP and " + name.getName() + " gained 5 HP");
                enemy.setHp(enemy.getHp() - 5);
                name.setHp(name.getHp() + 5);

        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left.");
        System.out.println(name.getName() + " has " + name.getHp() + " HP left.");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Leaf Blade on " + enemy.getName());
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + "loses 30 HP");
                enemy.setHp(enemy.getHp() - 30);
                break;

            case "fire":
                System.out.println(enemy.getName() + " loses 25 HP");
                enemy.setHp(enemy.getHp() - 25);
                break;

            case "water":
                System.out.println(enemy.getName() + " loses 20 HP");
                enemy.setHp(enemy.getHp() - 20);
                break;

            default:
                System.out.println(enemy.getName() + " loses 15 HP");
                enemy.setHp(enemy.getHp() - 15);

        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left.");
    }

    List<String> getAttacks() {
        return attacks;
    }
}