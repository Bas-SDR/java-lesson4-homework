import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private static final String type = "grass";
    private static final List<String> attacks = Arrays.asList("ThunderPunch", "ElectroBall", "Thunder", "VoltTackle");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Leaf Storm on " + enemy.getName());
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + "loses 25 HP");
                enemy.setHp(enemy.getHp() - 25);
            case "fire":
                System.out.println(enemy.getName() + " loses 20 HP");
                enemy.setHp(enemy.getHp() - 20);
            case "water":
                System.out.println(enemy.getName() + " loses 15 HP");
                enemy.setHp(enemy.getHp() - 15);
            default:
                System.out.println(enemy.getName() + " loses 10 HP");
                enemy.setHp(enemy.getHp() - 10);
        }
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Solar Beam on " + enemy.getName());
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + "loses 40 HP");
                enemy.setHp(enemy.getHp() - 40);
            case "fire":
                System.out.println(enemy.getName() + " loses 30 HP");
                enemy.setHp(enemy.getHp() - 30);
            case "water":
                System.out.println(enemy.getName() + " loses 15 HP");
                enemy.setHp(enemy.getHp() - 15);
            default:
                System.out.println(enemy.getName() + " loses 5 HP");
                enemy.setHp(enemy.getHp() - 5);
        }
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Leech Seed on " + enemy.getName());
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + "loses 20 HP and " + name.getName() + " gained 20 HP");
                enemy.setHp(enemy.getHp() - 20);
                name.setHp(name.getHp() + 20);
            case "fire":
                System.out.println(enemy.getName() + " loses 15 HP and " + name.getName() + " gained 15 HP");
                enemy.setHp(enemy.getHp() - 15);
                name.setHp(name.getHp() + 15);
            case "water":
                System.out.println(enemy.getName() + " loses 10 HP and " + name.getName() + " gained 10 HP");
                enemy.setHp(enemy.getHp() - 10);
                name.setHp(name.getHp() + 10);
            default:
                System.out.println(enemy.getName() + " loses 5 HP and " + name.getName() + " gained 5 HP");
                enemy.setHp(enemy.getHp() - 5);
                name.setHp(name.getHp() + 5);
        }
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Leaf Blade on " + enemy.getName());
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + "loses 30 HP");
                enemy.setHp(enemy.getHp() - 30);
            case "fire":
                System.out.println(enemy.getName() + " loses 25 HP");
                enemy.setHp(enemy.getHp() - 25);
            case "water":
                System.out.println(enemy.getName() + " loses 20 HP");
                enemy.setHp(enemy.getHp() - 20);
            default:
                System.out.println(enemy.getName() + " loses 15 HP");
                enemy.setHp(enemy.getHp() - 15);
        }
    }

    List<String> getAttacks() {
        return attacks;
    }
}