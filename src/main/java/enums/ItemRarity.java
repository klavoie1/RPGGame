package enums;

public enum ItemRarity {
    COMMON("Common", 0),
    UNCOMMON("Uncommon", 1),
    RARE("Rare", 2),
    LEGENDARY("Legendary", 3);

    private final String rarity;
    private final int addition;

    ItemRarity(String rarity, int addition) {
        this.rarity = rarity;
        this.addition = addition;
    }

    public String getRarity() { return rarity; }

    public int getAddition() { return addition; }
}
