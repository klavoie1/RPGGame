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

        Weapon weapon = new Weapon("Sword_1", RARE, SWORD, "Tester");
        Player player = new Player(playerName, HUMAN, MAGE);

        player.takeDamage(weapon.weaponDamage());

        System.out.println(player.playerStats());

        System.out.println(player.getName() + " was hit, health now " + player.getCurrentHealth());

        player.heal(100);

        System.out.println(player.getName() + " was healed, health now " + player.getCurrentHealth());

        player.heal(10);

        System.out.println(player.getCurrentHealth());

        System.out.println(player);

        System.out.println(weapon.weaponDamage());

        System.out.println(player.playerStats());
    }
}
