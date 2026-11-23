package enums;

import java.util.Random;

public enum WeaponType {
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
        Random random = new Random();
        int min = 1;
        int max = commonSwordNames.length;

        int indexNum = random.nextInt(min, max);
        return commonSwordNames[indexNum];
    }
}
