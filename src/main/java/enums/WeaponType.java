package enums;

import java.util.Random;

public enum WeaponType {
    SWORD("Sword", 5),
    AXE("Axe", 3),
    BOW("Bow", 4);

    private final String weaponTypeName;
    private final int baseDamage;

    final Random random = new Random();

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

    private String[] commonSwordNames = {
            "Iron Sword",
            "Copper Sword",
            "Bronze Sword",
            "Rusty Sword",
            "Chipped Iron Sword",
            "Chipped Copper Sword",
            "Chipped Bronze Sword",
            "Chipped Rusty Sword"
    };

    private String[] uncommonSwordNames = {
            "Steel Sword",
            "Silver Sword",
            "Refined Steel Sword"
    };

    public String getRandomCommonSwordName() {
        int indexNum = random.nextInt(commonSwordNames.length);
        return commonSwordNames[indexNum];
    }
}
