import entity.Player;
import item.Weapon;

import java.util.Scanner;

import static enums.ClassType.MAGE;
import static enums.ItemRarity.RARE;
import static enums.Race.HUMAN;
import static enums.WeaponType.SWORD;

public class Main {
    public static void main(String[] args) {

        String playerName;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        playerName = scanner.nextLine();

        Player player = new Player(playerName, HUMAN, MAGE);
        Weapon weapon = new Weapon("SD", RARE, SWORD);

        String example = player.getName() + ", a " +
                player.getRace() + " " + player.getClassType() + ", has " +
                player.getMaxHealth() + " HP and " + player.getMaxStamina() + " stamina points." +
                " They have " + player.getBaseDefense() + " defense.";

        System.out.println(example);

        player.takeDamage(15);

        System.out.println(player);

        System.out.println(player.getName() + " was hit, health now " + player.getCurrentHealth());

        player.heal(100);

        System.out.println(player.getName() + " was healed, health now " + player.getCurrentHealth());

        player.heal(10);

        System.out.println(player.getCurrentHealth());


        System.out.println(player);

        System.out.println(player.equals(new Player("bill", HUMAN, MAGE)));

        System.out.println(weapon.weaponDamage());
    }
}
