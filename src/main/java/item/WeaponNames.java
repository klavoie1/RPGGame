package item;

import enums.ItemRarity;
import enums.WeaponType;

import java.util.Map;

/** Name lists for weapons. */
final class WeaponNames {

    static final NamePool<WeaponType> POOL = new NamePool<>(Map.of(
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
    ));

    private WeaponNames() {}
}
