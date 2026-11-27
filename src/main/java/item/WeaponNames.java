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
                            "Silver Sword"
                    },
                    ItemRarity.RARE, new String[]{
                            "Zolyx Sword",
                            "Meteorite Sword",
                            "Sharpened Steel Sword"
                    },
                    ItemRarity.LEGENDARY, new String[]{
                            "Dragon Bone Sword",
                            "Blood Steel Sword",
                            "Demonic Forged Sword"
                    }
            ),
            WeaponType.AXE, Map.of(
                    ItemRarity.COMMON, new String[]{
                            "Iron Axe",
                            "Copper Axe",
                            "Bronze Axe",
                            "Rusty Axe",
                            "Chipped Iron Axe",
                            "Chipped Copper Axe",
                            "Chipped Bronze Axe",
                            "Chipped Rusty Axe"
                    },
                    ItemRarity.UNCOMMON, new String[]{
                            "Steel Axe",
                            "Silver Axe"
                    },
                    ItemRarity.RARE, new String[]{
                            "Zolyx Axe",
                            "Meteorite Axe",
                            "Sharpened Steel Axe"
                    },
                    ItemRarity.LEGENDARY, new String[]{
                            "Dragon Bone Axe",
                            "Blood Steel Axe",
                            "Demonic Forged Axe"
                    }
            ),
            WeaponType.BOW, Map.of(
                    ItemRarity.COMMON, new String[]{

                    },
                    ItemRarity.UNCOMMON, new String[]{

                    },
                    ItemRarity.RARE, new String[]{

                    },
                    ItemRarity.LEGENDARY, new String[]{

                    }
            )
    ));

    private WeaponNames() {}
}
