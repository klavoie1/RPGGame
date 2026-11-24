package ui;

import item.Weapon;

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
}
