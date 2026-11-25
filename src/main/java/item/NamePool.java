package item;

import enums.ItemRarity;
import enums.ItemType;

import java.util.Map;
import java.util.Random;

/**
 * Random names for one kind of item, keyed by its type and rarity.
 * Any type/rarity without names falls back to the type name (e.g. "Axe").
 *
 * @param <T> the item-type enum, e.g. WeaponType or ArmorType
 */
public final class NamePool<T extends Enum<T> & ItemType> {

    private static final Random RANDOM = new Random();

    private final Map<T, Map<ItemRarity, String[]>> names;

    public NamePool(Map<T, Map<ItemRarity, String[]>> names) {
        this.names = names;
    }

    public String randomName(T type, ItemRarity rarity) {
        String[] options = names.getOrDefault(type, Map.of()).get(rarity);
        if (options == null || options.length == 0) return type.getTypeName();
        return options[RANDOM.nextInt(options.length)];
    }
}
