package enums;

public enum WeaponType {
    SWORD("Sword", 5),
    AXE("Axe", 3),
    BOW("Bow", 4);

    private final String weaponName;
    private final int baseDamage;

    WeaponType(String weaponName, int baseDamage) {
        this.weaponName = weaponName;
        this.baseDamage = baseDamage;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public int getBaseDamage() {
        return baseDamage;
    }
}
