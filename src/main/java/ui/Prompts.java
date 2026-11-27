package ui;

import enums.ClassType;
import enums.Race;
import item.Weapon;

import java.util.Objects;
import java.util.Scanner;

public final class Prompts {

    private Prompts() {}

    /**
     * Prompt for the player character to change their current weapons name.
     */
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

    /**
     * Prompt for the player character to enter their character name
     */
    public static String playerEnterName(Scanner scn) {
        System.out.print("Enter your character's name: ");
        return scn.nextLine();
    }

    /**
     * Prompt for the user to select their character class
     * @param scn User Input
     * @return ClassType
     */
    public static ClassType playerSelectCharacterClass(Scanner scn) {
        System.out.println("Select the class your character will be:");
        System.out.println("1) Mage\n2) Warrior\n3) Ranger");
        System.out.print("Selection: ");
        String playerSelection = scn.nextLine();
        return switch (playerSelection) {
            case ("1") -> ClassType.MAGE;
            case ("2") -> ClassType.WARRIOR;
            case ("3") -> ClassType.RANGER;
            default -> playerSelectCharacterClass(scn);
        };
    }

    public static Race playerSelectCharacterRace(Scanner scn) {
        System.out.println("Select the race of your character:");
        System.out.println("1) Human\n2) Orc\n3) Elf");
        System.out.print("Selection: ");
        String playerSelection = scn.nextLine();
        return switch (playerSelection) {
            case ("1") -> Race.HUMAN;
            case ("2") -> Race.ORC;
            case ("3") -> Race.ELF;
            default -> playerSelectCharacterRace(scn);
        };
    }
}
