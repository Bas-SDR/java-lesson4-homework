import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private static final String type = "electric";
    private static final List<String> attacks = Arrays.asList("ThunderPunch", "ElectroBall", "Thunder", "VoltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Volt Tackle on " + enemy.getName());
        switch (enemy.getType()) {
            case "water":
                System.out.println(enemy.getName() + " loses 40 HP");
                enemy.setHp(enemy.getHp() - 40);
                break;

            case "grass":
                System.out.println(enemy.getName() + " loses 30 HP");
                enemy.setHp(enemy.getHp() - 30);
                break;

            case "fire":
                System.out.println(enemy.getName() + " loses 20 HP");
                enemy.setHp(enemy.getHp() - 20);
                break;

            default:
                System.out.println(enemy.getName() + " loses 10 HP");
                enemy.setHp(enemy.getHp() - 10);

        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left.");
    }

    void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Thunder on " + enemy.getName());
        switch (enemy.getType()) {
            case "water":
                System.out.println(enemy.getName() + " loses 50 HP and " + name.getName() + " gained 20 HP");
                enemy.setHp(enemy.getHp() - 50);
                name.setHp(name.getHp() + 20);
                break;

            case "grass":
                System.out.println(enemy.getName() + " loses 40 HP and " + name.getName() + " gained 20 HP");
                enemy.setHp(enemy.getHp() - 40);
                name.setHp(name.getHp() + 20);
                break;

            case "fire":
                System.out.println(enemy.getName() + " loses 30 HP and " + name.getName() + " gained 20 HP");
                enemy.setHp(enemy.getHp() - 30);
                name.setHp(name.getHp() + 20);
                break;

            default:
                System.out.println(enemy.getName() + " gained 20 HP and " + name.getName() + " gained 20 HP");
                enemy.setHp(enemy.getHp() + 20);
                name.setHp(name.getHp() + 20);

        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left.");
        System.out.println(name.getName() + " has " + name.getHp() + " HP left.");
    }

    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Electro Ball on " + enemy.getName());
        switch (enemy.getType()) {
            case "water":
                System.out.println(enemy.getName() + " loses 30 HP");
                enemy.setHp(enemy.getHp() - 30);
                break;

            case "grass":
                System.out.println(enemy.getName() + " loses 20 HP");
                enemy.setHp(enemy.getHp() - 20);
                break;

            case "fire":
                System.out.println(enemy.getName() + " loses 10 HP");
                enemy.setHp(enemy.getHp() - 10);
                break;

            default:
                System.out.println(enemy.getName() + " loses 5 HP");
                enemy.setHp(enemy.getHp() - 5);

        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left.");
    }

    void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Thunder Punch on " + enemy.getName());
        switch (enemy.getType()) {
            case "water":
                System.out.println(enemy.getName() + " loses 45 HP");
                enemy.setHp(enemy.getHp() - 45);
                break;

            case "grass":
                System.out.println(enemy.getName() + " loses 30 HP");
                enemy.setHp(enemy.getHp() - 30);
                break;

            case "fire":
                System.out.println(enemy.getName() + " loses 15 HP");
                enemy.setHp(enemy.getHp() - 15);
                break;

            default:
                System.out.println(enemy.getName() + " loses 5 HP");
                enemy.setHp(enemy.getHp() - 5);

        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left.");
    }

    List<String> getAttacks() {
        return attacks;
    }
}
