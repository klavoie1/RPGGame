import entity.Player;
import item.Weapon;

import java.util.Scanner;

import static enums.ClassType.MAGE;
import static enums.ItemRarity.COMMON;
import static enums.Race.HUMAN;
import static enums.WeaponType.SWORD;

class Main {
    public static void main(String[] args) {

        String playerName;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        playerName = scanner.nextLine();

        Weapon weapon = new Weapon("Sword_1", COMMON, SWORD);
        Player player = new Player(playerName, HUMAN, MAGE);

        player.takeDamage(weapon.weaponDamage());

        System.out.println(player.playerStats());

        System.out.println(player.getName() + " was hit, health now " + player.getCurrentHealth());

        player.heal(100);

        System.out.println(player.getName() + " was healed, health now " + player.getCurrentHealth());

        player.heal(10);

        System.out.println(player);

        System.out.println(weapon.weaponDamage());

        System.out.println(player.playerStats());

        System.out.println(weapon.toString());

        givePlayerSwordNameFromPlayer(scanner, weapon);

        System.out.println(weapon.toString());
    }

    public static void givePlayerSwordNameFromPlayer(Scanner scn, Weapon weapon) {
        System.out.println("Would you Like to give your weapon a name?");
        System.out.print("Y/N: ");
        String response = scn.nextLine();
        if (response.equalsIgnoreCase("y")) {
            System.out.print("What would you like to name your weapon?: ");
            String newWeaponName = scn.nextLine();
            System.out.println("Your weapons new name is " + newWeaponName);
            weapon.setWeaponName(newWeaponName);
        } else {
            System.out.println("You have decided to not name your weapon.");
        }
    }
}
