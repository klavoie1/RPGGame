package item;

import enums.ItemRarity;
import enums.WeaponType;

public class Weapon extends Item {

    private final WeaponType weaponType;

    public Weapon(String label, ItemRarity itemRarity, WeaponType weaponType) {
        super(label, itemRarity);
        if (label == null || label.isBlank()) throw new IllegalArgumentException("Must have a label!");
        if (itemRarity == null) throw new IllegalArgumentException("Weapon must have a rarity!");
        if (weaponType == null) throw new IllegalArgumentException("Weapon must have a type!");

        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public int weaponDamage() {
       return getItemRarity().getAddition() + weaponType.getBaseDamage();
    }
}
