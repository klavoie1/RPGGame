package item;

import enums.ItemRarity;
import enums.WeaponType;

public class Weapon extends Item {

    private String weaponName;

    private final WeaponType weaponType;

    public Weapon(String label, ItemRarity itemRarity, WeaponType weaponType) {
        super(label, itemRarity);
        if (label == null || label.isBlank()) throw new IllegalArgumentException("Must have a label!");
        if (itemRarity == null) throw new IllegalArgumentException("Weapon must have a rarity!");
        if (weaponType == null) throw new IllegalArgumentException("Weapon must have a type!");
        this.weaponType = weaponType;
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

    @Override
    public String toString() {
        return "Weapon{" +
                "weaponName='" + weaponName + '\'' +
                ", weaponType=" + weaponType +
                '}';
    }
}
