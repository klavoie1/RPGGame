import entity.Player;
import entity.Weapon;
import enums.ItemRarity;
import enums.WeaponType;

import java.util.Scanner;

import static enums.ClassType.MAGE;
import static enums.Race.HUMAN;

public class Main {
    public static void main(String[] args) {

        String playerName;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        playerName = scanner.nextLine();

        Player player = new Player(playerName, HUMAN, MAGE);

        String example = player.getName() + ", a " +
                player.getRace() + " " + player.getClassType() + ", has " +
                player.getMaxHealth() + " HP and " + player.getMaxStamina() + " stamina points." +
                " They have " + player.getBaseDefense() + " defense.";

        System.out.println(example);

        player.takeDamage(15);

        System.out.println(player.getName() + " was hit, health now " + player.getCurrentHealth());

        player.heal(100);

        System.out.println(player.getName() + " was healed, health now " + player.getCurrentHealth());

        player.heal(10);

        System.out.println(player.getCurrentHealth());


    }
}
