package item;

import enums.ItemRarity;

public abstract class Item {

    private final String label;
    private final ItemRarity itemRarity;

    protected Item(String label, ItemRarity itemRarity) {
        if (label == null || label.isBlank()) throw new IllegalArgumentException("Item must have a label!");
        if (itemRarity == null) throw new IllegalArgumentException("Item must have a rarity!");
        this.label = label;
        this.itemRarity = itemRarity;
    }

    public String getLabel() { return label; }

    public ItemRarity getItemRarity() {
        return itemRarity;
    }
}
