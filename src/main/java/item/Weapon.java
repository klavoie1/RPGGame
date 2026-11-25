package item;

import enums.ItemRarity;
import enums.WeaponType;

public class Weapon extends Item {

    private String weaponName;

    private final WeaponType weaponType;

    public Weapon(ItemRarity itemRarity, WeaponType weaponType) {
        super(labelFor(weaponType), itemRarity);
        this.weaponType = weaponType;
        this.weaponName = WeaponNames.POOL.randomName(weaponType, itemRarity);
    }

    public WeaponType getWeaponType() { return weaponType; }
    public String getWeaponName() { return weaponName; }
    public void setWeaponName(String weaponName) { this.weaponName = weaponName; }

    public int weaponDamage() { return getItemRarity().getAddition() + weaponType.getBaseDamage(); }

    /** The label is what the weapon is, e.g. "Sword". Checked here because it runs before super(). */
    private static String labelFor(WeaponType weaponType) {
        if (weaponType == null) throw new IllegalArgumentException("Weapon must have a type!");
        return weaponType.getTypeName();
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "label='" + getLabel() + '\'' +
                ", weaponName='" + weaponName + '\'' +
                ", weaponType=" + weaponType +
                '}';
    }
}
