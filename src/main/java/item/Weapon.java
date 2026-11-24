package item;

import enums.ItemRarity;
import enums.WeaponType;

public class Weapon extends Item {

    private String weaponName;

    private final WeaponType weaponType;

    public Weapon(String label, ItemRarity itemRarity, WeaponType weaponType) {
        super(label, itemRarity);
        if (weaponType == null) throw new IllegalArgumentException("Weapon must have a type!");
        this.weaponType = weaponType;
        this.weaponName = randomName(weaponType, itemRarity);
    }

    public WeaponType getWeaponType() { return weaponType; }
    public String getWeaponName() { return weaponName; }
    public void setWeaponName(String weaponName) { this.weaponName = weaponName; }

    public int weaponDamage() { return getItemRarity().getAddition() + weaponType.getBaseDamage(); }

    private static String randomName(WeaponType weaponType, ItemRarity itemRarity) {
        if (weaponType == WeaponType.SWORD && itemRarity == ItemRarity.COMMON)
            return WeaponNameGenerator.getRandomCommonSwordName();
        return "Missed";
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "weaponName='" + weaponName + '\'' +
                ", weaponType=" + weaponType +
                '}';
    }
}
