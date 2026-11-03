package enums;

public enum ItemRarity {
    COMMON("Common"),
    UNCOMMON("Uncommon"),
    RARE("Rare"),
    LEGENDARY("Legendary");

    private final String rarity;

    ItemRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getRarity() { return rarity; }
}
