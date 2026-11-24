package item;

import java.util.Random;

public final class WeaponNameGenerator {

    private static final Random RANDOM = new Random();

    private WeaponNameGenerator() {}

    private static final String[] COMMON_SWORD_NAMES = {
            "Iron Sword",
            "Copper Sword",
            "Bronze Sword",
            "Rusty Sword",
            "Chipped Iron Sword",
            "Chipped Copper Sword",
            "Chipped Bronze Sword",
            "Chipped Rusty Sword"
    };

    private static final String[] UNCOMMON_SWORD_NAMES = {
            "Steel Sword",
            "Silver Sword",
            "Refined Steel Sword"
    };

    public static String getRandomCommonSwordName() {
        int indexNum = RANDOM.nextInt(COMMON_SWORD_NAMES.length);
        return COMMON_SWORD_NAMES[indexNum];
    }
}
