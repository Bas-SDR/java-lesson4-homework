import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{

    private static final String type = "electric";
    private static final List<String> attacks = Arrays.asList("ThunderPunch", "ElectroBall", "Thunder", "VoltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    void voltTackle(Pokemon name, Pokemon enemy) {
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
            case "electric":
                System.out.println(enemy.getName() + " loses 10 HP");
                enemy.setHp(enemy.getHp() - 10);
        }
    }

    void thunder(Pokemon name, Pokemon enemy){
        switch(enemy.getType()) {
            case "water":
                System.out.println(enemy.getName() + " loses 50 HP");
                enemy.setHp(enemy.getHp() - 50);
            case "grass":
                System.out.println(enemy.getName() + " loses 40 HP");
                enemy.setHp(enemy.getHp() - 40);
            case "fire":
                System.out.println(enemy.getName() + " loses 30 HP");
                enemy.setHp(enemy.getHp() - 30);
            case "electric":
                System.out.println(enemy.getName() + " loses 20 HP");
                enemy.setHp(enemy.getHp() - 20);
        }
    }

    void electroBall(Pokemon name, Pokemon enemy){
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
            case "electric":
                System.out.println(enemy.getName() + " loses 5 HP");
                enemy.setHp(enemy.getHp() - 5);
        }
    }

    void thunderPunch(Pokemon name, Pokemon enemy){
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
            case "electric":
                System.out.println(enemy.getName() + " loses 5 HP");
                enemy.setHp(enemy.getHp() - 5);
        }
    }

    List<String> getAttacks() {
        return attacks;
    }
}
