package item;

import enums.ItemRarity;
import enums.WeaponType;

import java.util.Scanner;

public class Weapon extends Item {

    private String weaponName;

    private final WeaponType weaponType;

    public Weapon(String label, ItemRarity itemRarity, WeaponType weaponType, String weaponName) {
        super(label, itemRarity);
        if (label == null || label.isBlank()) throw new IllegalArgumentException("Must have a label!");
        if (itemRarity == null) throw new IllegalArgumentException("Weapon must have a rarity!");
        if (weaponType == null) throw new IllegalArgumentException("Weapon must have a type!");
        this.weaponType = weaponType;
        this.weaponName = weaponName;
        setWeaponName(giveWeaponARandomName());
    }

    public WeaponType getWeaponType() { return weaponType; }
    public String getWeaponName() { return weaponName; }
    public void setWeaponName(String weaponName) { this.weaponName = weaponName; }

    public int weaponDamage() { return getItemRarity().getAddition() + weaponType.getBaseDamage(); }

    public String giveWeaponARandomName() {
        if (weaponType == WeaponType.SWORD && getItemRarity() == ItemRarity.COMMON) {
            setWeaponName(WeaponType.SWORD.getRandomCommonSwordName());
        } else {
            setWeaponName("Missed");
        }
        return weaponName;
    }

    public void givePlayerSwordNameFromPlayer() {
        System.out.println("Would you Like to give your weapon a name?");
        System.out.print("Y/N: ");
        Scanner scn = new Scanner(System.in);
        String response = scn.nextLine();
        if (response.equalsIgnoreCase("y")) {
            System.out.print("What would you like to name your weapon?: ");
            String newWeaponName = scn.nextLine();
            System.out.println("Your weapons new name is " + newWeaponName);
            setWeaponName(newWeaponName);
        } else {
            System.out.println("You have decided to not name your weapon.");
        }
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "weaponName='" + weaponName + '\'' +
                ", weaponType=" + weaponType +
                '}';
    }
}
