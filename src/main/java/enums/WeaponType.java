package enums;

public enum WeaponType{
    SWORD("Sword", 5),
    AXE("Axe", 3),
    BOW("Bow", 4);

    private final String weaponTypeName;
    private final int baseDamage;

    WeaponType(String weaponTypeName, int baseDamage) {
        this.weaponTypeName = weaponTypeName;
        this.baseDamage = baseDamage;
    }

    public String getWeaponName() {
        return weaponTypeName;
    }

    public int getBaseDamage() {
        return baseDamage;
    }
}
