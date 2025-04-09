import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{

    private static final String type = "electric";
    private static final List<String> attacks = Arrays.asList("ThunderPunch", "ElectroBall", "Thunder", "VoltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Volt Tackle on " + enemy.getName() );
        switch(enemy.getType()) {
            case "water":
                System.out.println(enemy.getName() + " loses 40 HP");
                enemy.setHp(enemy.getHp() - 40);
            case "grass":
                System.out.println(enemy.getName() + " loses 30 HP");
                enemy.setHp(enemy.getHp() - 30);
            case "fire":
                System.out.println(enemy.getName() + " loses 20 HP");
                enemy.setHp(enemy.getHp() - 20);
            default:
                System.out.println(enemy.getName() + " loses 10 HP");
                enemy.setHp(enemy.getHp() - 10);
        }
    }

    void thunder(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " used Thunder on " + enemy.getName() );
        switch(enemy.getType()) {
            case "water":
                System.out.println(enemy.getName() + " loses 50 HP and " + name.getName() + " gained 20 HP");
                enemy.setHp(enemy.getHp() - 50);
                name.setHp(name.getHp() + 20);
            case "grass":
                System.out.println(enemy.getName() + " loses 40 HP and " + name.getName() + " gained 20 HP");
                enemy.setHp(enemy.getHp() - 40);
                name.setHp(name.getHp() + 20);
            case "fire":
                System.out.println(enemy.getName() + " loses 30 HP and " + name.getName() + " gained 20 HP");
                enemy.setHp(enemy.getHp() - 30);
                name.setHp(name.getHp() + 20);
            default:
                System.out.println(enemy.getName() + " gained 20 HP and " + name.getName() + " gained 20 HP");
                enemy.setHp(enemy.getHp() + 20);
                name.setHp(name.getHp() + 20);
        }
    }

    void electroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " used Electro Ball on " + enemy.getName() );
        switch(enemy.getType()) {
            case "water":
                System.out.println(enemy.getName() + " loses 30 HP");
                enemy.setHp(enemy.getHp() - 30);
            case "grass":
                System.out.println(enemy.getName() + " loses 20 HP");
                enemy.setHp(enemy.getHp() - 20);
            case "fire":
                System.out.println(enemy.getName() + " loses 10 HP");
                enemy.setHp(enemy.getHp() - 10);
            default:
                System.out.println(enemy.getName() + " loses 5 HP");
                enemy.setHp(enemy.getHp() - 5);
        }
    }

    void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " used Thunder Punch on " + enemy.getName() );
        switch(enemy.getType()) {
            case "water":
                System.out.println(enemy.getName() + " loses 45 HP");
                enemy.setHp(enemy.getHp() - 45);
            case "grass":
                System.out.println(enemy.getName() + " loses 30 HP");
                enemy.setHp(enemy.getHp() - 30);
            case "fire":
                System.out.println(enemy.getName() + " loses 15 HP");
                enemy.setHp(enemy.getHp() - 15);
            default:
                System.out.println(enemy.getName() + " loses 5 HP");
                enemy.setHp(enemy.getHp() - 5);
        }
    }

    List<String> getAttacks() {
        return attacks;
    }
}
