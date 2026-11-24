package item;

import enums.ItemRarity;
import enums.WeaponType;

import java.util.Map;
import java.util.Random;

public final class WeaponNameGenerator {

    private static final Random RANDOM = new Random();

    /**
     * Possible names for each weapon type and rarity. To add names, add an entry here;
     * any type/rarity without names falls back to the type name (e.g. "Axe").
     */
    private static final Map<WeaponType, Map<ItemRarity, String[]>> NAMES = Map.of(
            WeaponType.SWORD, Map.of(
                    ItemRarity.COMMON, new String[]{
                            "Iron Sword",
                            "Copper Sword",
                            "Bronze Sword",
                            "Rusty Sword",
                            "Chipped Iron Sword",
                            "Chipped Copper Sword",
                            "Chipped Bronze Sword",
                            "Chipped Rusty Sword"
                    },
                    ItemRarity.UNCOMMON, new String[]{
                            "Steel Sword",
                            "Silver Sword",
                            "Refined Steel Sword"
                    }
            )
    );

    private WeaponNameGenerator() {}

    public static String randomName(WeaponType type, ItemRarity rarity) {
        String[] options = NAMES.getOrDefault(type, Map.of()).get(rarity);
        if (options == null) return type.getTypeName();
        return options[RANDOM.nextInt(options.length)];
    }
}
