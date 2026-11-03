package entity;

import enums.ItemRarity;
import enums.WeaponType;

public abstract class Weapon {

    private final String name;

    private final WeaponType weaponType;

    private final ItemRarity itemRarity;

    public Weapon(String name, WeaponType weaponType, ItemRarity itemRarity) {
        this.name = name;
        this.weaponType = weaponType;
        this.itemRarity = itemRarity;
    }

    public String getName() {
        return name;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public ItemRarity getItemRarity() {
        return itemRarity;
    }
}
