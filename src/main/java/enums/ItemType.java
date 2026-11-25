package enums;

/**
 * Implemented by every item-type enum (WeaponType, and later ArmorType, PotionType, ...).
 * The type name is used as an item's label and as its name when no name list exists.
 */
public interface ItemType {
    String getTypeName();
}
